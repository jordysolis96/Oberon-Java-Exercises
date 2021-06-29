import java.util.Scanner;

public class MethodsExercise {

    public static void main(String[] args) {
        System.out.println(addition(1, 1));
        System.out.println(getInteger(1, 10));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(4, 8));
        System.out.println(division(10, 2));
        System.out.println(modulus(6, 3));
        Calculator();
    }

    public static int addition(int one, int two){
        return one + two;
    }

    public static int subtraction(int one, int two){
        return one - two;
    }

    public static int multiplication(int one, int two){
        return one * two;
    }

    public static double division(double one, double two){
        return one / two;
    }

    public static double modulus(double one, double two){
        return one % two;
    }

    public static int getInteger(int min, int max){
        Scanner scan = new Scanner(System.in);
        int num;

        do {
            System.out.printf("Enter a number between %d and %d:\n", min, max);
            num = scan.nextInt();

            if (num < min || num > max) {
                System.out.printf("%d is an invalid input.\n", num);
            } else {
                System.out.println("Great!");
                break;
            }
        } while (true);

        return num;
    }


    public static long factorial(int n) {
        if (n == 0) {
            return 1L;
        }

        long total = 1;

        for (int i = n; i > 1; i--) {
            total *= i;
        }

        return total;
    }

    public static void Calculator(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10:");
        int userNum = scan.nextInt();
        if(1 <= userNum && userNum <= 10){
            for(int i = 1; i <= userNum; i++){
                System.out.println(factorial(userNum));
            }
        }
    }


}
