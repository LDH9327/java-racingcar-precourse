package racingcar;

import java.util.Scanner;
import racingcar.view.InputView;
import racingcar.view.screen.MainScreen;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        InputView inputView = new InputView(scanner);
        ScreenManager.push(new MainScreen());
        run(inputView);
    }

    public static void run(InputView inputView) {
        do {
            ErrorHandler.goBackWhenException(inputView);
        } while (!ScreenManager.isEmpty());
    }
}
