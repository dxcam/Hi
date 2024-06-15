/**
 * Poliretos
 * Figura 7
 * @author ChristopherCriollo
 * @version 1.0
 */

public class ChristopherCriolloF7 {
    public void Figura7(int ccNivel){
        String grada = "|___";

        System.out.println("\nFIGURA 7");
        System.out.println("\nFor: ");

        for (int i = 0; i < ccNivel; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("     ");
            }
            System.out.println(grada);
        }
    }
}
