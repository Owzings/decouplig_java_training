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

    public void initialize(long numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        nb = scanner.nextInt();
        if (nb == this.numberToGuess) {
            System.out.println("Trouve");
            return true;
        } else if (nb > this.numberToGuess) {
            logger.log("Plus petit");
            return false;
        } else if (nb < this.numberToGuess) {
            logger.log("Plus grand");
            return false;
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        while (this.nb != this.numberToGuess) {
            this.nextRound();
        }
    }
}
