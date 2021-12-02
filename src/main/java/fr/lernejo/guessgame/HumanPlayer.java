package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private final Logger logger = LoggerFactory.getLogger("player");

    @Override
    public long askNextGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your next guess is ?");
        int nb = scanner.nextInt();
        return nb;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
