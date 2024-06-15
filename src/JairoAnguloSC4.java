public class JairoAnguloSC4 {
    public void SerieCaractere4For(int num){
        System.out.println("SERIE DE CARACTERES 4");
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        for(int i=1;i<=num+1;i++){
            if(i==a){
                System.out.print("+ ");
                a+=5;
            }
            if(i==b){
                System.out.print("- ");
                b+=5;
            }  
            if(i==c){
                System.out.print("* ");
                c+=5;
            }
            if(i==d){
                System.out.print("/ ");
                d+=5;
            }
            
        }
        System.out.println();
    }
    
}
