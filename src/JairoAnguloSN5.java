public class JairoAnguloSN5 {
    public void SerieNumerica5For(int num) {
        System.out.println();
        System.out.println("SERIE NUMERICA 5");
        int contPrimos = 0;
        for (int i = 2; contPrimos < num; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
                contPrimos++;
            }
        }
        System.out.println();
    
    }
    
}
