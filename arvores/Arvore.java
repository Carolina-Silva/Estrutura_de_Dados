package arvores;

public class Arvore {
    private No raiz;
    public Arvore(){
        raiz = null;
    }

    public No getRaiz(){
        return raiz;
    }

    // add elemento
    public void addElemento(int e){
        No novo = new No(e);
        if (raiz == null){
            raiz = novo;
        }else{
            No aux1 = raiz, aux2 = raiz;
            while (aux1 != null){
                aux2 = aux1;
                if (e < aux1.elemento){
                    aux1 = aux1.esquerda;
                } else if(e > aux1.elemento){
                    aux1 = aux1.direita;
                }
            }
            if (e == aux2.elemento){
                System.out.println("Elemento já existe");
            }else{
                if( e < aux2.elemento){
                    aux2.esquerda = novo;
                }
                if( e > aux2.elemento){
                    aux2.direita = novo;
                }
                System.out.println("Elemento Incluído");
            }
        }
    }

    // add elemento2 ao contrario
    public void addElemento2(int e){
        No novo = new No(e);
        if (raiz == null){
            raiz = novo;
        }else{
            No aux1 = raiz, aux2 = raiz;
            while (aux1 != null){
                aux2 = aux1;
                if (e < aux1.elemento){
                    aux1 = aux1.direita;
                } else if(e > aux1.elemento){
                    aux1 = aux1.esquerda;
                }
            }
            if (e == aux2.elemento){
                System.out.println("Elemento já existe");
            }else{
                if( e < aux2.elemento){
                    aux2.direita = novo;
                }
                if( e > aux2.elemento){
                    aux2.esquerda = novo;
                }
                System.out.println("Elemento Incluído");
            }
        }
    }

    //remover nó folha
    

    //remover nó com 1 filho


    //remover nó com 2 filho



    // mostrar elementos pre ordem
    public void preOrdem(No n){
        if (n != null){
            System.out.println(n.elemento);
            preOrdem(n.esquerda);
            preOrdem(n.direita);
        }
    }
    // mostrar elementos pos ordem
    public void posOrdem(No n){
        if (n != null){
            posOrdem(n.esquerda);
            posOrdem(n.direita);
            System.out.println(n.elemento);
        }
    }
    // mostrar elementos em ordem
    public void emOrdem(No n){
        if (n != null){
            emOrdem(n.esquerda);
            System.out.println(n.elemento);
            emOrdem(n.direita);
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
