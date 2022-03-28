import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {
    @Test
    void car_name_5자_미만() {
        boolean isValidTrue = ValidationUtils.isValidCarNameLength("test");
        boolean isValidFalse = ValidationUtils.isValidCarNameLength("test12");

        Assertions.assertThat(isValidTrue).isTrue();
        Assertions.assertThat(isValidFalse).isFalse();
    }

    @Test
    void 랜덤_숫자_0_9_사이() {
        RandomNumber randomNumber = new RandomNumber();
        boolean isValid = ValidationUtils.isValidRandomNo(randomNumber.getNumber());

        Assertions.assertThat(isValid).isTrue();
    }
}
