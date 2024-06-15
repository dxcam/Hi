/**
 * Poliretos
 * Figura 8
 * @author Estefano Condoy
 * @version 1.0
 */
public class EstefanoCondoyF8 {
    public void Figura8(int ccNivel) {
        System.out.println("\nFIGURA 8");
        for (int i = 0; i < ccNivel; i++) {
            // Imprimir los espacios en blanco iniciales
            for (int j = 0; j < (ccNivel - 1 - i) * 4; j++) {
                System.out.print(" ");
            }
            // Imprimir la flecha
            System.out.println("___|");
        }
    }
}
