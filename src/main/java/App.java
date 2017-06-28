import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter the length and width");
    int userInputLength = Integer.parseInt(myConsole.readLine());
    int userInputWidth = Integer.parseInt(myConsole.readLine());

    Rectangle rectangle = new Rectangle(userInputLength, userInputWidth);
    boolean squareResult = rectangle.isSquare();
    if (squareResult == false) {
      System.out.println("The rectangle is not a square!");
    } else {
      System.out.println("The rectangle is a square!");
    }
  }
}
