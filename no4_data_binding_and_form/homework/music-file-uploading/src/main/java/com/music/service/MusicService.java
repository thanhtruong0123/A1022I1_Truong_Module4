package com.music.service;

import com.music.model.MusicGenre;
import com.music.model.Song;

import java.util.List;

public interface MusicService {
    //MusicGenre
    List<MusicGenre> showMusicGenreList();

    //Song
    List<Song> showSonglist();
    void uploadSong(Song song);
}
