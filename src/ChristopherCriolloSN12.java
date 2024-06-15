/**
 * Poliretos
 * Serie numérica 12
 * @author ChristopherCriollo
 * @version 1.0
 */

public class ChristopherCriolloSN12 {
    public void SerieNumerica12(int ccPosicion){
        int inicio = 2; 
        int x = 4; 

        System.out.println("\nSERIE NUMERICA 12");
        System.out.println("\nFor: ");

        for (int i = 1; i <= ccPosicion; i++) {
            System.out.print(inicio);
            System.out.print(" ");
            inicio+=x;
            x+=2;
        }
    }
}
