package racingcar;

public enum MainType {
    CAR_MANAGE("1", "자동차 관리"),
    RACE_START("2", "경주 시작"),
    EXIT("Q", "종료");

    private String command;
    private String actionName;

    MainType(String command, String actionName) {
        this.command = command;
        this.actionName = actionName;
    }

    public String getCommand() {
        return command;
    }

    public String getActionName() {
        return actionName;
    }
}
