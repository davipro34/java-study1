package sandbox;

/**
 * Play
 */
public class Play {

    public static void main(String[] args) {
        System.out.println("Hello World");
        displayPerimeter(10, 11);

    }

    public static void displayPerimeter(int length, int width) {
      int perimeter = 2 * (length + width);
      System.out.println(perimeter);
    }
}