import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidationUtilsTest {
    @Test
    void car_name_5자_미만() {
        boolean isValidTrue = ValidationUtils.isValidCarNameLength("test");
        boolean isValidFalse = ValidationUtils.isValidCarNameLength("test12");

        assertThat(isValidTrue).isTrue();
        assertThat(isValidFalse).isFalse();
    }

    @Test
    void 랜덤_숫자_0_9_사이() {
        boolean isValid = ValidationUtils.isValidRandomNo(0);
        assertThat(isValid).isTrue();

        boolean isValid2 = ValidationUtils.isValidRandomNo(10);
        assertThat(isValid2).isFalse();
    }
}
