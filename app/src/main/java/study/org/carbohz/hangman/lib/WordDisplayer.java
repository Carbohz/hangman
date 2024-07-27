package study.org.carbohz.hangman.lib;

import java.util.HashSet;
import java.util.Set;

public class WordDisplayer {

    private final String secretWord;
    private final Set<Character> guessedLetters;

    // f o o t b a l l

    public WordDisplayer(String secretWord) {
        this.secretWord = secretWord;
        this.guessedLetters = new HashSet<>();
    }

    public String displayWord() {
        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < secretWord.length(); ++i) {
            final char letter = getWordToken(i);
            sb.append(letter).append(' ');
        }

        return trimLastChar(sb);
    }

    private char getWordToken(int i) {
        char letter = secretWord.charAt(i);
        if (guessedLetters.contains(letter)) {
            return letter;
        } else {
            return '_';
        }
    }

    private String trimLastChar(final StringBuilder sb) {
        return sb.substring(0, sb.length() - 1);
    }

    public void openLetter(final char letter) {
        if (secretWord.contains(String.valueOf(letter))) {
            guessedLetters.add(letter);
        }
    }
}
