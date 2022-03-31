

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;


public class CarsTest {
    @Test
    void 자동차_이름_split() {
        String input = "pobi,crong,honux";
        String[] split = input.split(",");
        List<String> strings = Arrays.stream(split).collect(Collectors.toList());

        assertThat(strings.size()).isEqualTo(3);
    }

}
