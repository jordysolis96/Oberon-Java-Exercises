package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input() {
        this.scan = new Scanner(System.in);
    }

    public String getString(){
        return this.scan.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes or No?");
        String input = this.getString();
        return (input.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max){
        int num;

        do{
            System.out.printf("enter a integer between %d and %d%n", min, max);
            num = this.scan.nextInt();
        }while(num < min || num > max);
        return num;
    }

    public int getInt(){
        return this.scan.nextInt();
    }

    public double getDouble(double min, double max){
        double num;

        do{
            System.out.printf("enter a double between %.2f and %.2f%n", min, max);
                    num = this.scan.nextDouble();
        }while(num < min || num > max);
        return num;
    }

    public double getDouble(){
        return this.scan.nextDouble();
    }
}

