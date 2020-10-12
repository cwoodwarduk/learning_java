package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String albumTitle;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumTitle, String artist) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double duration) {
        if(findSong(songTitle) == null) {
            this.songs.add(new Song(songTitle, duration));
            return true;
        }

        return false;
    }

    private Song findSong(String songTitle) {
        // Foreach syntax in Java
        for(Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(songTitle)){
                return checkedSong;
            }
        }

        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;

        if (index >= 0 && index <= this.songs.size()) {
            playlist.add(this.songs.get(index));
            return true;
        }

        System.out.println("This album does not have that track.");
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        Song checkedSong = findSong(title);

        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("This song is not in this album.");
        return false;
    }

    public boolean removeFromPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);

        if(checkedSong != null) {
            playlist.remove(checkedSong);
            return true;
        }

        System.out.println("This song is not in this album.");
        return false;
    }
}
