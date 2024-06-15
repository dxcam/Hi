/**
 * Poliretos
 * Serie caracter 7
 * @author ChristopherCriollo
 * @version 1.0
 */

public class ChristopherCriolloSC7 {
    
    public void SerieCaracter7(int ccPosicion){
        char letra = 'a';
        int contador = 0;
        int i = 2;

        System.out.println("\nWhile: ");

        while (contador < ccPosicion) {
            int j = 0;
            while (j < i) {
                System.out.print(letra);
                j++;
            }
            System.out.print(" ");
            letra++;
            contador++;
            i+=2;
        }
    }
}
