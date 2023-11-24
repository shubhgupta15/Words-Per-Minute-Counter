/**
 *
 * @author shubh
 */

    
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class mainClass {

    static String[] words = 
    {
        "relative",
        "attitude",
        "ridge",
        "influence",
        "recommendation",
        "reporter",
        "scrap",
        "facade",
        "tragedy",
        "layer",
        "score",
        "cut",
        "enlarge",
        "honest",
        "compose"
    };

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println(3);
        TimeUnit.SECONDS.sleep(1);

        System.out.println(2);
        TimeUnit.SECONDS.sleep(1);
        
        System.out.println(1);
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();

        for (int i = 0; i < 10; i++)
        {
            System.out.print(words[rand.nextInt(9)] + " ");
        }

        System.out.println();

        Scanner scan = new Scanner(System.in);
        double start = LocalTime.now().toNanoOfDay();

        String typedWords = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elaspedTime = end - start;
        double seconds = elaspedTime/1000000000.0;

        int numChars = typedWords.length();
        int wpm = (int) ((((double) numChars / 5) / seconds) * 60);

        System.out.println("Your WPM is " + wpm);

        scan.close();
    }
}
