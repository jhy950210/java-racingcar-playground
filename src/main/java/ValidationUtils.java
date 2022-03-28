public class ValidationUtils {
    private static final int MAX_CAR_NAME_LENGTH = 5;

    public static boolean isValidCarNameLength(String carName){
        if(carName.length() <= MAX_CAR_NAME_LENGTH){
            return true;
        }
        return false;
    }

    public static boolean isValidRandomNo(int randomNumber) {
        if(0 <= randomNumber && randomNumber <= 9){
            return true;
        }
        return false;
    }
}
