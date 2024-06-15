public class JairoAnguloF2 {
    public void Figura2For(int numeroPos) {
        System.out.println("FIGURA 2");

        for (int i = 0; i < numeroPos; i++) {
            for (int j = 0; j < numeroPos; j++) {
                if (i == 0 || i == numeroPos - 1 || j == 0 || j == numeroPos - 1) {
                    if ((i + j) % 2 == 0) 
                        System.out.print("+");
                    else 
                        System.out.print("-");
                    
                }else 
                    System.out.print(" ");
                
            }
            System.out.println();
        }
    }
    
}
