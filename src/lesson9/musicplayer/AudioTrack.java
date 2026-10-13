package lesson9.musicplayer;

public interface AudioTrack {

    String getTitle();

    String getArtist();

    int getDuration();

    String getGenre();

    int getRating();

    void setRating(int rating);
}
