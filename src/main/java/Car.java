public class Car {
    private static final int FORWARD_NUMBER = 4;
    private static final int START_POSITION = 0;

    private final Name name;
    private int position;

    public Car(final String carName) {
        this(carName,START_POSITION);
    }

    public Car(String carName, int position) {
        this.name = new Name(carName);
        this.position = position;
    }

    public void play() {
        RandomNumber number = new RandomNumber();
        if(number.greaterThan(FORWARD_NUMBER)){
            position += 1;
        }
    }

    public void play(int number) {
        if(number >= FORWARD_NUMBER){
            position += 1;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return this.name.getName();
    }
}
