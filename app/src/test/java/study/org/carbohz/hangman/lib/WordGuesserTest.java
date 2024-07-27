package study.org.carbohz.hangman.lib;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordGuesserTest {

    // f o o t b a l l
    // _ _ _ _ _ _ _ _

    // b
    // _ _ _ _ b _ _ _

    // z
    // _ _ _ _ b _ _ _

    // o
    // _ o o _ b _ _ _

    // l
    // _ o o _ b _ l l

    @Test
    void containsLetter() {
        final String secretWord = "football";
        final WordGuesser wordGuesser = new WordGuesser(secretWord);
        // f o o t b a l l
        // _ _ _ _ _ _ _ _
        assertThat(wordGuesser.guessLetter('b')).isTrue();
        // _ _ _ _ b _ _ _

        assertThat(wordGuesser.guessLetter('z')).isFalse();

    }

    @Test
    void foo() {
        // GameProgressObserver
    }
}