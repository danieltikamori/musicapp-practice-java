package cc.tkmr.musicapp.main;

import cc.tkmr.musicapp.models.Music;
import cc.tkmr.musicapp.models.MyFavorites;
import cc.tkmr.musicapp.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        music.setArtist("Artist");
        music.setTitle("Title");

        for (int i = 0; i < 10000; i++) {
            music.playTitle();
        }

        for (int i = 0; i < 1000; i++) {
            music.likeTitle();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("Podcast");
        podcast.setPodcastHost("Host");

        for (int i = 0; i < 10000; i++) {
            podcast.playTitle();
        }

        for (int i = 0; i < 8000; i++) {
            podcast.likeTitle();
        }

        MyFavorites myFavorites = new MyFavorites();
        myFavorites.addFavorite(music);
        System.out.println(music.getRating());
        myFavorites.addFavorite(podcast);
        System.out.println(podcast.getRating());

    }
}
