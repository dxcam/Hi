public class EstefanoCondoyRec {
    // R01: Factorial
    // R01: Factorial con memoización
    public static int factorialR01(int n, int[] memo) {
        if (n == 0) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = n * factorialR01(n - 1, memo);
        return memo[n];
    }

    // R02: Suma de `a` y `b`
    public static int sumaR02(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return sumaR02(a + 1, b - 1);
        }
    }

    // R03: Multiplicación de `a` y `b`
    public static int multiplicacionR03(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiplicacionR03(a, b - 1);
        }
    }

    // R04: Potencia de `a` elevado a `b` con memoización
    public static int potenciaR04(int a, int b, int[] memo) {
        if (b == 0) {
            return 1;
        }
        if (memo[b] != 0) {
            return memo[b];
        }
        memo[b] = a * potenciaR04(a, b - 1, memo);
        return memo[b];
    }

    // R05: Conteo Progresivo Hasta `n`
    public static void conteoProgresivoHastaR05(int n) {
        if (n > 0) {
            conteoProgresivoHastaR05(n - 1);
        }
        System.out.print(n + " ");
    }

    // R06: Conteo Regresivo desde `n` hasta 0
    public static void conteoRegresivoR06(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            conteoRegresivoR06(n - 1);
        }
    }
}
