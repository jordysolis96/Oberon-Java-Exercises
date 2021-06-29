import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        System.out.println("guess a number from 1-100");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomNum;
        randomNum = random.nextInt(100) + 1;
        int guess = scan.nextInt();




        if (guess < randomNum) {
            System.out.println("HIGHER");
            game();
        } else if (guess > randomNum) {
            System.out.println("LOWER");
            game();
        } else {
            System.out.println("GOOD GUESS");
        }
    }
}
