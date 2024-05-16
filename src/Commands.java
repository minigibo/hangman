import java.util.*;

public class Commands {
    private Scanner scanner = new Scanner(System.in);
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void startGame() {
        System.out.println("Welcome to hangman whats your name?");
        String userName = scanner.nextLine();
        setUserName(userName);
        System.out.println("Hello " + userName + " let's play hangman");
        System.out.println("You have 10 lives to guess the word (letters only)");
        System.out.println("Good luck!");
        System.out.println("Press enter to begin");
        scanner.nextLine();
    }

    public void startNewGame() {
        System.out.println("Lets see if you can get it this time " + userName);
        System.out.println("Press enter to begin");
        scanner.nextLine();
    }

    public void endGameWin() {
        System.out.println("Well done you correctly guessed the word");
        System.out.println("Would you like to play again (type yes or no)");
        String newGame = scanner.nextLine().toLowerCase();
        if(newGame.equals("yes")) {
            startNewGame();
        } else if (newGame.equals("no")) {
            System.out.println("Thanks for playing!");
        } else {
            System.out.println("I dont know what that meant but im going now, byeee");
        }
    }

    public void endGameLoss() {
        System.out.println("Unlucky you didnt get it this time");
        System.out.println("Would you like to play again (type yes or no)");
        String newGame = scanner.nextLine().toLowerCase();
        if(newGame.equals("yes")) {
            startNewGame();
        } else if (newGame.equals("no")) {
            System.out.println("Thanks for playing!");
        } else {
            System.out.println("I dont know what that meant but im going now, byeee");
        }
    }
}
