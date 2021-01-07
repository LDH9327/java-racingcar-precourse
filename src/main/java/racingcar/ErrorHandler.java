package racingcar;

import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.screen.Screen;

public class ErrorHandler {
  public static void goBackWhenException(InputView inputView) {
    try{
      Screen currentScreen = ScreenManager.peek();
      currentScreen.visualize();
      currentScreen.logic(inputView);
    } catch(RuntimeException e) {
      OutputView.printlnError(e.getMessage());
    }
  }

}
