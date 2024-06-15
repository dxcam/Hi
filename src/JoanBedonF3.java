/**
 * Poliretos
 * Figura 3
 * @author JoanBedon
 * @version 1.0
 */

public class JoanBedonF3 {
    public void Figura3For(int numeroPos) {
        System.out.println("FIGURA 3");
        for (int i = 0; i < numeroPos; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
