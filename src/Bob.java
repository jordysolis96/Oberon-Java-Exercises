import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        bob();
    }

    public static void bob(){
        Scanner scan = new Scanner(System.in);
        System.out.println("say something to bob!");
        String userInput = scan.nextLine();
        if(userInput.endsWith("?")){
            System.out.println("Bob: Sure");
        }else if(userInput.endsWith("!")){
            System.out.println("Whoa, chill out!");
        }else if(userInput.isEmpty()){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever");
        }
        System.out.println("Would you like to talk to bob again?[Y/N]");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("y")){
            bob();
        }else if(input.equalsIgnoreCase("yes")){
            bob();
        }else{
            System.out.println("Later!");
            System.exit(0);
        }
    }

}
