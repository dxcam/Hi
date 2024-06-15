public class JairoAnguloA04 {
  
    public void nombreMatriz (String nombre, String apellido){
        
        int tamanioMatriz=0;
        if (nombre.length()>apellido.length()) {
            tamanioMatriz = nombre.length();
        }else{
            tamanioMatriz = apellido.length();
        }

        if (tamanioMatriz%2!=0) {
            tamanioMatriz++;
        }
        char [][] matriz = new char[tamanioMatriz][tamanioMatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=' ';
            }
        }
        for (int i = 0, j=matriz.length-1; i < matriz.length; i++, j--) {
            if (i < nombre.length()) {
                matriz[i][i] = nombre.charAt(i);
            }
            if (i < apellido.length()) {
                matriz[i][j] = apellido.charAt(i);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
