package racingcar.view;

public class OutputView {

  private static final String GUIDE_PREFIX = "##";
  private static final String ERROR_PREFIX = "[ERROR]";
  private static final String SPACE = " ";

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

  public static void printlnGuide(String guideMessage) {
    println(String.join(SPACE, GUIDE_PREFIX, guideMessage));
  }

  public static void printlnList(String command, String actionName) {
    println(String.join(SPACE, command, actionName));
  }
}
