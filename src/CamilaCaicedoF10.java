public class CamilaCaicedoF10 {
    public void ccF10(int cctamano){
        System.out.println();
        System.out.println("FIGURA 10");
        for (int i = 0; i < cctamano; i++) {
            for (int j = 0; j < i * 4; j++) {
                System.out.print(" ");
            }
            if (i % 2 == 0) {
                System.out.println("|_+_");
            } else {
                System.out.println("|_-_");
            }
        }
    }
}

