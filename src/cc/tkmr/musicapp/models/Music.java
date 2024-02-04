package cc.tkmr.musicapp.models;

public class Music extends Audio {
        private String artist;
        private String album;
        private String genre;
        private String year;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public double getRating() {
        return 5 * this.getLikesCount() / this.getTotalReproductionCount();
    }
}
