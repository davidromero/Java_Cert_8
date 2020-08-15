import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeExam {

    public static void printStormName(String... names) {
        System.out.println(Arrays.toString(names));
    }

    public static void printStormNames(String[] names) {
        System.out.println(Arrays.toString(names));
    }

    public static void main(String[] args) {

        // Arrays -> .length
        // Strings -> .length()
        // ArrayList -> .size()

        // For each loop can only be used on array and ArrayList, StringBuilder is not allowed
        int i =args.length;

        String a = "";

        List<String> E = new ArrayList<>();
        a.length();

        printStormName("Arlene");
        printStormName(new String[]{"Ariana"});
        // printStormNames("Cindy"); Array of String is expected
        printStormNames(new String[]{"Don"});

        String[] nums = new String[]{"1", "9", "10"};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] os = new String[] { "Mac", "Linux", "Windows" };
        Arrays.sort(os);
        System.out.println(Arrays.binarySearch(os, "RedHat"));

        String[][] listing = new String[][] { { "Book" }, { "Game", "29.99" } };
        System.out.println(listing.length + " " + listing[0].length);

        loopToDebudg();
    }

    protected static void loopToDebudg(){
        System.out.println("----------- loopToDebudg()");
        int k = 0;
        for (int i2 = 10; i2 > 0; i2--) {
            while (i2 > 3) i2 -= 3;
            k += 1;
        }
        System.out.println(k);
    }
}
