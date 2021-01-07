package racingcar.exception;

public class DuplicatedCarInCarsException extends RuntimeException {

    private static final String MESSAGE = "이미 등록된 자동차입니다. (입력 값: '%s')";

    public DuplicatedCarInCarsException(String carName) {
        super(String.format(MESSAGE, carName));
    }
}
