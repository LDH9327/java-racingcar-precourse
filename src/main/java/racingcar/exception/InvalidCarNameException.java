package racingcar.exception;

public class InvalidCarNameException extends RuntimeException {

    private static final String MESSAGE = "자동차 이름은 한글, 영어, 숫자로 구성된 5자 미만입니다. (입력 값: '%s')";

    public InvalidCarNameException(String carName) {
        super(String.format(MESSAGE, carName));
    }
}
