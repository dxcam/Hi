public class CamilaCaicedoL08 {
    public void ccL08(String ccNombreApellido){
        System.out.println();
        System.out.println("LOADING 8: ");
        String ccletras = "";
        short cccontador = -1;
        int ccpatron = 100 / ccNombreApellido.length();
        for (int i = ccpatron; i < ccpatron * ccNombreApellido.length() + 1; i += ccpatron) {
            cccontador++;
            ccletras += ccNombreApellido.charAt(cccontador);
            System.out.print(
                    "\r" + "[" + ccletras + " ".repeat(ccNombreApellido.length() - 1 - cccontador) + "] " + i + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\r" + "[" + ccletras + "] " + "100%");
    }
}
