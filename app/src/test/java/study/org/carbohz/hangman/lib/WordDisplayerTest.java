package study.org.carbohz.hangman.lib;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordDisplayerTest {

    @Test
    void getMaskedWord() {
        final String secretWord = "football";
        final WordDisplayer displayer = new WordDisplayer(secretWord);

        assertThat(displayer.displayWord())
                .isEqualTo("_ _ _ _ _ _ _ _");

        displayer.openLetter('l');
        assertThat(displayer.displayWord())
                .isEqualTo("_ _ _ _ _ _ l l");

        displayer.openLetter('y');
        assertThat(displayer.displayWord())
                .isEqualTo("_ _ _ _ _ _ l l");

        displayer.openLetter('f');
        assertThat(displayer.displayWord())
                .isEqualTo("f _ _ _ _ _ l l");
    }
}