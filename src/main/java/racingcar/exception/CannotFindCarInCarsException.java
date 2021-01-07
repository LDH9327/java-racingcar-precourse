package racingcar.exception;

public class CannotFindCarInCarsException extends RuntimeException {

    private static String MESSAGE = "등록되지 않은 자동차입니다. (입력 값:'%s')";

    public CannotFindCarInCarsException(String carName) {
        super(String.format(MESSAGE, carName));
    }
}
