package racingcar.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import racingcar.exception.InvalidCarNameException;
import racingcar.exception.InvalidCommandException;
import racingcar.exception.InvalidTryCountException;
import racingcar.view.type.CategoryType;

public class InputView {

    private static final String ENGLISH_KOREAN_NUMBER_REGULAR_EXPRESSION = "^[0-9가-힣a-zA-Z]*$";
    private static final String NUMBER_REGULAR_EXPRESSION = "^[0-9]*$";
    private static final String COMMA = ",";
    private static final int MIN_LENGTH_CAR_NAME = 1;
    private static final int MAX_LENGTH_CAR_NAME = 4;

    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    private String readLine() {
        return scanner.nextLine()
                      .trim();
    }

    public String readCategoryCommand() {
        String command = readLine().toUpperCase();
        boolean isValidCommand = Arrays.stream(CategoryType.values())
                                       .anyMatch(type -> type.getCommand()
                                                             .equals(command));
        if (!isValidCommand) {
            throw new InvalidCommandException(command);
        }
        return command;
    }

    public String readActionCommand(CategoryType type) {
        String command = readLine().toUpperCase();
        boolean isValidCommand = type.getActionTypeList()
                                     .stream()
                                     .anyMatch(actionType -> actionType.getCommand()
                                                                       .equals(command));
        if (!isValidCommand) {
            throw new InvalidCommandException(command);
        }
        return command;
    }

    public String readCarName() {
        String carName = readLine();
        if (!isValidCarName(carName)) {
            throw new InvalidCarNameException(carName);
        }
        return carName;
    }

    public List<String> readCarNames() {
        String carNames = readLine();
        List<String> carNameList = Arrays.asList(carNames.split(COMMA));
        carNameList.forEach(carName -> isValidCarName(carName));
        return carNameList;
    }

    private boolean isValidCarName(String carName) {
        if (carName.length() > MAX_LENGTH_CAR_NAME
            || carName.length() < MIN_LENGTH_CAR_NAME
            || !carName.matches(ENGLISH_KOREAN_NUMBER_REGULAR_EXPRESSION)) {
            throw new InvalidCarNameException(carName);
        }
        return true;
    }

    public int readTryCount() {
        String tryCount = readLine();
        if (!tryCount.matches(NUMBER_REGULAR_EXPRESSION)) {
            throw new InvalidTryCountException(tryCount);
        }
        return Integer.parseInt(tryCount);
    }
}

