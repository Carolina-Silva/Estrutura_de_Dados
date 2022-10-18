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
}
