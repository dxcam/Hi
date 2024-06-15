/**
 * Poliretos
 * Figura 19
 * @author ChristopherCriollo
 * @version 2.0
 */

/**
 * *
 * + *
 * + 3 *
 * + 4 5 *
 * + 5 9 7 *
 */
public class ChristopherCriolloF19 {
    public void Figura19(int ccNivel){

        int[][] matriz = new int[ccNivel][ccNivel];
    
        System.out.println("\nFIGURA 19");
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
                if (matriz[i][j] == 1) {
                    System.out.print("+ ");
                } else if (matriz[i][j] == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}