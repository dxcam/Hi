public class JairoAnguloSC3 {
    public void SerieCaractere3For(int num){
        System.out.println("SERIE DE CARACTERES 3");
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<num;i++){
            for(int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.print(" ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }
}
