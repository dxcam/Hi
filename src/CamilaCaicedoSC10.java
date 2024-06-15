public class CamilaCaicedoSC10 {
    public void ccSC10(int ccn){
        System.out.println();
        System.out.println("SERIE DE CARACTERES 10");
        int cctermino1 = 0, cctermino2 = 1, cctermino3;
        char ccletra = 'c';
        System.out.print("a " + "b ");
        for(int i = 1; i <= ccn; i++){
            cctermino3 = cctermino1 + cctermino2;
            for(int j = 0; j < cctermino3; j++){
                System.out.print(" " + ccletra);
            }
            ccletra++;
            cctermino1 = cctermino2;
            cctermino2 = cctermino3;
            System.out.print(" ");
        }
    }
}

