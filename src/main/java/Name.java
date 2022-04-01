import java.util.Objects;

public class Name {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private final String name;

    public Name(String name) {
        if(!ValidationUtils.isValidCarNameLength(name)){
            throw new IllegalArgumentException("이름 길이 오류.");
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }
}
