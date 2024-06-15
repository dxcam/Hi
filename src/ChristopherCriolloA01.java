import java.util.Scanner;

public class ChristopherCriolloA01 {
    public void array01() {
        Scanner array1 = new Scanner(System.in);

        System.out.println("\nARRAY 01: ");
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            String nombre = array1.nextLine();

            System.out.print("Ingrese el porcentaje de carga para " + nombre + " (0-100): ");
            int porcentaje = array1.nextInt();
            array1.nextLine(); 

            mostrarPorcentajeCarga(nombre.split(" "), porcentaje);
            }
        }

    static void mostrarPorcentajeCarga(String[] palabras, int porcentaje) {
        for (int i = 0; i < palabras.length; i++) {
            int longitud = palabras[i].length();
            int carga = (int) (longitud * (porcentaje / 100.0));
            String subcadena = palabras[i].substring(0, carga);
            String barra = "[" + "=".repeat(carga) + ">" + " ".repeat(longitud - carga) + "]";
            System.out.printf("%s %d%% %s%n", barra, porcentaje, subcadena);
        }
    }
}
