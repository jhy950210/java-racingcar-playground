public class Car {
    private static final int START_POSITION = 0;

    private final int length;
    private final String name;
    private int position;

    public Car(String carName) {
        boolean isValidCarNameLength = ValidationUtils.isValidCarNameLength(carName);
        if(!isValidCarNameLength){
            throw new IllegalArgumentException("자동차 이름 길이 오류.");
        }

        this.length = carName.length();
        this.name = carName;
        this.position = START_POSITION;
    }

    public void play(int number) {
        if(number >= 4){
            position += 1;
        }
    }

    public int getLength() {
        return length;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
