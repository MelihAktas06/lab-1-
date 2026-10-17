/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        Melih Aktas
 * Student ID:  240444029
 * Date:        17/10/2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // TODO: Create one Track object using EACH of the four constructors.
        //       Print each track's toString() result.
        //       Also test getDurationFormatted() and individual getters.
        //       Test the invalid-duration case (negative value).

        // --- Default constructor ---
        System.out.println("Default Track: ");
        Track t1 = new Track();
        System.out.println(t1.toString());
        System.out.println();

        // --- Title-only constructor ---
        System.out.println("Title-only track:");
        Track t2 = new Track("Neon Lights");
        System.out.println(t2.toString());
        System.out.println();

        // --- Title + artist constructor ---
        System.out.println("Title + Artist Track:");
        Track t3 = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println(t3.toString());
        System.out.println();

        // --- Full constructor ---
        System.out.println("Full Track (non-explicit):");
        Track t4 = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println(t4.toString());
        System.out.println();

        // --- Invalid duration test ---
        System.out.println("Invalid Duration Test:");
        Track t5 = new Track("Broken Clock", "Static Noise", -10, false);
        System.out.println(t5.toString());
        System.out.println();

        // --- Getter test ---
        Track t6 = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Getter Test:");
        System.out.println("Title:     " + t6.getTitle());
        System.out.println("Artist:    " + t6.getArtist());
        System.out.println("Duration:  " + t6.getDurationFormatted());
        System.out.println("Explicit:  " + t6.isExplicit());

    }
}
