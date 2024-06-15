public class JairoAnguloSN6 {
    public void SerieNumerica6For(int num){
        System.out.println("SERIE NUMERICA 6");
    
        int a=2;
        int b=1;
        for(int i=0; i<num; i++){            
            System.out.print((b)+" ");
            a=a+1;
            b=a+b;
            a++;
        }
        System.out.println();
    }

    
}
