package racingcar.car;

import utils.RandomUtils;

public class Car {

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    private static final String REGULAR_EXPRESSION_OF_NUMBER_KOREAN_ENGLISH = "^[0-9가-힣a-zA-Z]*$";
    private static final int RAMDOM_INCLUSIVE_START = 0;
    private static final int RAMDOM_INCLUSIVE_END = 9;

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void raceOneTime() {
        int randomInt = RandomUtils.nextInt(RAMDOM_INCLUSIVE_START,RAMDOM_INCLUSIVE_END);
        if(randomInt > 3) {
            goForward();
        }
    }

    private void goForward() {
        position++;
    }

    // 자동차 이름 유효성 검사를 어디서 할지.


}
