public class JairoAnguloF9 {
    public void Figura9For(int altura) {
        System.out.println("FIGURA 9");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura - i - 1) * 2; j++) 
                System.out.print(" ");
            System.out.print(" ");
            System.out.print("--");

            for (int j = 0; j < i * 4; j++) 
                System.out.print(" ");
            System.out.print("--");
            System.out.println();
            
            for (int j = 0; j < (altura - i - 1) * 2; j++) 
                System.out.print(" ");
            System.out.print(" ");
            System.out.print("| ");
            
            for (int j = 0; j < i * 4; j++) 
                System.out.print(" ");
            System.out.print(" |");
            System.out.println();
        }
    }
    
}
