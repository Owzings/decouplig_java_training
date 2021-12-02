package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;
    private long nb;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess, long nbIter) {
        this.numberToGuess = numberToGuess;
        loopUntilPlayerSucceed(nbIter);
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        this.nb = player.askNextGuess();
        if (this.nb == this.numberToGuess) {
            logger.log("Trouve");
            return true;
        } else {
            player.respond(this.nb < this.numberToGuess);
        }
        return false;
    }

    public void loopUntilPlayerSucceed(long maxIter) {
        int counter = 0;
        long debut = System.currentTimeMillis();
        while (this.nb != this.numberToGuess || maxIter == counter) {
            counter = counter + 1;
            this.nextRound();
        }
        long fin = System.currentTimeMillis();
            long time = fin - debut;
            logger.log("Felicitations, vous avez trouve en " + time / 1000 + " s");
    }
}
