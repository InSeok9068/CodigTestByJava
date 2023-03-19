package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_03_Jukebox;

import java.util.Queue;

public class Playlist {
    private final Song song;
    private final Queue<Song> queue;

    public Playlist(Song song, Queue<Song> queue) {
        super();
        this.song = song;
        this.queue = queue;
    }

    public Song getNextSongToPlay() {
        return queue.peek();
    }

    public void queueUpSong(Song s) {
        queue.add(s);
    }
}

