/**
 * Poliretos
 * Serie numérica 9
 * @author JoanBedon
 * @version 1.0
 */
public class JoanBedonSN9 {
    public void SerieNumerica9(int ccPosicion) {
        int x = 2; 

        System.out.println("\nSERIE NUMERICA 9");

        for (int i = 1; i <= ccPosicion; i++) {
            System.out.print(x);
            System.out.print(" ");
            x *= 2;
        }
    }
}
