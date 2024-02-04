package cc.tkmr.musicapp.models;

public class Podcast extends Audio {
        private String podcastHost;
        private String podcastEpisodeDescription;

    public String getPodcastHost() {
        return podcastHost;
    }

    public void setPodcastHost(String podcastHost) {
        this.podcastHost = podcastHost;
    }

    public String getPodcastEpisodeDescription() {
        return podcastEpisodeDescription;
    }

    public void setPodcastEpisodeDescription(String podcastEpisodeDescription) {
        this.podcastEpisodeDescription = podcastEpisodeDescription;
    }

    @Override
    public double getRating() {
        if (this.getTotalReproductionCount() > 0) {
            return 5  * this.getLikesCount() / this.getTotalReproductionCount();
        } else {
            return 0;
        }
    }

}
