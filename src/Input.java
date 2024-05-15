import java.util.*;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public void startGame() {
        System.out.println("Welcome to hangman whats your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + " let's play hangman");
        System.out.println("You have 10 lives to guess the word (letters only)");
        System.out.println("Good luck " + userName +"!");
        System.out.println("Press enter to begin");
        scanner.nextLine();
    }
}
