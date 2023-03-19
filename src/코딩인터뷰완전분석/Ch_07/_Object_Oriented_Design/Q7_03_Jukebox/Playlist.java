package Q7_03_Jukebox;

import java.util.Queue;

public class Playlist {
    private final Q7_03_Jukebox.Song song;
    private final Queue<Q7_03_Jukebox.Song> queue;

    public Playlist(Q7_03_Jukebox.Song song, Queue<Q7_03_Jukebox.Song> queue) {
        super();
        this.song = song;
        this.queue = queue;
    }

    public Q7_03_Jukebox.Song getNextSongToPlay() {
        return queue.peek();
    }

    public void queueUpSong(Q7_03_Jukebox.Song s) {
        queue.add(s);
    }
}

