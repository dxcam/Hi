/**
 * Poliretos
 * CadenaC03
 * @author Estefano Condoy
 * @version 1.0
 */
public class EstefanoCondoyA03 {
    public void array03(String name) {

        for (int imprimir = 0; imprimir < name.length(); imprimir++) {

            boolean segundoBucleEjecutado = false;

            for (int m = name.length() - imprimir; m >= 0; m--) {
                System.out.printf("%2d |", m);

                for (int espacioRec = name.length() - 1; espacioRec > imprimir; espacioRec--) {
                    System.out.print(" ");
                }
                
                System.out.println(name.charAt(name.length() - imprimir - 1));

                if (!segundoBucleEjecutado) {
                    segundoBucleEjecutado = true;
                    break;
                }
            }
        }
        System.out.printf(" 0 |%s%n", "_".repeat(name.length()));       
    }
}
