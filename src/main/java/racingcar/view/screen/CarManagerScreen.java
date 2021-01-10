package racingcar.view.screen;

import racingcar.car.CarRepository;
import racingcar.exception.CannotDeleteCarException;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.screen.action.CarAddScreen;
import racingcar.view.screen.action.CarDeleteScreen;
import racingcar.view.type.ActionType;
import racingcar.view.type.CategoryType;

public class CarManagerScreen implements Screen {
    public static final String CAR_MANAGER_SCREEN = "자동차 관리 화면";

    @Override
    public void visualize() {
        OutputView.newLine();
        OutputView.printlnGuide(CAR_MANAGER_SCREEN);
        for(ActionType actionType : CategoryType.CAR_MANAGE.getActionTypeList()) {
            OutputView.printlnList(actionType.getCommand(),actionType.getActionName());
        }
    }

    @Override
    public void logic(InputView inputView) {
        OutputView.newLine();
        OutputView.printlnGuide(CHOOSE_ACTION_GUIDE_MESSAGE);
        String command = inputView.readActionCommand(CategoryType.CAR_MANAGE);
        if(command.equals(ActionType.ADD.getCommand())) {
            ScreenManager.push(new CarAddScreen());
        }
        if(command.equals(ActionType.DELETE.getCommand())) {
            if(CarRepository.cars().isEmpty()) {
                throw new CannotDeleteCarException();
            }
            ScreenManager.push(new CarDeleteScreen());
        }
        if(command.equals(ActionType.GOBACK.getCommand())) {
            ScreenManager.pop();
        }
    }
}
