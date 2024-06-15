/**
 * Poliretos
 * Figura 15
 * @author Estefano Condoy
 * @version 1.0
 */

public class EstefanCondoyF15 {
    public  void Figura15(int ccNivel){
        int[][] triangulo = new int[ccNivel][ccNivel];
        System.out.println("\nFIGURA 15");

        for (int i = 0; i < ccNivel; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangulo[i][j] = 1;
                } else {
                    triangulo[i][j] = triangulo[i-1][j-1] + triangulo[i-1][j];
                }
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
