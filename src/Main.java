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
            System.out.println("Choose difficulty: Easy (1) or Hard (2)");
            int difficulty = scanner.nextInt();
            scanner.nextLine();

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