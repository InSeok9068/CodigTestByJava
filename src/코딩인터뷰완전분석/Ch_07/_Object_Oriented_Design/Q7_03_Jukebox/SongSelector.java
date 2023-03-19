package Q7_03_Jukebox;


public class SongSelector {
    private Q7_03_Jukebox.Song currentSong;

    public SongSelector(Q7_03_Jukebox.Song s) {
        currentSong = s;
    }

    public void setSong(Q7_03_Jukebox.Song s) {
        currentSong = s;
    }

    public Q7_03_Jukebox.Song getCurrentSong() {
        return currentSong;
    }
}

