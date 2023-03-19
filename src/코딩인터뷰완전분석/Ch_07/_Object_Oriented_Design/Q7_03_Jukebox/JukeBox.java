package Q7_03_Jukebox;

import java.util.Set;

public class JukeBox {
    private final Q7_03_Jukebox.CDPlayer cdPlayer;
    private User user;
    private final Set<Q7_03_Jukebox.CD> cdCollection;
    private final Q7_03_Jukebox.SongSelector ts;

    public JukeBox(Q7_03_Jukebox.CDPlayer cdPlayer, User user, Set<Q7_03_Jukebox.CD> cdCollection,
                   Q7_03_Jukebox.SongSelector ts) {
        super();
        this.cdPlayer = cdPlayer;
        this.user = user;
        this.cdCollection = cdCollection;
        this.ts = ts;
    }

    public Q7_03_Jukebox.Song getCurrentSong() {
        return ts.getCurrentSong();
    }

    public void setUser(User u) {
        this.user = u;
    }
}
