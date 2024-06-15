import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        //Declarar e instanciar
        ChristopherCriolloSN12 oCCSN12 = new ChristopherCriolloSN12();
        ChristopherCriolloSC7 oCCSC7   = new ChristopherCriolloSC7();
        ChristopherCriolloSC8 oCCSC8   = new ChristopherCriolloSC8();
        ChristopherCriolloF7 oCCF7     = new ChristopherCriolloF7();
        ChristopherCriolloF13 oCCF13   = new ChristopherCriolloF13();
        ChristopherCriolloF18 oCCF18   = new ChristopherCriolloF18();
        ChristopherCriolloF19 oCCF19   = new ChristopherCriolloF19();
        // ChristopherCriolloC7 oCCC07    = new ChristopherCriolloC7();
        ChristopherCriolloA01 oCCA01   = new ChristopherCriolloA01();
        ChristopherCriolloL06 oCCL06   = new ChristopherCriolloL06();
        ChristopherCriolloL07 oCCL07   = new ChristopherCriolloL07();

        EstefanoCondoySN7 oECSN7 = new EstefanoCondoySN7();
        EstefanoCondoySN8 oECSN8 = new EstefanoCondoySN8();
        EstefanoCondoyF8  oECF8 = new EstefanoCondoyF8();
        EstefanoCondoyF12 oECF12 =new EstefanoCondoyF12();
        EstefanoCondoyF14 oECF14 = new EstefanoCondoyF14();
        EstefanCondoyF15 oECF15 =new EstefanCondoyF15();
        EstefanoCondoyF17 oECF17 = new EstefanoCondoyF17();
        EstefanoCondoyA03 oArray3 = new EstefanoCondoyA03();
        EstefanoCondoyC02 oECC02 =new EstefanoCondoyC02();
        EstefanoCondoyC06 oECC06 = new EstefanoCondoyC06();

        CamilaCaicedoSN1 oCCSN1 = new CamilaCaicedoSN1();
        CamilaCaicedoSN2 oCCSN2 = new CamilaCaicedoSN2();
        CamilaCaicedoSN3 oCCSN3 = new CamilaCaicedoSN3();
        CamilaCaicedoSN4 oCCN4 = new CamilaCaicedoSN4();
        CamilaCaicedoSC9 oCCSC9 = new CamilaCaicedoSC9();
        CamilaCaicedoSC10 oCCSC10 = new CamilaCaicedoSC10();
        CamilaCaicedoF1 oCCF1 = new CamilaCaicedoF1();
        CamilaCaicedoF10 oCCF10 = new CamilaCaicedoF10();
        CamilaCaicedoF11 oCCF11 = new CamilaCaicedoF11();
        CamilaCaicedoL01 oCCL01 = new CamilaCaicedoL01();
        CamilaCaicedoL04 oCCL04 = new CamilaCaicedoL04();
        CamilaCaicedoL08 oCCL08 = new CamilaCaicedoL08();
        CamilaCaicedoL10 oCCL10 = new CamilaCaicedoL10();
        CamilaCaicedoL10 simulator = new CamilaCaicedoL10();
        CamilaCaicedoA05 oCCA05 = new CamilaCaicedoA05();

        JairoAnguloSN5 oJASN5 = new JairoAnguloSN5();
        JairoAnguloSN6 oJASN6 = new JairoAnguloSN6();
        JairoAnguloSC3 oJASC3 = new JairoAnguloSC3();
        JairoAnguloSC4 oJASC4 = new JairoAnguloSC4();
        JairoAnguloF4 oJAF4 = new JairoAnguloF4();
        JairoAnguloF2 oJAF2 = new JairoAnguloF2();
        JairoAnguloF5 oJAF5 = new JairoAnguloF5();
        JairoAnguloF9 oJAF9 = new JairoAnguloF9();

        JoanBedonF16 oJBF16 = new JoanBedonF16();
        JoanBedonF6 oJBF6 = new JoanBedonF6();
        JoanBedonSC1 oJBSC1 = new JoanBedonSC1();
        JoanBedonSC2 oJBSC2 = new JoanBedonSC2();
        JoanBedonF3 oJBF3 = new JoanBedonF3();
        JoanBedonSC5 oJBSC5 = new JoanBedonSC5();
        JoanBedonSC6 oJBSC6 = new JoanBedonSC6();
        JoanBedonSN9 oJBSN9 = new JoanBedonSN9();
        JoanBedonSN10 oJBSN10 = new JoanBedonSN10();



        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("*                               *");
        System.out.println("*            GRUPO 1            *");
        System.out.println("*                               *");
        System.out.println("*********************************");
        System.out.println("   Integrantes: "+"\n - Angulo.Jairo"+"\n - Bedon.Joan"+"\n - Caicedo.Camila"+"\n - Condoy.Estefano"+"\n - Criollo.Christopher");
        System.out.println("\n*********************************");
        System.out.print("Ingrese un numero: ");
        int numeroPos = sc.nextInt();



        // Metodo

        //**************************SERIE NUMERICA**************************
        //SN1
        System.out.println();
        oCCSN1.ccSN1(numeroPos);
        //SN2
        System.out.println();
        oCCSN2.ccSN2(numeroPos);
        //SN3
        System.out.println();
        oCCSN3.ccSN3(numeroPos);
        //SN4
        System.out.println();
        oCCN4.ccSN4(numeroPos);
        System.out.println();
        //SN5
        oJASN5.SerieNumerica5For(numeroPos);
        System.out.println();
        //SN6
        oJASN6.SerieNumerica6For(numeroPos);
        System.out.println();
        //SN7
        System.out.println();
        oECSN7.SerieNumerica7(numeroPos);
        //SN8
        System.out.println();
        oECSN8.SerieNumerica8(numeroPos);
        //SN9
        System.out.println();
        oJBSN9.SerieNumerica9(numeroPos);
        //SN10
        System.out.println();
        oJBSN10.SerieNumerica10(numeroPos);
        //SN12
        System.out.println();
        oCCSN12.SerieNumerica12(numeroPos);
        System.out.println();    
        //**************************SERIE CARATERES**************************
        //SC1
        oJBSC1.SerieCaractere1For(numeroPos);
        System.out.println();
        //SC2
        oJBSC2.SerieCaractere2For(numeroPos);
        System.out.println();
        //SC3
        oJASC3.SerieCaractere3For(numeroPos);
        System.out.println();
        //SC4
        oJASC4.SerieCaractere4For(numeroPos);
        System.out.println();
        //SC5
        oJBSC5.SerieCaractere5For(numeroPos);
        System.out.println();
        //SC6
        oJBSC6.SerieCaractere6For(numeroPos);
        System.out.println();
        //SC7
        oCCSC7.SerieCaracter7(numeroPos);
        System.out.println();
        //SC8
        oCCSC8.SerieCaracter8(numeroPos);
        System.out.println();
        //SC9
        oCCSC9.ccSC9(numeroPos);
        System.out.println();
        //SC10
        oCCSC10.ccSC10(numeroPos);
        System.out.println();
        //******************************FIGURAS******************************
        //F1
        oCCF1.ccF1(numeroPos);
        System.out.println();
        //F2
        oJAF2.Figura2For(numeroPos);
        System.out.println();
        //F3
        oJBF3.Figura3For(numeroPos);
        System.out.println();
        //F4
        oJAF4.Figura4For(numeroPos);
        System.out.println();
        //F5
        oJAF5.Figura5For(numeroPos);
        System.out.println();
        //F6
        oJBF6.Figura6For(numeroPos);
        System.out.println();
        //F7
        oCCF7.Figura7(numeroPos);
        System.out.println();
        //F8
        oECF8.Figura8(numeroPos);
        System.out.println();
        //F9
        oJAF9.Figura9For(numeroPos);
        System.out.println();
        //F10
        oCCF10.ccF10(numeroPos);
        System.out.println();
        //F11
        oCCF11.ccF11(numeroPos);
        System.out.println();
        //F12
        oECF12.Figura12(numeroPos);
        System.out.println();
        //F13
        oCCF13.Figura13(numeroPos);
        System.out.println();
        //F14
        oECF14.Figura14(numeroPos);
        System.out.println();
        //F15
        oECF15.Figura15(numeroPos);
        System.out.println();
        //F16
        oJBF16.Figura16(numeroPos);
        System.out.println();
        //F17
        oECF17.Figura17(numeroPos);
        System.out.println();
        //F18
        oCCF18.Figura18(numeroPos);
        System.out.println();
        //F19
        oCCF19.Figura19(numeroPos);
        System.out.println();
        //*************************CADENA CARACTERES*************************
        //C02
        System.out.print("CADENA 2) Ingresa una palabra: ");
        sc.nextLine();
        String palabraIngresada = sc.nextLine();
        oECC02.cadena2(palabraIngresada);
        System.out.println();
        //C03
        EstefanoCondoyC03 oCadena3 = new EstefanoCondoyC03();
        System.out.println("[ Cad. 3 ] - Elimina vocales de una palabra");
        System.out.print("Ingresa una vocal: ");
        String vocal = sc.nextLine();
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        oCadena3.cadena3(vocal, palabra);
        System.out.println();
        //C06
        System.out.print("CADENA 6) - Ingresa una frase: ");
        String fraseoriginal = sc.nextLine();
        oECC06.cadena6(fraseoriginal);
        System.out.println();
        //C07
         //oCCC07.Cadena07();
        System.out.println();

        // //******************************ARRAYS*******************************
        //A01
        oCCA01.array01();
        System.out.println();
        //A02
        ChristopherCriolloA02.array02();
        System.out.println();
        //A03
        System.out.print("ARRAY 3 ) Ingrese su nombre completo: ");
        String name = sc.nextLine();
        oArray3.array03(name);
        System.out.println();
        //A05
        oCCA05.ccA05();
        System.out.println();
        //******************************LOADING*******************************
        
        //L01
        oCCL01.ccL01();
        System.out.println();
        //L04
        oCCL04.ccL04();
        System.out.println();
        //L06
        oCCL06.loading06();
        System.out.println();
        //L07
        oCCL07.loading07();
        System.out.println();
        //L08
        String ccNombreApellido = "Camila Caicedo";
        oCCL08.ccL08(ccNombreApellido);
        System.out.println();
        //L10
        oCCL10.ccL10();
        simulator.ccL10();
        System.out.println();
        //L11
        int longitud = generarLongitudAleatoria();
        
        System.out.println("Longitud de la señal generada: " + longitud);

        // Crear una instancia de la clase que dibuja la señal
        EstefanoCondoyL11 dibujador = new EstefanoCondoyL11();
        
        // Dibujar la señal
        dibujador.dibujarSenal(longitud);

        //******************************RECURSIÓN*******************************
        // Obtener entrada del usuario para cada método recursivo
        System.out.print("R01) Ingrese un número para calcular el factorial: ");
        int nFactorial = sc.nextInt();
        System.out.println("Factorial(" + nFactorial + "): " + EstefanoCondoyRec.factorialR01(nFactorial, new int[nFactorial + 1]));

        System.out.print("R02) Ingrese el primer número para la suma: ");
        int aSuma = sc.nextInt();
        System.out.print("Ingrese el segundo número para la suma: ");
        int bSuma = sc.nextInt();
        System.out.println("Suma(" + aSuma + ", " + bSuma + "): " + EstefanoCondoyRec.sumaR02(aSuma, bSuma));

        System.out.print("R03)Ingrese el primer número para la multiplicación: ");
        int aMultiplicacion = sc.nextInt();
        System.out.print("Ingrese el segundo número para la multiplicación: ");
        int bMultiplicacion = sc.nextInt();
        System.out.println("Multiplicacion(" + aMultiplicacion + ", " + bMultiplicacion + "): " + EstefanoCondoyRec.multiplicacionR03(aMultiplicacion, bMultiplicacion));

        System.out.print("R04) Ingrese la base para la potencia: ");
        int basePotencia = sc.nextInt();
        System.out.print("Ingrese el exponente para la potencia: ");
        int exponentePotencia = sc.nextInt();
        System.out.println("Potencia(" + basePotencia + ", " + exponentePotencia + "): " + EstefanoCondoyRec.potenciaR04(basePotencia, exponentePotencia, new int[exponentePotencia + 1]));

        System.out.print("R05)Ingrese un número para el conteo progresivo: ");
        int nProgresivo = sc.nextInt();
        System.out.print("Conteo Progresivo Hasta(" + nProgresivo + "): ");
        EstefanoCondoyRec.conteoProgresivoHastaR05(nProgresivo);
        System.out.println();

        System.out.print("R06) Ingrese un número para el conteo regresivo: ");
        int nRegresivo = sc.nextInt();
        System.out.print("Conteo Regresivo(" + nRegresivo + "): ");
        EstefanoCondoyRec.conteoRegresivoR06(nRegresivo);
        sc.close();
    }

    private static int generarLongitudAleatoria() {
        Random random = new Random();
        return random.nextInt(11);
        
        
    }
}
