public class CamilaCaicedoSN3 {
    public void ccSN3(int ccn){
        System.out.println();
        System.out.println("SERIE NUMERICA 3");
        int ccnum1 = 0, ccnum2 = 1, ccdenom1 = 1, ccvalor;
        for(int i = 0; i < ccn; i++){
            System.out.print(ccnum1 + "/" + ccdenom1 + " ");

            ccvalor = ccnum1 + ccnum2;
            ccnum1 = ccnum2;
            ccnum2 = ccvalor;

            ccdenom1 += 2;
        }
    }
}