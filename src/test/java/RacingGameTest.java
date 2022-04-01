import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RacingGameTest {
    private List<Car> cars = new ArrayList<>();

    @BeforeEach
    void setUp(){
        Car car1 = new Car("car1",2);
        Car car2 = new Car("car2",2);
        Car car3 = new Car("car3",1);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
    }

    @Test
    void findWinners() {

        RacingGame racingGame = new RacingGame();
        Cars winners = racingGame.findWinners(new Cars(cars));
        Car car1 = new Car("car1",2);
        Car car2 = new Car("car2",2);

        assertThat(winners.getCars().size()).isEqualTo(2);
        assertThat(winners.getCars()).contains(car1,car2);
    }

    @Test
    void play_game() {

        Cars play = new RacingGame().play(5, new Cars(cars));

        for (Car car : play.getCars()) {
            System.out.print("Name() = " + car.getName() + " Position() = " + car.getPosition() + "\n");

        }
    }
}
