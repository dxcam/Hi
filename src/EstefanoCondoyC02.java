/**
 * Poliretos
 * CadenaC02
 * @author Estefano Condoy
 * @version 1.0
 */
public class EstefanoCondoyC02 {
    public void cadena2(String fraseIngresada) {
        int contador = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
    
        for (int i = 0; i < fraseIngresada.length(); i++) {
            char letraActual = fraseIngresada.toLowerCase().charAt(i);
            boolean esVocal = false;
    
            for (char vocal : vocales) {
                if (letraActual == vocal) {
                    esVocal = true;
                    break;
                }
            }
    
            if (!esVocal) {
                contador++;
            }
        }
    
        System.out.println("La frase: " + fraseIngresada + " contiene " + contador + " letras.");
    }       
}
