package WIllson;

public class Main {
    public static void main(String[] args) {

            Playlist playlist = new Playlist();
            playlist.add(new Song("Brown Sugar", "Rolling stones"));
            playlist.add(new Movie("Casablanca"));
            playlist.add(new Movie("Matrix"));
            playlist.add(new Movie("Chernobyl"));
            playlist.add(new Movie("Terminator"));
            Playlist playlist2 = new Playlist();
            playlist2.add(new Song("O bladi o blada", "Beatles"));
            playlist2.add(new Movie("Killer"));


            playlist.add(playlist2);
            playlist.setPlayMode(PlayMode.RANDOMLY);
            playlist.play();

    }
}
