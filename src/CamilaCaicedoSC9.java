public class CamilaCaicedoSC9 {
    public void ccSC9(int ccn){
        System.out.println();
        System.out.println("SERIE DE CARACTERES 9");
        char ccletra1 = 'a';
        int ccrep = 1;

        for (int i = 0; i < ccn; i++){
            for(int j = 0; j < ccrep; j++){
                System.out.print(ccletra1);
            }
            System.out.print(" ");

            ccletra1++;
            ccrep += 2;
        }
    }
}


