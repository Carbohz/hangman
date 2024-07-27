package study.org.carbohz.hangman.lib;

import java.util.HashSet;
import java.util.Set;

public class WordGuesser {

    private final String secretWord;
    private final Set<Character> correctLetters;

    private final Set<Character> usedLetters;

    public WordGuesser(final String secretWord) {
        this.secretWord = secretWord;
        this.correctLetters = new HashSet<>();
        for (int i = 0; i < secretWord.length(); ++i) {
            correctLetters.add(secretWord.charAt(i));
        }
        this.usedLetters = new HashSet<>();
    }

    public boolean isDuplicatedLetter(final char letter) {
        return usedLetters.contains(letter);
    }

    public boolean guessLetter(final char letter) {
        usedLetters.add(letter);

        return correctLetters.contains(letter);
    }

    public boolean wordGuessed() {
        return usedLetters.containsAll(correctLetters);
    }
}
