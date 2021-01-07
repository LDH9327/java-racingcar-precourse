package racingcar.view.screen;

import racingcar.view.InputView;

public interface Screen {
  public static final String CHOOSE_ACTION_GUIDE_MESSAGE = "원하는 기능을 선택하세요.";

  void visualize();

  void logic(InputView inputView);
}
