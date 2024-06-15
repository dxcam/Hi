public class CamilaCaicedoF1 {
    public void ccF1(int cctamano){
        System.out.println();
        System.out.println("FIGURA 1");
        for (int i = 0; i < cctamano; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 0; i < cctamano - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < cctamano - 2; j++) {
                System.out.print("  "); 
            }
            System.out.println(" *");
        }
        for (int i = 0; i < cctamano; i++) {
            System.out.print("* ");
        }
        System.out.println(); 
    }    
}

