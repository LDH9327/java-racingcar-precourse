package racingcar.car;

import utils.RandomUtils;

public class Car {

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    private static final int RAMDOM_INCLUSIVE_START = 0;
    private static final int RAMDOM_INCLUSIVE_END = 9;
    private static final int MAX_VALUE_OF_STOP = 3;

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void raceOneTime() {
        int randomInt = RandomUtils.nextInt(RAMDOM_INCLUSIVE_START, RAMDOM_INCLUSIVE_END);
        if (randomInt > MAX_VALUE_OF_STOP) {
            goForward();
        }
    }

    private void goForward() {
        position++;
    }
}
