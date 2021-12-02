package fr.lernejo.guessgame;

public class ComputerPlayer implements Player{

    private long min = 0;
    private long max = Long.MAX_VALUE;
    private long guess;
    @Override
    public long askNextGuess() {
        guess = (min + max) / 2;
        System.out.println("guess : " + guess);
        return guess;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) {
            System.out.println("plus petit");
            min = guess;
        } else {
            System.out.println("plus grand");
            max = guess;
        }
    }
}
