package org.example.exercise45;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                System.out.println("Song already added");
                return false;
            }
        }
        Song newSong = new Song(title, duration);
        songs.add(newSong);
        return true;
    }

    private Song findSong(String title) {
        var iterator = songs.listIterator();
        while (!iterator.hasNext()) {
            if (iterator.next().getTitle().equals(title)) {
                return iterator.next();
            }
        }
        System.out.println("Song not found");
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        var songsIterator = songs.listIterator();
        var playlistIterator = playlist.listIterator();

        while (playlistIterator.hasNext()) {
            playlistIterator.next();
            if (playlistIterator.nextIndex() == trackNumber) {
                System.out.println("Song already in playlist");
                return false;
            }
        }
        while (songsIterator.hasNext()) {
            Song currentSong = songsIterator.next();
            if (songsIterator.nextIndex() == trackNumber) {
                System.out.println("Added song to playlist");
                playlistIterator.add(currentSong);
                return true;
            }
        }
        System.out.println("No song of given track number found");
        return false;
    }

    public boolean addToPlayList(String songName, LinkedList<Song> playlist) {
        var songsIterator = songs.listIterator();
        var playlistIterator = playlist.listIterator();

        while (playlistIterator.hasNext()) {
            Song currentSong = playlistIterator.next();
            if (currentSong.getTitle().equals(songName)) {
                System.out.println("Song already in playlist");
                return false;
            }
        }
        while (songsIterator.hasNext()) {
            Song song = songsIterator.next();
            if (song.getTitle().equals(songName)) {
                playlistIterator.add(song);
                System.out.println("Added song to playlist");
                return true;
            }
        }
        System.out.println("No song of given name found");
        return false;

    }
}
