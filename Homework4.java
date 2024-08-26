
package homework4;
import java.util.*;
public class Homework4{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        // play until user gets 3 wrong
        int points = 0;
        int wrong = 0;
        while (wrong < 3) {
            int result = play(console, rand); //play one game
            if (result > 0) {
                points++;
            } else {
                wrong++;
            }
        }
        System.out.println("You earned " + points + " total points.");
    }
    public static int play(Scanner console, Random rand) {
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        System.out.println(num1 + " + " + num2 + " = ");
        int result = console.nextInt();
        if (result == num1 + num2) {
            return 1;
        } else {
            return 0;
        }
    }
}
