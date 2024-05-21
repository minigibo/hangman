public class HardHangman extends BaseGame{
    @Override
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

        if (!correctGuess) {
            guessCount -= 1;
        }
    }
}
