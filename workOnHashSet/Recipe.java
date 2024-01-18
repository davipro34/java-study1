package workOnHashSet;

import java.util.HashSet;
import java.util.Set;

public class Recipe {
  /**
   * The main method is the entry point of the program.
   * It demonstrates the usage of a HashSet to store ingredients of a recipe.
   * It adds ingredients to the set, removes an ingredient, and then prints all the remaining ingredients.
   *
   * @param args the command-line arguments
   */
  public static void main(String[] args) {
    Set<String>ingredients = new HashSet<String>();
    ingredients.add("eggs");
    ingredients.add("sugar");
    ingredients.add("butter");
    ingredients.add("salt");
    ingredients.add("pepper");
    ingredients.remove("pepper");
    
    for (String ingredient : ingredients) {
    System.out.println(ingredient);
    }
  }
}
