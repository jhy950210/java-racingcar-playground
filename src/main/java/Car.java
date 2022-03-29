public class Car {
    private static final int START_POSITION = 0;

    private final String name;
    private int position;

    public Car(String carName) {
        if(!ValidationUtils.isValidCarNameLength(carName)){
            throw new IllegalArgumentException("자동차 이름 길이 오류.");
        }

        this.name = carName;
        this.position = START_POSITION;
    }

    public void play(int number) {
        if(number >= 4){
            position += 1;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
