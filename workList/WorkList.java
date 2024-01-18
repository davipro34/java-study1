package workList;

import java.util.ArrayList;
import java.util.List;

public class WorkList {
  /**
   * The main method is the entry point of the Java program.
   * It demonstrates the usage of the List interface and its methods.
   *
   * @param args the command-line arguments
   */
  public static void main(String[] args) {
    List<String> myList = new ArrayList<String>();
    myList.add("Hello");
    myList.add("World");
    myList.add(2, "!");
    myList.set(1, "David");
    myList.remove(2);

    for (String object : myList) {
      System.out.println(object);
    }
    System.out.println("Size of myList : "+myList.size());
  }
}