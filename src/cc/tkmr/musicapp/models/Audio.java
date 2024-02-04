package cc.tkmr.musicapp.models;

public class Audio {
    private String title;
    private double durationInMinutes;
    private double totalReproductionCount;
    private double likesCount;
    private double rating;


    // Getters and setters
    // Setters are used to set the values of the properties, so do not create setters for data that should not be changed by the user.
    // Plan ahead to avoid misusing getters and setters.

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public double getTotalReproductionCount() {
        return totalReproductionCount;
    }

    public double getLikesCount() {
        return likesCount;
    }

    public double getRating() {
        return rating;
    }

    public void likeTitle() {
        this.likesCount++;
    }

    public void playTitle() {
        this.totalReproductionCount++;
    }
}
