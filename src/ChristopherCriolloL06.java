/**
 * Poliretos
 * Loading 6
 * @author ChristopherCriollo
 * @version 1.0
 */
public class ChristopherCriolloL06 {
    public void loading06() {
        System.out.println("\nLOADING. 6 :");
        System.out.println();
        int espaciosAdelante = 20, espaciosAtras = 0;
        for (int i = 0; i <= 90;i+=10) {
            
            while (espaciosAtras <= 20) {
                System.out.print(
                        "\r " + "[" + " ".repeat(espaciosAtras) + "<=>" + " ".repeat(espaciosAdelante) + "]" + i + "%");
                espaciosAtras++;
                espaciosAdelante--;
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            while (espaciosAtras > 0) {
                espaciosAtras--;
                espaciosAdelante++;
                System.out.print(
                        "\r " + "[" + " ".repeat(espaciosAtras) + "<=>" + " ".repeat(espaciosAdelante) + "]" + i + "%");
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.print("\r " + "[" + " ".repeat(espaciosAtras) + "<=>" + " ".repeat(espaciosAdelante) + "]" + 100 + "%");
    }
}
