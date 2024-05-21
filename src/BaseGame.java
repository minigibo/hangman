import java.util.ArrayList;
import java.util.Scanner;

public abstract class BaseGame {

    // arrays and variables
    protected ArrayList displayedWord = new ArrayList<>();
    protected ArrayList targetWord = new ArrayList();
    protected ArrayList guessedLetters = new ArrayList();
    protected int guessCount = 10;
    protected boolean correctGuess = false;
    protected Scanner scanner = new Scanner(System.in);

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
    public abstract void checkGuess();

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



    public boolean checkFinishGame() {
        String underscore = " _ ";
        return !getDisplayedWord().contains(underscore);
    }
}
