public class Main {
    public static void main(String[] args) {
        Words words = new Words();
        Commands commands = new Commands();
        Guess guess = new Guess();

        commands.startGame();
        String randomWord = words.getRandomWord();
        guess.displayInitial(randomWord);
        do {

            System.out.println(guess.getDisplayedWord());
            guess.checkGuess();
            System.out.println();
            guess.correctGuess();
            System.out.println();
            guess.checkFinishGame();
        } while (!guess.checkFinishGame() && guess.getGuessCount() > 0);
        if(guess.getGuessCount() <= 0) {
           commands.endGameLoss();
        } else {
            commands.endGameWin();
        }
    }
}
