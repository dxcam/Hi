import java.util.Scanner;

/**
 * Poliretos
 * Cadena caracteres 7
 * @author ChristopherCriollo
 * @version 1.0
 */

public class ChristopherCriolloC7 {
    public void Cadena07(){
        System.out.println("\n CADENA CARACTER 7: ");
        Scanner cadena7 = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra con la letra J");
        String frase = cadena7.nextLine();

        String resultado = procesoFrase(frase);
        System.out.println("Su resultado es: " + resultado);

        cadena7.close();
    }

    private static String procesoFrase(String frase) {
        String mayu = frase.toUpperCase();

        String remplazar = mayu.replace("J", "");

        return remplazar;
    }
}

