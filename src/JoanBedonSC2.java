/**
 * Poliretos
 * Serie caracteres 2
 * @author JoanBedon
 * @version 1.0
 */
public class JoanBedonSC2 {
    public void SerieCaractere2For(int num) {
    for (int i = 1; i <= num; i++) {
        for (int j = 0; j < (i * (i - 1)) / 2; j++) {
            System.out.print("+");
        }
        System.out.print(" ");
    }
    System.out.println();
}
}