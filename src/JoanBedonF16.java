/**
 * Poliretos
 * Figura 16
 * @author JoanBedon
 * @version 1.0
 */

public class JoanBedonF16 {
    public void Figura16(int ccNivel) {
        System.out.println("\nFIGURA 16");

        for (int i = 0; i < ccNivel; i++) {
            for (int j = 0; j < ccNivel; j++) {
                if (j == i || j == ccNivel - 1 - i) {
                    System.out.print((i % 2 == 0) ? "+" : "-");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
