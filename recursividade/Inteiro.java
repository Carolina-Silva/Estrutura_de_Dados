public class Inteiro {

    public Inteiro() {

    }
    public int fatorialR(int n) {
        if (n > 1) {
            return fatorialR(n - 1) * n;
        }
        return 1;
    }

    public int somatoriaR(int n) {
        if(n>1){
            return somatoriaR(n-1) + n;
        }
        return n;
    }

}
