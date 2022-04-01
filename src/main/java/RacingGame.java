import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    public Cars findWinners(Cars cars) {
        List<Car> winners = getWinners(cars, getMaxPosition(cars));

        return new Cars(winners);
    }

    private List<Car> getWinners(Cars cars, int maxPosition) {
        List<Car> winners = new ArrayList<>();

        for (Car car : cars.getCars()) {
            if (car.getPosition() == maxPosition){
                winners.add(car);
            }
        }

        return winners;
    }

    private int getMaxPosition(Cars cars) {
        int maxPosition = 0;

        for (Car car : cars.getCars()) {
            if (car.getPosition() > maxPosition){
                maxPosition = car.getPosition();
            }
        }

        return maxPosition;
    }

    public Cars play(int playTime, Cars cars) {
        for (int i = 0; i < playTime; i++) {
            cars.play();
        }

        return findWinners(cars);
    }
}
