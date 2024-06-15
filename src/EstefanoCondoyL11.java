public class EstefanoCondoyL11 {
        // Secuencias de escape ANSI para colorear texto
        private static final String ANSI_RESET = "\u001B[0m";
        private static final String ANSI_GREEN = "\u001B[32m";
        private static final String ANSI_RED = "\u001B[31m";
    
        // Método para dibujar la señal
        public void dibujarSenal(int longitud) {
            for (int i = 0; i < longitud; i++) {
                // Calcular el número de rayas a la izquierda y derecha
                int numRayas = i + 1;
                // Construir la línea con las rayas y el eje central
                StringBuilder linea = new StringBuilder();
                for (int j = 0; j < numRayas; j++) {
                    linea.append(ANSI_GREEN + "-" + ANSI_RESET);
                }
                linea.append(ANSI_RED + "|" + ANSI_RESET);
                for (int j = 0; j < numRayas; j++) {
                    linea.append(ANSI_GREEN + "-" + ANSI_RESET);
                }
                // Mostrar la línea con el nivel
                System.out.println(linea.toString() + "  Nivel " + (i + 1));
            }
        }
}
    

