import java.util.ArrayList;

public class Guess {

    // arrays and variables
    private ArrayList currentGuess = new ArrayList<>();
    private ArrayList currentWord = new ArrayList();
    private int guessCount = 10;
    private boolean correctGuess = false;

    // getters and setters
    public int getGuessCount() {
        return guessCount;
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

    // methods
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
}
