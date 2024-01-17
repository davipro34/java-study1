package loop_while;

public class OC {
     public static void main(String[] args) {
        int [] myArray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        for (int i = 0; i < myArray.length; i++) {
           if (myArray[i] == 50) {
           System.out.println("J’ai trouvé mon  " +myArray[i]+ " !");
           break;
           }
        System.out.println("J’en suis à " +myArray[i]+ " ...");
        }
    }
}