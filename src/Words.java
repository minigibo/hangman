import java.util.*;

public class Words {
    private ArrayList<String> words = new ArrayList<>(
            List.of("Computer", "Hangman", "Programming", "Keyboard", "Algorithm",
                    "Variable", "Software", "Function", "Debugging", "Syntax"));

    private Random random = new Random();

    public String getRandomWord() {
        return words.get(random.nextInt(words.size()));
    }
}
