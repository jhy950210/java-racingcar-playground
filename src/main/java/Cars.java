import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void play() {
        for (Car car : cars) {
            car.play();
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
