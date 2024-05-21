import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class WordsTest {

    @Test
    public void testGetRandomWord() {
        Words words = new Words();
        String randomWord = words.getRandomWord();
        assertNotNull(randomWord);
        assertFalse(randomWord.isEmpty());
        assertTrue(words.getWordsList().contains(randomWord));
    }
}