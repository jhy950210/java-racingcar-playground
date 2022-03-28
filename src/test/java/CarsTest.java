import org.assertj.core.util.Strings;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarsTest {
    @Test
    void 경주에_참가할_자동차_이름() {
        String input = "pobi,crong,honux";
        String[] split = input.split(",");
        List<String> strings = Arrays.stream(split).collect(Collectors.toList());

        Cars cars = new Cars(strings);
    }

    @Test
    void 경주_1회() {
        String input = "pobi,crong,honux";
        String[] split = input.split(",");
        List<String> strings = Arrays.stream(split).collect(Collectors.toList());

        Cars cars = new Cars(strings);

        cars.play();

        cars.printResult();
    }
}
