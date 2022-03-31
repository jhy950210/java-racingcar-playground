import java.util.Random;

public class RandomNumber {
    private final static int MAX_BOUND = 10;
    private final int number;

    public RandomNumber() {
        Random random = new Random();
        this.number = random.nextInt(MAX_BOUND);
    }

    public int getNumber() {
        return number;
    }

    public boolean greaterThan(int forwardNumber) {
        return number >= forwardNumber;
    }
}
