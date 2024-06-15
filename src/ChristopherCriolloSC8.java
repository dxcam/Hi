/**
 * Poliretos
 * Serie caracter 8
 * @author ChristopherCriollo
 * @version 1.0
 */

public class ChristopherCriolloSC8 {
    public void SerieCaracter8(int ccPosicion){
        char letra = 'a';
        int contador = 0; 

        System.out.println("\nSERIE CARACTER 8");
        System.out.println("\nFor: ");

        for (int i = 1; contador < ccPosicion; i+=2) {
            for (int j = 0; j < i; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
            contador++;
        }
    }
}
