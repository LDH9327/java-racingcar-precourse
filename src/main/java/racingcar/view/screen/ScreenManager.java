package racingcar.view.screen;

import java.util.Stack;
import racingcar.view.screen.Screen;

public class ScreenManager {

    public static Stack<Screen> screenManager = new Stack<>();

    public static boolean isEmpty() {
        if (screenManager.isEmpty()) {
            return true;
        }
        return false;
    }

    public static Screen pop() {
        return screenManager.pop();
    }

    public static Screen peek() {
        return screenManager.peek();
    }

    public static void push(Screen screen) {
        screenManager.push(screen);
    }

    public static void clear() {
        screenManager.clear();
    }
}
