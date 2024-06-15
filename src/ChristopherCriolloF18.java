/**
 * Poliretos
 * Figura 18
 * @author ChristopherCriollo
 * @version 2.0
 */

/**
 * 2
 * 1 2
 * 1 3 2
 * 1 4 5 2
 * 1 5 9 7 2
 */
public class ChristopherCriolloF18 {
    public void Figura18(int ccNivel){

        int[][] matriz = new int[ccNivel][ccNivel];

        System.out.println("\nFIGURA 18");
        System.out.println("\nFor:");

        for (int i = 0; i < ccNivel; i++) {
            matriz[i][0] = 1;
            matriz[i][i] = 2;
            for (int j = 1; j < i; j++) {
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
            }
        }
        for (int i = 0; i < ccNivel; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}