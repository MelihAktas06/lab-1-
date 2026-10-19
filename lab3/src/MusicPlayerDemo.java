/**
 * MusicPlayerDemo.java
 *
 * Tests the playlist
 */
public class MusicPlayerDemo {

    public static void main(String[] args) {

        //create the playlist object
        MusicPlaylist myList = new MusicPlaylist();

        // Add songs
        myList.addSong("Shape of You - Ed Sheeran");
        myList.addSong("Save Me - BTS");
        myList.addSong("Snap - Manifest");
        myList.addSong("like JENNIE - JENNIE");

        System.out.println("=== PLAYLIST ===");
        myList.displayPlaylist();

        System.out.println("\n=== CURRENT SONG PLAYING ===");
        myList.displayCurrentSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        myList.nextSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        myList.nextSong();

        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        myList.previousSong();

        System.out.println("\n=== AFTER REMOVING Shape of You SONG ===");
        myList.removeSong("Shape of You - Ed Sheeran");
        myList.displayPlaylist();

        System.out.println("\n=== AFTER REMOVING Snap SONG ===");
        // remove the song called "Snap - Manifest" from the playlist 
        //Then display the Playlist
        myList.removeSong("Snap - Manifest");
        myList.displayPlaylist();

    }
}
