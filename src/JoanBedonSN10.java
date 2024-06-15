/**
 * Poliretos
 * Serie numérica 10
 * @author JoanBedon
 * @version 1.0
 */
public class JoanBedonSN10 {
    public void SerieNumerica10(int ccPosicion) {
        int x = 3; 

        System.out.println("\nSERIE NUMERICA 10");

        for (int i = 1; i <= ccPosicion; i++) {
            System.out.print(x);
            System.out.print(" ");
            x *= 3;
        }
    }
}
