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
        System.out.println("You have 10 lives to guess the word (letters only), hard mode will cost 2 guesses for each wrong answer...");
        System.out.println("Good luck!");
        System.out.println("Press enter to begin");
        scanner.nextLine();
    }

    public boolean startNewGame() {
        System.out.println("Lets see if you can get it this time " + userName);
        System.out.println("Press enter to begin");
        scanner.nextLine();
        return true;
    }

    public boolean endGameWin() {
        System.out.println("Well done you correctly guessed the word");
        System.out.println("Would you like to play again (type yes or no)");
        String newGame = scanner.nextLine().toLowerCase();
        if(newGame.equals("yes")) {
            return startNewGame();
        } else if (newGame.equals("no")) {
            System.out.println("Thanks for playing!");
            return false;
        } else {
            System.out.println("I dont know what that meant but im going now, byeee");
            return false;
        }
    }

    public boolean endGameLoss() {
        System.out.println("Unlucky you didnt get it this time");
        System.out.println("Would you like to play again (type yes or no)");
        String newGame = scanner.nextLine().toLowerCase();
        if(newGame.equals("yes")) {
            return startNewGame();
        } else if (newGame.equals("no")) {
            System.out.println("Thanks for playing!");
            return false;
        } else {
            System.out.println("I dont know what that meant but im going now, byeee");
            return false;
        }
    }
}
