package racingcar;

public enum CarManagerType {
    ADD("1", "자동차 등록"),
    DELETE("2", "자동차 삭제"),
    GOBACK("B", "뒤로가기");

    private String command;
    private String actionName;

    CarManagerType(String command, String actionName) {
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
