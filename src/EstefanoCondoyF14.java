/**
 * Poliretos
 * Figura 14
 * @author Estefano Condoy
 * @version 1.0
 */

public class EstefanoCondoyF14 {
    public void Figura14(int ccNivel) {
        int[][] triangulo = new int[ccNivel][ccNivel];
        System.out.println("\nFIGURA 14");

        for (int i = 0; i < ccNivel; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangulo[i][j] = 1;
                } else {
                    triangulo[i][j] = triangulo[i-1][j-1] + triangulo[i-1][j];
                }
            }
        }

        // Imprimir el triángulo centrado
        for (int i = 0; i < ccNivel; i++) {
            // Imprimir espacios para centrar
            for (int j = 0; j < ccNivel - i - 1; j++) {
                System.out.print("   ");
            }
            // Imprimir los valores del triángulo
            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", triangulo[i][j]);
            }
            System.out.println();
        }
    }
}
