public class CamilaCaicedoF11 {
    public void ccF11 (int cctamano) {
        System.out.println();
        System.out.println("FIGURA 11");
        for (int i = 1; i <= cctamano; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("    "); 
            }
            System.out.print(" | ");

            for (int k = 1; k <= i; k++) {
                System.out.print(" _");
            }
            System.out.println();
        }
    }

}
