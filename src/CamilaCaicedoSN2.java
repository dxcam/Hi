public class CamilaCaicedoSN2 {
    public void ccSN2(int ccn){
        System.out.println();
        System.out.println("SERIE NUMERICA 2");
        int ccvalor1 = 1;
        /*System.out.println();*/
        for(int i = 0; i <= ccn; i++){
            if(i % 2==0){
                System.out.print(ccvalor1 + " ");
                ccvalor1 += 2;
            }else{
                System.out.print("0 ");
            }
        }
    }
}