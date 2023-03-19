package Q7_03_Jukebox;

public class CDPlayer {
    private Q7_03_Jukebox.Playlist p;
    private Q7_03_Jukebox.CD c;

    public Q7_03_Jukebox.Playlist getPlaylist() {
        return p;
    }

    public void setPlaylist(Q7_03_Jukebox.Playlist p) {
        this.p = p;
    }

    public Q7_03_Jukebox.CD getCD() {
        return c;
    }

    public void setCD(Q7_03_Jukebox.CD c) {
        this.c = c;
    }

    public CDPlayer(Q7_03_Jukebox.Playlist p) {
        this.p = p;
    }

    public CDPlayer(Q7_03_Jukebox.CD c, Q7_03_Jukebox.Playlist p) {
        this.p = p;
        this.c = c;
    }

    public CDPlayer(Q7_03_Jukebox.CD c) {
        this.c = c;
    }

    public void playSong(Q7_03_Jukebox.Song s) {
    }
}
