/**
 * Poliretos
 * Figura 13
 * @author ChristopherCriollo
 * @version 1.0
 */

public class ChristopherCriolloF13 {
    
    public void Figura13(int ccNivel){
        
        System.out.println("\nWhile: ");
        
        int i = 1;
        while (i <= ccNivel) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
