package loop_for;

public class OC {
    public static void main(String[] args) {
        bonjour("Jean");
        for(int i = 0; i <= 999; i++) {
            bonjour(Integer.toString(i));
        }
    }
    
    static void bonjour(String nom) {
        System.out.println("Bonjour " + nom + " !!");
    }
}
