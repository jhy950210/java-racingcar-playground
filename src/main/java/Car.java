public class Car {
    private static final int FORWARD_NUMBER = 4;
    private static final int START_POSITION = 0;

    private final Name name;
    private int position;

    public Car(final String carName) {
        if(!ValidationUtils.isValidCarNameLength(carName)){
            throw new IllegalArgumentException("자동차 이름 길이 오류.");
        }

        this.name = new Name(carName);
        this.position = START_POSITION;
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

}
