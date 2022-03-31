import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {

    @Test
    void 자동차_전진조건_4_이상일_경우() {
        Car car = new Car("test");

        car.play(4);
        assertThat(car.getPosition()).isEqualTo(1);

        car.play(3);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void car_name_길이_오류() {

        assertThatThrownBy(() -> {
            Car car = new Car("testtest");
        }).isInstanceOf(IllegalArgumentException.class);

    }
}