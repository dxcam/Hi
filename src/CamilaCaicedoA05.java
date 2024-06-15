public class CamilaCaicedoA05 {

    public void ccA05(){
        System.out.println();
        System.out.println("ARRAY 5");
        char [] ccnombreCompleto = {'C','a','m','i','l','a','D','a','n','i','e','l','a','C','a','i','c','e','d','o','A','l','c','i','v','a','r'};
        int cccsize = 5;
        
        Character [][] matriz = new Character[cccsize][cccsize];
        for(int i = 0; i < ccnombreCompleto.length; i++){
            int ccfila, cccolumna;
            ccfila = (int)(Math.random()*5);
            cccolumna = (int)(Math.random()*5);
            matriz[ccfila][cccolumna] = (matriz[ccfila][cccolumna] !=null) ? '*' : ccnombreCompleto[i];
        }

        for (Character[] ccfila : matriz) {
            for (Character cccolumna : ccfila) {
                System.out.print((cccolumna == null) ? "    " : cccolumna + "   ");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
            System.out.println();
        }
    }
}
