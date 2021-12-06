package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private final Logger logger = LoggerFactory.getLogger("player");

    @Override
    public long askNextGuess() {
//        logger.log("Entrez un nb");
        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        return nb;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) {
            logger.log("grand");
        } else {
            logger.log("petit");
        }
    }
}
