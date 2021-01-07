package racingcar.exception;

public class CannotChooseCommandException extends RuntimeException {

    private static final String MESSAGE = "선택할 수 없는 기능입니다. (입력 값: '%s')";

    public CannotChooseCommandException(String command) {
        super(String.format(MESSAGE, command));
    }
}
