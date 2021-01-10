package racingcar.view.screen.action;

import racingcar.car.CarRepository;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.screen.Screen;
import racingcar.view.screen.ScreenManager;

public class CarDeleteScreen implements Screen {

    public static final String DELETE_CAR_GUIDE_MESSAGE = "삭제할 자동차 이름을 입력하세요.";
    public static final String DELETE_CAR_RESULT_MESSAGE = "경주 자동차가 삭제되었습니다.";
    private static final String CAR_RESULT_MESSAGE = "현재 등록된 자동차: %s";

    @Override
    public void visualize() {
        OutputView.newLine();
        OutputView.printlnGuide(DELETE_CAR_GUIDE_MESSAGE);
    }

    @Override
    public void logic(InputView inputView) {
        String carName = inputView.readCarName();
        CarRepository.deleteCarByName(carName);
        OutputView.printlnResult(DELETE_CAR_RESULT_MESSAGE);
        OutputView.printlnCarListByName(CAR_RESULT_MESSAGE, CarRepository.cars());
        ScreenManager.pop();
    }
}
