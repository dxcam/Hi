public class JairoAnguloF5 {
    public void Figura5For(int altura) {
        System.out.println("FIGURA 5 ");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (altura - i) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
