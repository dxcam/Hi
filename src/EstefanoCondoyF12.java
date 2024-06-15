public class EstefanoCondoyF12 {
    public void Figura12(int ccNivel) {
        System.out.println("\nFIGURA 12");
        for (int i = ccNivel; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            if (i > 1) {
                System.out.print("\n"); // Agrega un salto de línea excepto para el último número
            }
        }
    }
}
