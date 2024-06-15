/**
 * Poliretos
 * Serie numérica 7
 * @author EstefanoCondoy
 * @version 1.0
 */


public class EstefanoCondoySN7 {
        public void SerieNumerica7(int ccPosicion){
            int numero = 1; 
    
            System.out.println("\nSERIE NUMERICA 7");
    
            for (int i = 1; i <= ccPosicion; i++) {
                System.out.print(numero);
                System.out.print(" ");
                numero+=3;
            }
        }
}
