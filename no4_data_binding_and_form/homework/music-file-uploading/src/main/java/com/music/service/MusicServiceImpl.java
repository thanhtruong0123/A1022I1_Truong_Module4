package com.music.service;

import com.music.model.MusicGenre;
import com.music.model.Song;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {

    //MusicGenre
    private static List<MusicGenre> musicGenreList;

    static {
        musicGenreList = new ArrayList<>();
        musicGenreList.add(new MusicGenre(1, "Pop"));
        musicGenreList.add(new MusicGenre(2, "Country"));
        musicGenreList.add(new MusicGenre(3, "Metal"));
        musicGenreList.add(new MusicGenre(4, "Rock"));
        musicGenreList.add(new MusicGenre(5, "Blues"));
        musicGenreList.add(new MusicGenre(6, "Jazz"));
    }

    @Override
    public List<MusicGenre> showMusicGenreList() {
        return musicGenreList;
    }



    //Song
    private static List<Song> songList = new ArrayList<>();
    @Override
    public List<Song> showSonglist() {
        return songList;
    }
    @Override
    public void uploadSong(Song song) {
        songList.add(song);
    }
}
