package lesson9.musicplayer;

public class Podcast implements AudioTrack {

    private String title;
    private String artist;
    private int duration;
    private String genre;
    private int rating;
    private String host;

    public Podcast(String title, String artist, int duration,
                   String genre, int rating, String host) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        setRating(rating);
        this.host = host;
    }

    @Override public String getTitle()    { return title; }
    @Override public String getArtist()   { return artist; }
    @Override public int getDuration()    { return duration; }
    @Override public String getGenre()    { return genre; }
    @Override public int getRating()      { return rating; }

    @Override
    public void setRating(int rating) {
        if (rating < 1) {
            this.rating = 1;
        } else if (rating > 5) {
            this.rating = 5;
        } else {
            this.rating = rating;
        }
    }

    public String getHost() { return host; }

    @Override
    public String toString() {
        return "Podcast{" + title + " — " + artist
                + ", " + duration + " сек, жанр: " + genre
                + ", рейтинг: " + rating + ", ведущий: " + host + "}";
    }
}
