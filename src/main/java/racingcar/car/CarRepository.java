package racingcar.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import racingcar.exception.CannotFindCarInCarsException;
import racingcar.exception.DuplicatedCarInCarsException;

public class CarRepository {

    private static final List<Car> cars = new ArrayList<>();

    public static List<Car> cars() {
        return Collections.unmodifiableList(cars);
    }

    private static void addCar(Car car) {
        if (isCarInCars(car.getName())) {
            throw new DuplicatedCarInCarsException(car.getName());
        }
        cars.add(car);
    }

    public static void addCarByNameList(List<String> carNameList) {
        for (String carName : carNameList) {
            addCar(new Car(carName));
        }
    }

    public static void deleteCarByName(String carName) {
        if (!isCarInCars(carName)) {
            throw new CannotFindCarInCarsException(carName);
        }
        cars.removeIf(car -> Objects.equals(car.getName(), carName));
    }

    private static boolean isCarInCars(String carName) {
        return cars.stream()
                   .anyMatch(car -> Objects.equals(car.getName(), carName));
    }

    private static int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            if (maxPosition < car.getPosition()) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    public static String getFinalWinnerName() {
        int maxPosition = getMaxPosition();
        String finalWinnerName = "";
        for (Car car : cars) {
            if (maxPosition == car.getPosition()) {
                finalWinnerName = String.join(",", car.getName());
            }
        }
        return finalWinnerName;
    }

    public static void clear() {
        cars.clear();
    }


}
