public class JairoAnguloL05 {
    public void BarraPorciento(){
    int longitudBarra = 20;
        int porcentaje = 100;
        int delayMilisegundos = 100;

        for (int i = 0; i <= porcentaje; i++) {
            int caracteresLlenos = (i * longitudBarra) / 100;
            mostrarBarraDeProgreso(caracteresLlenos, longitudBarra);
            try {
                Thread.sleep(delayMilisegundos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void mostrarBarraDeProgreso(int caracteresLlenos, int longitudBarra) {
        System.out.print("[");
        for (int i = 0; i < longitudBarra; i++) {
            if (i < caracteresLlenos) {
                if (i == caracteresLlenos - 1) {
                    System.out.print(">");
                } else {
                    System.out.print("=");
                }
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("] " + caracteresLlenos * 5 + "%\r");
    }
}
