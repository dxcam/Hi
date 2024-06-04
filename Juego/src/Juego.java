public class Juego {
    public Jugador usuario;
    private String barca;
    private String rio;
    private String[] ladoIzq;
    private String[] ladoDer;
    private Boolean vikingoEstaIzq;

    public Juego(){
    
        this.rio = "-".repeat(20);
        this.barca = "\\_V_;_?_/";
        this.ladoIzq = new String[] {"V","L","C","U"};
        this.ladoDer = new String[] {"","","",""};
        this.vikingoEstaIzq = true;
    }

    // + jugarLobito(): bool
    public boolean jugarLobito(){
        while (mostrarMenu());
        return true;
    }
    public boolean mostrarMenu(){
        int opc = -1;
        System.out.println("\n                    "+ barca + rio);
        System.out.println("\n 0 Vikingo va solo "
                          +"\n 1 Lobo             "
                          +"\n 2 Caperucita       "
                          +"\n 3 Uvas             "
                          +"\n 4 Salir            ");
    do{
        try{
            opc = -1;
            System.out.println("\n[+] Ingrese una opción: ");
            opc = App.sc.nextInt();
            //if(opc<4)
            //return(short) opc;
            if(opc==4){
                System.out.println("¡Te vere pronto...cobarde...!");
                System.exit(0);
            }
        }catch(Exception e){App.sc.next();}
    }
    while(opc >=4 || opc<0);
    //opc 0,1,2,3
    String individuo = " ";
    individuo = (vikingoEstaIzq)
                ? ladoIzq [opc]
                : ladoDer [opc];
    moverBarca(individuo);
    vikingoEstaIzq = !vikingoEstaIzq;
    return true;
    }

    private void moverBarca(String individuo){
        //
        if(vikingoEstaIzq)
            for(int i = 0; i < rio.length(); i++){
                String rioBarca = "\r"+".".repeat(i) + barca + ".".repeat(rio.length()-i);
                System.out.print(rioBarca);
                try{
                    Thread.sleep(200);
                }catch(InterruptedException e){}
            }
        else
            for(int i = rio.length(); i >= 0; i--){
                System.out.print("\r"+ ".".repeat(i)+barca);
                try{
                    Thread.sleep(200);
                }catch(InterruptedException e) {}
            }
    }
    // + verifiarRegla(): string
    

    private void setBarcaRio(int posicionBarca, String individuo){
        //barca      = "\\_V_,_?_/"
        String rioBarca =    "\r"
                            +".".repeat(posicionBarca) 
                            + barca.replace("?", individuo) 
                            + ".".repeat(rio.length()-posicionBarca-1);
        System.out.print(rioBarca);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
    }
}

