/**
 * Poliretos
 * Loading 7
 * @author ChristopherCriollo
 * @version 1.0
 */
public class ChristopherCriolloL07 {
    public void loading07(){
        int longitudBarra = 20;
        char[] puntaFlecha = {'\\', '|', '/', '-'};
        int indicePunta = 0;
        
        System.out.println("\n LOADING. 7: ");
        System.out.println();
        String[] figuras = {
           "[" + new String(new char[longitudBarra]).replace('\0', ' ') + "] 0%"
        };
  
        for (int i = 1; i <= 100; i++) {
            int cantidadRelleno = i * longitudBarra / 100;
            figuras[0] = "[" + new String(new char[cantidadRelleno]).replace('\0', '=') + puntaFlecha[indicePunta] + new String(new char[longitudBarra - cantidadRelleno]).replace('\0', ' ') + "] " + i + "%";
  
            System.out.print("\r" + figuras[0]);
  
            indicePunta = (indicePunta + 1) % puntaFlecha.length;
  
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }      
        System.out.println("\r[" + new String(new char[longitudBarra]).replace('\0', '=') + "] 100%");
    }
}
