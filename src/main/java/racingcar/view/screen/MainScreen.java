package racingcar.view.screen;

import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.type.CategoryType;

public class MainScreen implements Screen {

  private static final String MAIN_SCREEN = "메인 화면";

  @Override
  public void visualize() {
    OutputView.newLine();
    OutputView.printlnGuide(MAIN_SCREEN);
    for (CategoryType type : CategoryType.values()) {
      OutputView.printlnList(type.getCommand(), type.getTypeName());
    }
  }

  @Override
  public void logic(InputView inputView) {
    OutputView.newLine();
    OutputView.printlnGuide(CHOOSE_ACTION_GUIDE_MESSAGE);
    String command = inputView.readCategoryCommand();
    if(command.equals(CategoryType.CAR_MANAGE.getCommand())) {
      ScreenManager.push(new CarManagerScreen());
    }
    if(command.equals(CategoryType.RACE_START.getCommand())) {
      ScreenManager.push(new RaceStartScreen());
    }
    if(command.equals(CategoryType.EXIT.getCommand())) {
      ScreenManager.clear();
    }
  }
}
