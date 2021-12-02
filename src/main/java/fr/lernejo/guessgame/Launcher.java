package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        Simulation sim = new Simulation(new HumanPlayer());
        SecureRandom random = new SecureRandom();
        long number = random.nextInt(100);
        sim.initialize(number);

    }
}