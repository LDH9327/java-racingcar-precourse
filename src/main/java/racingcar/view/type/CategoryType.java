package racingcar.view.type;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum CategoryType {
    CAR_MANAGE("1", "자동차 관리", Arrays.asList(ActionType.ADD, ActionType.DELETE, ActionType.GOBACK)),
    RACE_START("2", "경주 시작", Collections.emptyList()),
    EXIT("Q", "종료", Collections.emptyList());

    private String command;
    private String typeName;
    private List<ActionType> actionTypeList;

    CategoryType(String command, String typeName, List<ActionType> actionTypeList) {
        this.command = command;
        this.typeName = typeName;
        this.actionTypeList = actionTypeList;
    }

    public String getCommand() {
        return command;
    }

    public String getTypeName() {
        return typeName;
    }

    public List<ActionType> getActionTypeList() {
        return actionTypeList;
    }
}
