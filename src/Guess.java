import java.util.ArrayList;
import java.util.Scanner;

public class Guess {

    // arrays and variables
    private ArrayList displayedWord = new ArrayList<>();
    private ArrayList targetWord = new ArrayList();
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

    public void setDisplayedWord(ArrayList displayedWord) {
        this.displayedWord = displayedWord;
    }

    public void setTargetWord(ArrayList targetWord) {
        this.targetWord = targetWord;
    }

    public void updateDisplayedWord(ArrayList currentGuess, int index, char mod) {
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
            displayedWord.add(" _ ");
            targetWord.add(word.charAt(i));
        }
        return displayedWord.toString();
    }

    public String getDisplayedWord() {
        String userDisplay = "";
        for (int i = 0; i < displayedWord.size(); i++) {
            userDisplay += displayedWord.get(i);
        }
        return userDisplay;
    }

    public String getTargetWord() {
        String userDisplay = "";
        for (int i = 0; i < targetWord.size(); i++) {
            userDisplay += targetWord.get(i);
        }
        return userDisplay;
    }

    public void checkGuess() {
        System.out.println("Enter a letter");
        String userInput = scanner.nextLine().toLowerCase();
        char guessedLetter = userInput.charAt(0);
        while (userInput.length()>1) {
            System.out.println("Only enter one letter");
            System.out.println("Please enter one letter");
            userInput = scanner.nextLine().toLowerCase();
        }

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

        guessedLetters.add(guessedLetter);

        for (int i = 0; i < (getTargetWord()).length(); i++) {
            if (getTargetWord().charAt(i) == userInput.charAt(0)) {
                updateDisplayedWord(displayedWord, i, userInput.charAt(0));
                correctGuess= true;
            }
        }
    }

    public boolean checkFinishGame() {
        String underscore = " _ ";
        return !getDisplayedWord().contains(underscore);
    }
}
