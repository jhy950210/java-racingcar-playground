import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> names) {
        this.cars = mapCars(names);
    }

    private List<Car> mapCars(List<String> names) {
        List<Car> cars = new ArrayList();

        for (String name : names) {
            Car car = new Car(name);

            cars.add(car);
        }
        return cars;
    }

    public void play() {
        for (Car car : cars) {
            car.play();
        }
    }

}
