/**
 * Poliretos
 * Serie caracteres 1
 * @author JoanBedon
 * @version 1.0
 */
public class JoanBedonSC1 {
    public void SerieCaractere1For(int num){
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
            System.out.print(" "); 
        }
        System.out.println();
    }
}
