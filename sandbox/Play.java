package sandbox;

/**
 * Play
 */
public class Play {

    public static void main(String[] args) {
        System.out.println("Hello World");
        displayPerimeter(10, 11);

        int sumOfSmallNumbers = displaySum(3,7);
        System.out.println(sumOfSmallNumbers); // -> 10

        int sumOfLargerNumbers = displaySum(sumOfSmallNumbers,999);
        System.out.println(sumOfLargerNumbers); // -> 1009

        int myPerimeter = calculatePerimeter(10, 12);
        System.out.println(myPerimeter);

        System.out.println(calculatePerimeter(10, 12));

    }

    public static void displayPerimeter(int length, int width) {
      int perimeter = 2 * (length + width);
      System.out.println(perimeter);
    }

    public static int displaySum(int length, int width) {
      return length + width;
    }

    public static int calculatePerimeter(int length, int width) {
      int premimeter = 2 * (length + width);
      return premimeter;
    }

}