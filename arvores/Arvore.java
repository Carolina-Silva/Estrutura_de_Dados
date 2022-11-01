package arvores;

public class Arvore {
    private No raiz;
    public Arvore(){
        raiz = null;
    }

    // add elemento


    // mostrar elementos
    public void preOrdem(No n){
        if (n != null){
            System.out.println(n.elemento);
            preOrdem(n.esquerda);
            preOrdem(n.direita);
        }
    }

    // Soma elementos
    public int somaPreOrdem(No n){
        if (n != null){
            return n.elemento + somaPreOrdem(n.esquerda) +
            somaPreOrdem(n.direita);
        }
        return 0;
    }

    //
}
