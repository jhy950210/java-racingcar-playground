import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class NameTest {
    @Test
    void create_name() {
        Name name = new Name("whee");

        assertThat(new Name("whee")).isEqualTo(name);
    }

    @Test
    void 이름_길이_초과() {

        assertThatThrownBy(()->{
            Name name = new Name("wheew");
        }).isInstanceOf(IllegalArgumentException.class);

    }
}
