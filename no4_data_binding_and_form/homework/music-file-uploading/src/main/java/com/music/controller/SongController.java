package com.music.controller;

import com.music.model.Song;
import com.music.service.MusicService;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

@Controller
@RequestMapping("/music")
public class SongController {
    @Value("${file-upload}")
    private String fileUpload;
    private MusicService musicService;

    public SongController(MusicService musicService) {
        this.musicService = musicService;
    }

    @GetMapping("/")
    public String formUploadMusic(Model model) {
        model.addAttribute("song", new Song());
        model.addAttribute("genreList", musicService.showMusicGenreList());
        return "upload-form";
    }

    @PostMapping("/upload")
    public String uploadSong(@ModelAttribute("song") Song song, @RequestParam("file") MultipartFile file, Model model) {
        // Kiểm tra đuôi file hợp lệ
        String[] allowedExtensions = { ".mp3", ".wav", ".ogg", ".m4p" };
        boolean isValidFile = Arrays.stream(allowedExtensions).anyMatch(ext -> file.getOriginalFilename().endsWith(ext));

        if(!isValidFile) {
            model.addAttribute("errorMessage", "Đuôi file không hợp lệ. Vui lòng chọn file .mp3, .wav, .ogg, hoặc .m4p.");

            return "upload-form";
        }

        // Tạo đường dẫn lưu file
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String filePath = fileUpload + fileName;

        // Lưu file bài hát
        try {
            Path path = Paths.get(filePath);
            Files.write(path, file.getBytes());
        } catch (IOException e) {
            model.addAttribute("errorMessage", "Đã xảy ra lỗi khi lưu file.");
            return "upload-form";
        }

        // Lưu đường dẫn file vào đối tượng song
        song.setFileUpload(filePath);

        // Thêm bài hát vào danh sách đã upload
        musicService.uploadSong(song);
        return "redirect:/song-list";
    }

    @GetMapping("/song-list")
    public String showSongList(Model model) {
        model.addAttribute("songList", musicService.showSonglist());
        return "/music/song-list";
    }
}
