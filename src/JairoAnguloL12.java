public class JairoAnguloL12 {

    public void desplazarDerechaYRegresar() {
        // Figura inicial
        String[] figura = {
                "  \\|||/",
                "  (> <)",
                "ooO-(_)-Ooo"
        };

        int pasos = 30; 
        // Desplazamiento a la derecha
        for (int i = 0; i < pasos; i++) {
            limpiarConsola();
            imprimirFiguraConEspacios(figura, i); 
            esperar(100);
        }

        // Regreso
        for (int i = pasos - 1; i >= 0; i--) {
            limpiarConsola();
            imprimirFiguraConEspacios(figura, i); 
            esperar(100); 
        }
    }

    private void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void imprimirFiguraConEspacios(String[] figura, int espacios) {
        for (String line : figura) {
            imprimirEspacios(espacios);
            System.out.println(line);
        }
    }

    private void imprimirEspacios(int cantidad) {
        for (int j = 0; j < cantidad; j++) {
            System.out.print(" ");
        }
    }

    private void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
