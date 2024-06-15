/**
 * Poliretos
 * Figura 6
 * @author JoanBedon
 * @version 1.0
 */
public class JoanBedonF6 {
    public void Figura6For(int altura) {
        System.out.println("FIGURA 6 ");
        for (int i = 0; i < altura; i++) {
            // Imprimir los espacios en blanco antes de los asteriscos
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            // Imprimir los asteriscos
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }
    }

}
