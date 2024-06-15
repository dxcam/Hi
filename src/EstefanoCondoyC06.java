/**
 * Poliretos
 * Cadena C06
 * @author Estefano Condoy
 * @version 1.0
 */
public class EstefanoCondoyC06 {
    public void cadena6(String fraseoriginal){
        char[] letras = {'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};

        
        StringBuilder fraseCaps = new StringBuilder();

        for (int i = 0; i < fraseoriginal.length(); i++) {
            char letractual = fraseoriginal.charAt(i);
            for (char letra : letras) {
                if (letractual == letra) {
                    letractual = Character.toUpperCase(letractual);
                }
            }
            fraseCaps.append(letractual);
        }
        fraseCaps.reverse();
        String fraseinversaCaps = fraseCaps.toString();
        
        System.out.println("La nueva frase es: "+fraseinversaCaps.toString());
    }
}
