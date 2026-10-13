package lesson9.musicplayer;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private final List<AudioTrack> tracks = new ArrayList<>();

    public void addTrack(AudioTrack track) {
        if (track != null) {
            tracks.add(track);
            System.out.println("Добавлен трек: " + track.getTitle());
        }
    }

    public void removeTrack(AudioTrack track) {
        if (tracks.remove(track)) {
            System.out.println("Удалён трек: " + track.getTitle());
        } else {
            System.out.println("Трек не найден: " + track.getTitle());
        }
    }

    public List<AudioTrack> searchByTitle(String title) {
        List<AudioTrack> result = new ArrayList<>();
        for (AudioTrack t : tracks) {
            if (t.getTitle().equalsIgnoreCase(title)) {
                result.add(t);
            }
        }
        return result;
    }

    public List<AudioTrack> searchByArtist(String artist) {
        List<AudioTrack> result = new ArrayList<>();
        for (AudioTrack t : tracks) {
            if (t.getArtist().equalsIgnoreCase(artist)) {
                result.add(t);
            }
        }
        return result;
    }

    public List<AudioTrack> getTracksByGenre(String genre) {
        List<AudioTrack> result = new ArrayList<>();
        for (AudioTrack t : tracks) {
            if (t.getGenre().equalsIgnoreCase(genre)) {
                result.add(t);
            }
        }
        return result;
    }

    public void printPlaylist() {
        System.out.println("=== Плейлист (" + tracks.size() + " треков) ===");
        for (AudioTrack t : tracks) {
            System.out.println("  " + t);
        }
    }

    public int getTotalDuration() {
        int total = 0;
        for (AudioTrack t : tracks) {
            total += t.getDuration();
        }
        return total;
    }

    public List<AudioTrack> sortByRatingDesc() {
        List<AudioTrack> sorted = new ArrayList<>(tracks);
        for (int i = 0; i < sorted.size() - 1; i++) {
            for (int j = 0; j < sorted.size() - 1 - i; j++) {
                if (sorted.get(j).getRating() < sorted.get(j + 1).getRating()) {
                    AudioTrack temp = sorted.get(j);
                    sorted.set(j, sorted.get(j + 1));
                    sorted.set(j + 1, temp);
                }
            }
        }
        return sorted;
    }

    public List<AudioTrack> getTracks() {
        return tracks;
    }
}
