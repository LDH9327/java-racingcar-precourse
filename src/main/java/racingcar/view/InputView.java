package racingcar.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    private String readLine() {
        return scanner.nextLine()
                      .trim();
    }

    public String readCommand() {
        return readLine().toUpperCase();
    }

    public String readCarName() {
        return readLine();
    }
}

