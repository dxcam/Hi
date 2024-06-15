public class CamilaCaicedoL04 {
    public void ccL04(){
        System.out.println();
        System.out.println("LOADING 4: ");
       
        String[] ccsigno = {"o0o", "0oo", "oo0", "o0o"};
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r"  + ccsigno[i % 4] + " " + i + "%" ); 

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
