public class CamilaCaicedoL01 {
    public void ccL01(){
        System.out.println(); 
        System.out.println("LOADING 1: ");
        String ccsigno[] = {"|", "/", "-", "\\"};
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + ccsigno[i % 4] + " " + i + "%");
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
      

