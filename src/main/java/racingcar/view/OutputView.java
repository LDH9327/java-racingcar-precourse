package racingcar.view;

import java.util.List;
import racingcar.car.Car;

public class OutputView {

    private static final String GUIDE_PREFIX = "##";
    private static final String ERROR_PREFIX = "[ERROR]";
    private static final String RESULT_PREFIX = "[INFO]";
    private static final String SPACE = " ";
    private static final String COMMA = ",";
    private static final String HYPEN = "-";
    private static final String COLON = ":";

    private OutputView() {
    }

    public static void newLine() {
        System.out.println();
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public static void printlnError(String errorMessage) {
        println(String.join(SPACE, ERROR_PREFIX, errorMessage));
    }

    public static void printlnResult(String resultMessage) {
        println(String.join(SPACE, RESULT_PREFIX, resultMessage));
    }

    public static void printlnCarListByName(String message,List<Car> carList) {
        String carNameList = "";
        for (Car car : carList) {
            if (carNameList.isEmpty()) {
                carNameList = car.getName();
                continue;
            }
            carNameList = String.join(COMMA, carNameList, car.getName());
        }
        printlnResult(String.format(message, carNameList));
    }

    public static void printlnGuide(String guideMessage) {
        println(String.join(SPACE, GUIDE_PREFIX, guideMessage));
    }

    public static void printlnList(String command, String actionName) {
        println(String.join(SPACE, command, actionName));
    }

    public static void printlnRace(Car car) {
        String positionToHypen = "";
        for (int i = 0; i < car.getPosition(); i++) {
            positionToHypen += HYPEN;
        }
        String resultMessage = String.join(SPACE, car.getName(), COLON, positionToHypen);
        printlnResult(resultMessage);
    }
}
