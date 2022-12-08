public class Inteiro {

    public Inteiro() {

    }
    public int fatorialR(int n) {
        // if (n > 1) {
        //     return fatorialR(n - 1) * n;
        // }
        // return 1; ///DOIS MÉTODOS POSSIVEIS//

        if (n==1 || n == 0){
            return 1;
        }
        return fatorialR(n - 1) * n;
    }
//     int fat = 1;
// int valor = 5; //ou qualquer outro valor que queira calcular;

// for( int i = 2; i <= valor; i++ )
// {
// fat *= i;
// }

// System.out.println( "O fatorial de " + valor + " é igual a " + fat );
// }

    public int somatoriaR(int n) {
        if(n>1){
            return somatoriaR(n-1) + n;
        }
        return n;
    }

    public double somatoria2(int n){
        if(n>=2){
            return somatoria2(n/2) + 1.0/n;
        }
        return 0;
    }

    public int fibonacci(int n){
        if( n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // fibonat vet
    public void fibonacciVet(int vet[], int n){
        if(n == 1){
            vet[n-1] = 1;
        }else if(n == 2){
            fibonacciVet(vet, n-1);
            vet[n-1] = 1;
        }else{
            fibonacciVet(vet, n-1);// recurcividade
            vet[n-1] = vet[n-2] + vet[n-3];
        }
    }

    public int mdc(int m, int n){
        int r = m % n ;
        if(r == 0)
            return n;
        return mdc(n,r);
    }
}
