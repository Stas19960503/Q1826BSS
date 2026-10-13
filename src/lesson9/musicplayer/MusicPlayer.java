package lesson9.musicplayer;

import java.util.List;

public class MusicPlayer {
    public static void main(String[] args) {

        Song song1 = new Song("Bohemian Rhapsody", "Queen",
                355, "Rock", 5, "A Night at the Opera");
        Song song2 = new Song("Imagine", "John Lennon",
                183, "Rock", 4, "Imagine");
        Song song3 = new Song("Billie Jean", "Michael Jackson",
                294, "Pop", 5, "Thriller");

        Podcast podcast1 = new Podcast("Как стать программистом", "IT-подкаст",
                2400, "Образование", 4, "Иван Иванов");
        Podcast podcast2 = new Podcast("История рока", "Music Talks",
                1800, "Музыка", 3, "Пётр Петров");

        Playlist playlist = new Playlist();
        playlist.addTrack(song1);
        playlist.addTrack(song2);
        playlist.addTrack(song3);
        playlist.addTrack(podcast1);
        playlist.addTrack(podcast2);

        System.out.println();

        System.out.println("=== Поиск по названию \"Imagine\" ===");
        List<AudioTrack> byTitle = playlist.searchByTitle("Imagine");
        for (AudioTrack t : byTitle) {
            System.out.println("  " + t);
        }

        System.out.println("\n=== Поиск по исполнителю \"Queen\" ===");
        List<AudioTrack> byArtist = playlist.searchByArtist("Queen");
        for (AudioTrack t : byArtist) {
            System.out.println("  " + t);
        }

        System.out.println("\n=== Треки в жанре \"Rock\" ===");
        List<AudioTrack> byGenre = playlist.getTracksByGenre("Rock");
        for (AudioTrack t : byGenre) {
            System.out.println("  " + t);
        }

        System.out.println("\n=== Удаляем трек \"Imagine\" ===");
        playlist.removeTrack(song2);

        System.out.println();
        playlist.printPlaylist();

        System.out.println("\nОбщая длительность: " + playlist.getTotalDuration() + " секунд");

        System.out.println("\n=== Сортировка по рейтингу (от высокого к низкому) ===");
        List<AudioTrack> sorted = playlist.sortByRatingDesc();
        for (AudioTrack t : sorted) {
            System.out.println("  [" + t.getRating() + "] " + t.getTitle());
        }
    }
}
