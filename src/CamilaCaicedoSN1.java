public class CamilaCaicedoSN1 {
    public void ccSN1(int ccn){
        System.out.println("SERIE NUMERICA 1");
        int ccvalor1, ccvalor2, ccvalor3;
        ccvalor1 =  0;
        ccvalor2 = 1;

        for (int i = 0; i < ccn; i++){
            ccvalor3 = ccvalor1 + ccvalor2;
            ccvalor1 = ccvalor2;
            ccvalor2 = ccvalor3;
            System.out.print(ccvalor1 + " ");
        }
    }
}