package study.org.carbohz.hangman.lib;

import java.io.InputStream;
import java.util.Scanner;

public class Game {
    public void start(final InputStream source) {

        final Scanner scanner = new Scanner(source);

        System.out.println("Введите слово");
        final String secretWord = scanner.nextLine();

        WordGuesser wordGuesser = new WordGuesser(secretWord);
        WordDisplayer wordDisplayer = new WordDisplayer(secretWord);
        GameProgressObserver observer = new GameProgressObserver(6);

        while (observer.stillAlive() && !wordGuesser.wordGuessed()) {
            System.out.println("Введите букву");
            final char letter = scanner.next().charAt(0);

            boolean guessed = wordGuesser.guessLetter(letter);
            if (!guessed) {
                observer.decreaseAttempts();
                System.out.println("Осталось попыток " + observer.getAttemptLeft());
            } else {
                wordDisplayer.openLetter(letter);
            }
            System.out.println(wordDisplayer.displayWord());

//            boolean wordGuessed = wordGuesser.wordGuessed();
        }
    }
}
