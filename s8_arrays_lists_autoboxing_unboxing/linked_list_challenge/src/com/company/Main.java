package com.company;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album empath = new Album("Empath", "Devin Townsend");
        empath.addSong("Genesis", 9.6);
        empath.addSong("Spirits Collide", 5.3);
        empath.addSong("Why", 4.4);
        albums.add(empath);

        Album darkMatter = new Album("Dark Matter", "Moses Boyd");
        darkMatter.addSong("Rye Lane Shuffle", 6.04);
        darkMatter.addSong("2 Far Gone", 5.6);
        albums.add(darkMatter);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Genesis", playlist);
        albums.get(0).addToPlaylist("Spirits Collide", playlist);
        albums.get(1).addToPlaylist(2, playlist);

        play(playlist);

    }

//    private static boolean addToPlaylist(LinkedList<Song> playlist, String albumTitle, String songTitle) {
//        ListIterator<Song> playlistIterator = playlist.listIterator();
//
//        while(playlistIterator.hasNext()){
//            int comparison = playlistIterator.next().compareTo(newCity);
//
//            if(comparison == 0){
//                System.out.println(newCity + " is already included.");
//                return false;
//            } else if(comparison > 0){
//                stringListIterator.previous();
//                stringListIterator.add(newCity);
//                return true;
//            } else if(comparison < 0){
//
//            }
//
//        }
//
//        stringListIterator.add(newCity);
//        return true;
//    }

    private static void printPlaylist(LinkedList<Song> playlist) {

        for (Song song : playlist) {
            System.out.println("Song title: " + song.getTitle() + " | Duration: " + song.getDuration() + ".");
        }

        System.out.println(" *********** ");
    }


    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        printMenu();

        boolean quit = false;
        boolean goingForward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        String currentSongTitle = "";
        int currentSongIndex = -1;

        if(playlist.isEmpty()) {
            System.out.println("No songs in playlist.");
            return;
        } else {
            currentSongTitle = listIterator.next().getTitle();
            currentSongIndex = 0;
            System.out.println("Now playing " + currentSongTitle);
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playback finished.");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if(listIterator.hasNext()){
                        currentSongTitle = listIterator.next().getTitle();
                        currentSongIndex++;
                        System.out.println("Now playing " + currentSongTitle);
                    } else {
                        System.out.println("Reached the end of the playlist.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if(listIterator.hasPrevious()){
                        currentSongIndex--;
                        currentSongTitle = listIterator.previous().getTitle();
                        System.out.println("Now playing " + currentSongTitle);
                    } else {
                        System.out.println("We are at the start of the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if(playlist.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
                case 4:
                    printPlaylist(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + action);
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to stop playing music.\n" +
                "1 - go to next track.\n" +
                "2 - go to previous track.\n" +
                "3 - remove current song from playlist.\n" +
                "4 - print playlist" +
                "5 - print menu options.");
    }

}
