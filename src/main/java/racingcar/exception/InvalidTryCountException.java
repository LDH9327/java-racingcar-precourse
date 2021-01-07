package racingcar.exception;

public class InvalidTryCountException extends RuntimeException {

    private static final String MESSAGE = "시도할 횟수는 1이상 숫자여야 합니다. (입력 값: '%s')";

    public InvalidTryCountException(String tryCount) {
        super(String.format(MESSAGE, tryCount));
    }
}
