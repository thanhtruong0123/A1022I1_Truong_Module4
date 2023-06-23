package com.music.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class Song {
    private int id;
    private String title;
    private String artist;
    private List<MusicGenre> musicGenreList;
    private String fileUpload;

    public Song() {
    }

    public Song(int id, String title, String artist, List<MusicGenre> musicGenreList, String fileUpload) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.musicGenreList = musicGenreList;
        this.fileUpload = fileUpload;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<MusicGenre> getMusicGenreList() {
        return musicGenreList;
    }

    public void setMusicGenreList(List<MusicGenre> musicGenreList) {
        this.musicGenreList = musicGenreList;
    }

    public String getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(String fileUpload) {
        this.fileUpload = fileUpload;
    }
}
