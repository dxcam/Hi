public class CamilaCaicedoSN4 {
    public void ccSN4(int ccn){
        System.out.println();
        System.out.println("SERIE NUMERICA 4");
        int ccnum1 = 0, ccnum2 = 1, ccdenom1 = 2, ccvalor;

        for(int i = 0; i < ccn; i++){
            System.out.print(ccnum1 + "/" + ccdenom1 + " ");

            ccvalor = ccnum1 + ccnum2;
            ccnum1 = ccnum2;
            ccnum2 = ccvalor;

            ccdenom1 += 2;
        }
    }
}
