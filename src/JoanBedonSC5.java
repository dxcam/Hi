/**
 * Poliretos
 * Serie caracteres 5
 * @author JoanBedon
 * @version 1.0
 */
public class JoanBedonSC5 {
    public void SerieCaractere5For(int num) {
        char[] pattern = {'\\', '|', '/', '-', '|'};
        int patternLength = pattern.length;
        for (int i = 0; i < num; i++) {
            System.out.print(pattern[i % patternLength] + " ");
        }
        System.out.println();
    }
}
