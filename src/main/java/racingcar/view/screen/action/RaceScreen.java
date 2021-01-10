package racingcar.view.screen.action;

import racingcar.car.Car;
import racingcar.car.CarRepository;
import racingcar.view.InputView;
import racingcar.view.OutputView;
import racingcar.view.screen.Screen;
import racingcar.view.screen.ScreenManager;

public class RaceScreen implements Screen {

    private static final String TRY_COUNT_GUIDE_MESSAGE = "시도할 횟수를 입력하세요.";
    private static final String RACE_START_MESSAGE = "실행 결과";


    @Override
    public void visualize() {
        OutputView.printlnGuide(TRY_COUNT_GUIDE_MESSAGE);
    }

    @Override
    public void logic(InputView inputView) {
        int tryCount = inputView.readTryCount();
        OutputView.printlnResult(RACE_START_MESSAGE);
        for (int i = 0; i < tryCount; i++) {
            OutputView.newLine();
            for(Car car : CarRepository.cars()) {
                car.raceOneTime();
                OutputView.printlnRace(car);
            }
        }
        OutputView.newLine();
        OutputView.printlnRaceResult(CarRepository.getFinalWinnerName());
        CarRepository.clear();
        ScreenManager.pop();
    }
}
