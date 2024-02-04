package cc.tkmr.musicapp.models;

public class MyFavorites {
    public void addFavorite(Audio audio) {
        if (audio.getRating() >= 4.0) {
            System.out.println(audio.getTitle() + " that is a absolute hit has been added to my favorites");
        } else {
            System.out.println(audio.getTitle() + " that is not a hit has been added to my favorites");
        }
    }
}
