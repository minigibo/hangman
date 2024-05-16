import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guess {

    // arrays and variables
    private ArrayList currentGuess = new ArrayList<>();
    private ArrayList currentWord = new ArrayList();
    private ArrayList guessedLetters = new ArrayList();
    private int guessCount = 10;
    private boolean correctGuess = false;
    private Scanner scanner = new Scanner(System.in);

    // getters and setters
    public int getGuessCount() {
        return guessCount;
    }

    public ArrayList getGuessedLetters() {
        return guessedLetters;
    }

    public void setGuessCount(int guessCount) {
        this.guessCount = guessCount;
    }

    public void setCurrentGuess(ArrayList currentGuess) {
        this.currentGuess = currentGuess;
    }

    public void setCurrentWord(ArrayList currentWord) {
        this.currentWord = currentWord;
    }

    public void alterCurrentGuess(ArrayList currentGuess, int index, char mod) {
        currentGuess.set(index, mod);
    }

    // methods
    public void correctGuess() {
        if(!correctGuess) {
            guessCount -= 1;
            System.out.println("Unlucky " + guessCount + " guesses left");
        } else {
            System.out.println("Well done that was right");
            correctGuess = false;
        }
    }


    public String displayInitial(String word) {
        for (int i = 0; i < word.length(); i++) {
            currentGuess.add(" _ ");
            currentWord.add(word.charAt(i));
        }
        return currentGuess.toString();
    }

    public String getCurrentGuess() {
        String userDisplay = "";
        for (int i = 0; i < currentGuess.size(); i++) {
            userDisplay += currentGuess.get(i);
        }
        return userDisplay;
    }

    public String getCurrentWord() {
        String userDisplay = "";
        for (int i = 0; i < currentWord.size(); i++) {
            userDisplay += currentWord.get(i);
        }
        return userDisplay;
    }

    public void checkGuess() {
        System.out.println("Enter a letter");
        String userInput = scanner.nextLine().toLowerCase();
        char guessedLetter = userInput.charAt(0);
        while (guessedLetters.contains(guessedLetter)) {
            System.out.println("You have already entered this letter");
            System.out.println("Please enter a different letter");
            userInput = scanner.nextLine().toLowerCase();
            guessedLetter = userInput.charAt(0);
        }

        while (userInput.isEmpty() || userInput.matches(".*[0-9].*")) {
            System.out.println("Invalid input");
            System.out.println("Please enter valid letter");
            userInput = scanner.nextLine().toLowerCase();
        }

        while (userInput.length()>1) {
            System.out.println("Only enter one letter");
            System.out.println("Please enter one letter");
            userInput = scanner.nextLine().toLowerCase();
        }

        guessedLetters.add(guessedLetter);

        for (int i = 0; i < (getCurrentWord()).length(); i++) {
            if (getCurrentWord().charAt(i) == userInput.charAt(0)) {
                alterCurrentGuess(currentGuess, i, userInput.charAt(0));
                correctGuess= true;
            }
        }
    }

    public boolean checkFinishGame() {
        String underscore = " _ ";
        return !getCurrentGuess().contains(underscore);
    }
}
