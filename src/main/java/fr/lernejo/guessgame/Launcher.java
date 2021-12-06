package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Argument : " + args[0]);
        SecureRandom random = new SecureRandom();
        long number = random.nextInt(100);
        if (args[0].equals("-interactive")) {
            Simulation sim = new Simulation(new HumanPlayer());
            sim.initialize(number, 999);
            sim.loopUntilPlayerSucceed((int)Long.MAX_VALUE);
        } else if (args[0].equals("-auto")) {
            Simulation sim = new Simulation(new ComputerPlayer());
            sim.initialize(number, 1000);
            sim.loopUntilPlayerSucceed(1000);
        } else {
            System.out.println("Choisir un mode -interactive ou -auto");
        }
    }
}
