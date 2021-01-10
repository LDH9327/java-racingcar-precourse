package racingcar.exception;

public class CannotDeleteCarException extends RuntimeException {

    public static final String MESSAGE = "등록된 차가 없습니다.";

    public CannotDeleteCarException() {
        super(MESSAGE);
    }
}
