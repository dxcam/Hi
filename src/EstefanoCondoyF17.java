/**
 * Poliretos
 * Figura 17
 * @author Estefano Condoy
 * @version 1.0
 */

public class EstefanoCondoyF17 {
    public void Figura17(int ccNivel) {
        System.out.println("\nFIGURA 17");

        for (int i = 0; i < ccNivel; i++) {
            for (int j = 0; j < ccNivel; j++) {
                if (j == i || j == ccNivel - 1 - i) {
                    System.out.print((i % 2 == 0) ? "1" : "0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
