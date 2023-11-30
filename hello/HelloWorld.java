package hello;

/** Ceci est une implémentation du message traditionnel "Hello world!"

* @author L'équipe Education d'OpenClassrooms

*/

public class HelloWorld {

    /** Le programme commence ici */

    public static void main(String[] args) {
        String message = "Hello World!";
        message = message.toUpperCase();
        message = message.toLowerCase();

        System.out.println(message);

    }

}