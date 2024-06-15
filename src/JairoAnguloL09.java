import java.util.concurrent.TimeUnit;

public class JairoAnguloL09 {
    private String nombreCompleto;
    private int longitud;
    private int progreso;

    public JairoAnguloL09() {
        // Solicitar el nombre completo al usuario
        System.out.print("Ingrese su nombre completo: ");
        this.nombreCompleto = App.scanner.nextLine();
        

        this.longitud = nombreCompleto.length();
        this.progreso = 0;
    }

    public void mostrarProgreso() {
        try {
            while (!isComplete()) {
                mostrarNombreConProgreso();
                avanzar();
                TimeUnit.MILLISECONDS.sleep(500); 
            }
            mostrarNombreConProgreso(); 
            System.out.println(); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void avanzar() {
        progreso++;
    }

    private void mostrarNombreConProgreso() {
        StringBuilder linea = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            if (i == progreso) {
                linea.append(nombreCompleto.charAt(i));
                break;
            } else {
                linea.append(" ");
            }
        }

        int porcentaje = (progreso * 100) / longitud;
        System.out.print(linea.toString() + "   " + porcentaje + "%");
        System.out.println();
    }

    private boolean isComplete() {
        return progreso >= longitud;
    }
}
