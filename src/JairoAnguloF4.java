public class JairoAnguloF4 {
    public void Figura4For(int numeroPos) {
        System.out.println("FIGURA 4");
        for (int i = 0; i < numeroPos; i++) {
            for (int j = 0; j < numeroPos - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
}
