/**
 * Poliretos
 * Serie numérica 8
 * @author EstefanoCondoy
 * @version 1.0
 */


 public class EstefanoCondoySN8 {
    public void SerieNumerica8(int ccPosicion) {
        int x = 3; 

        System.out.println("\nSERIE NUMERICA 8");

        for (int i = 1; i <= ccPosicion; i++) {
            System.out.print(x);
            System.out.print(" ");
            x += 5;
        }
    }
}

