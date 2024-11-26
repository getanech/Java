public class Disc {
    public static void main(String[] args) {
        Song songs0 = new Song("Song 1", "Artist A", 6);
        Song songs1 = new Song("Song 2", "Artist B", 5);
        Song songs2 = new Song("Song 3", "Artist C", 7);
        Song[] songs3 = {songs0};
        Disc disc1 = new Disc("Avrham", songs3);

        Song songs4 = new Song("Song 4", "Artist D", 12);
        Song[] songs5 = {songs4};
        Disc disc2 = new Disc("nati", songs5);

        String largerDisc = largeDiscName(disc1, disc2);
        System.out.println("The disc with more songs is: " + largerDisc);


    }

    String discName;
    Song[] songs;

    public Disc(String discName, Song[] songs) {
        this.discName = discName;
        this.songs = songs;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public boolean exist(String nSong, String pSong) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].name.equals(nSong) && songs[i].preformer.equals(pSong)) {
                return true;
            }
        }
        return false;
    }

    public static String largeDiscName(Disc d1, Disc d2) {
        if (d1.getSongs().length > d2.getSongs().length) {
            return d1.getDiscName();
        }
        return d2.getDiscName();
    }
}
