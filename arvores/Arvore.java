package arvores;

public class Arvore {
    private No raiz;
    public Arvore(){
        raiz = null;
    }

    // add elemento
    public void addElemento(int e){
        No novo = new No(e);
        if (raiz == null){
            raiz = novo;
        }else{
            No aux1 = raiz, aux2 = raiz;
            while (aux1 )
        }
    }


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
