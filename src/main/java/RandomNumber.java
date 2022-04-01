import java.util.Random;

public class RandomNumber {
    private final static int MAX_BOUND = 10;
    private final int number;

    public RandomNumber() {
        int randomNumber = new Random().nextInt(MAX_BOUND);
        if (!ValidationUtils.isValidRandomNo(randomNumber)){
            throw new IllegalArgumentException("범위 밖의 랜덤 숫자.");
        }
        this.number = randomNumber;
    }


    public boolean greaterThan(int number) {
        return this.number >= number;
    }

    public boolean lessThan(int number) {
        return this.number <= number;
    }
}
