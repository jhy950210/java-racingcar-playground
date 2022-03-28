import java.util.Random;

public class RandomNumber {
    private final int number;

    public RandomNumber() {
        this.number = (int)(Math.random() * 10);
    }

    public int getNumber() {
        return number;
    }
}
