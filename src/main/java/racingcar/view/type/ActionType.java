package racingcar.view.type;

public enum ActionType {
    ADD("1", "등록"),
    DELETE("2", "삭제"),
    GOBACK("B", "뒤로가기");

    private String command;
    private String actionName;

    ActionType(String command, String actionName) {
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
