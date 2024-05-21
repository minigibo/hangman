import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Words words = new Words();
        Commands commands = new Commands();
        BaseGame game;
        boolean playAgain;
        commands.startGame();
        Scanner scanner = new Scanner(System.in);

        do {
            String randomWord = words.getRandomWord();
            String difficultyInput;
            int difficulty = 0;
            System.out.println("Choose difficulty (type the number): Easy (1) or Hard (2)");
            difficultyInput = scanner.nextLine();
            while (!difficultyInput.equals("1") && !difficultyInput.equals("2")) {
                System.out.println("Invalid input. Please enter 1 for Easy or 2 for Hard.");
                difficultyInput = scanner.nextLine();
            }

            difficulty = Integer.parseInt(difficultyInput);
            if (difficulty == 1) {
                game = new EasyHangman();
            } else {
                game = new HardHangman();
            }

            game.displayInitial(randomWord);
            do {
                System.out.println(game.getDisplayedWord());
                game.checkGuess();
                System.out.println();
                game.correctGuess();
                System.out.println();
            } while (!game.checkFinishGame() && game.getGuessCount() > 0);

            if (game.getGuessCount() <= 0) {
               playAgain = commands.endGameLoss();
            } else {
               playAgain = commands.endGameWin();
            }
        } while (playAgain);
    }
}