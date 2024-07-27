package study.org.carbohz.hangman.lib;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

class GameTest {

    @Test
    void start() {
        final Game game = new Game();
        final String secretWord = "football";

        final String guess1 = "f";
        final String guess2 = "o";
        final String guess3 = "t";
        final String guess4 = "b";
        final String guess5 = "a";
        final String guess6 = "l";

        final String lineSeparator = System.lineSeparator();
        final String sequence = String.join(lineSeparator, List.of(secretWord,
                guess1, guess2, guess3, guess4, guess5, guess6));

        final InputStream stream = new ByteArrayInputStream(sequence.getBytes(StandardCharsets.UTF_8));
        game.start(stream);
    }
}