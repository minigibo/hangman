public class Main {
    public static void main(String[] args) {
        Words words = new Words();
        Input input = new Input();
        Guess guess = new Guess();

        input.startGame();
        String randomWord = words.getRandomWord();
        System.out.println(randomWord);
        guess.displayInitial(randomWord);
        System.out.println(guess.getCurrentGuess());
    }
}
