package workOnHashMap;

import java.util.HashMap;
import java.util.Map;

public class Ages {

   /**
   * The main method is the entry point of the Java program.
   * It demonstrates the usage of the Map interface and its methods.
   *
   * @param args the command-line arguments
   */
  public static void main(String[] args) {
    Map<String, Integer> userMap = new HashMap<String, Integer>();
    Map<String, String> professions = new HashMap<String, String>();
    
    // Définissez des clés en tant que constantes dans votre classe (préfixe K est une convention pour Key)
    final String KJENNY = "Jenny";
    final String KOLIVIA = "Olivia";
    final String KPAUL = "Paul";

    // Utilisez des constantes en tant que keys
    userMap.put(KJENNY, 34);
    userMap.put(KOLIVIA, 28);
    userMap.put(KPAUL, 31);
      
    professions.put("Jenny", "Business Owner");
    System.out.println("Jenny dedvient "+ professions.get("Jenny"));

    professions.put("Jenny", "Developer");
    System.out.println("Jenny dedvient "+ professions.get("Jenny"));

    professions.remove("Jenny");
    System.out.println("On supprime Jenny de la liste des professions");

      for(Map.Entry<String, Integer> entryu : userMap.entrySet()){
        printUser(entryu);
      }

      for(Map.Entry<String, String> entryp : professions.entrySet()){
        printProfession(entryp);
      }

      System.out.println(userMap.size());
      System.out.println(professions.size());

    }

    // Affiche une entrée d'un dictionnaire (Map)
    static void printUser(Map.Entry<String, Integer> entryu){
      System.out.println(entryu.getKey() + " -> " + entryu.getValue());
    }
    
    
    // Affiche une entrée d'un dictionnaire (Map)
    static void printProfession(Map.Entry<String, String> entryp){
      System.out.println(entryp.getKey() + " -> " + entryp.getValue());
    }
}