package racingcar.view.screen.action;

import java.util.List;
import racingcar.car.CarRepository;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.screen.Screen;
import racingcar.view.screen.ScreenManager;

public class CarAddScreen implements Screen {

    public static final String ADD_CAR_GUIDE_MESSAGE = "등록할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String ADD_CAR_RESULT_MESSAGE = "경주 자동차가 등록되었습니다.";
    private static final String CAR_RESULT_MESSAGE = "현재 등록된 자동차: %s";

    @Override
    public void visualize() {
        OutputView.newLine();
        OutputView.printlnGuide(ADD_CAR_GUIDE_MESSAGE);
    }

    @Override
    public void logic(InputView inputView) {
        List<String> carNameList = inputView.readCarNames();
        CarRepository.addCarByNameList(carNameList);
        OutputView.printlnResult(ADD_CAR_RESULT_MESSAGE);
        OutputView.printlnCarListByName(CAR_RESULT_MESSAGE, CarRepository.cars());
        ScreenManager.pop();
    }
}
