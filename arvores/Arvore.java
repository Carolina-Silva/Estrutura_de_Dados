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


    //metodos atv andreia---------------------------------------------------------------------

     public void metodoA(int e){ 
       No novo = new No(e); 
        if (raiz == null) 
            raiz = novo; 
        else{ 
            No aux2=metodoB(raiz, raiz, e);
            if (e == aux2.elemento) 
                System.out.println("Elemento já existe"); 
            else{ if (e < aux2.elemento)   
               aux2.esquerda = novo; 
           if (e > aux2.elemento)   
                aux2.direita = novo; 
            } 
        }
    }
    public No metodoB(No aux1, No aux2, int e){
   if (aux1 != null && e != aux2.elemento){ 
      aux2=aux1; 
      if (e>aux1.elemento) 
        return metodoB(aux1.direita, aux2, e); 
      if (e<aux1.elemento)
        return metodoB(aux1.esquerda, aux2, e);
    }
   return aux2;
    }


//------------------------------------------------------------------------
 public void metodoC(String e){ 
        No novo = new No(e); 
        if (raiz == null) 
            raiz = novo; 
        else{ 
            No aux2=metodoD(raiz, raiz, e);
            if (e == aux2.elemento) 
                aux2.ocorrencias++;
            else{ if (e.compareTo(aux2.elemento)<0)   
                aux2.esquerda = novo; 
            if (e.compareTo(aux2.elemento)>0)   
                aux2.direita = novo; 
            }
        }
    }
        public No metodoD(No aux1, No aux2, String e){
            if (aux1 != null && !e.equals(aux2.elemento)){ 
                aux2=aux1; 
                if (e.compareTo(aux2.elemento)<0) 
                   return metodoD(aux1.esquerda, aux2, e);
                else if (e.compareTo(aux2.elemento)>0) 
                   return metodoD(aux1.direita, aux2, e); 
            }
            return aux2;
        }
        
        public void mostra(No n, int o){
            if (n != null && o <= n.ocorrencias){
                System.out.println(" "+n.elemento);
                mostra(n,o+1);
            }
        }
//------------------------------------------------------------------------

    public void metodoA(int e){ 
       No novo = new No(e); 
        if (raiz == null) 
            raiz = novo; 
        else{ 
            No aux2=metodoB(raiz, raiz, e);
            if (e == aux2.elemento) 
                System.out.println("Elemento já existe"); 
            else{ if (e < aux2.elemento)   
               aux2.esquerda = novo; 
           if (e > aux2.elemento)   
                aux2.direita = novo; 
            } 
        }
    }
 public No metodoB(No aux1, No aux2, int e){
   if (aux1 != null && e != aux2.elemento){
      aux2=aux1;
      if (e>aux1.elemento)
        return metodoB(aux1.direita, aux2, e);
      if (e<aux1.elemento)
        return metodoB(aux1.esquerda, aux2, e);
    }
   return aux2;
 }

//------------------------------------------------------------------------

public void metodoA(int e){ 
        No novo = new No(e); 
        if (raiz == null) 
            raiz = novo; 
        else{ 
            No aux2=metodoB(raiz, raiz, e);
            if (e == aux2.elemento) 
                System.out.println("Elemento já existe"); 
            else{ if (e < aux2.elemento)   
                aux2.esquerda = novo; 
            if (e > aux2.elemento)   
                aux2.direita = novo; 
            } 
        }
    }
    public No metodoB(No aux1, No aux2, int e){
        if (aux1 != null && e != aux2.elemento){ 
            aux2=aux1; 
            if (e<aux1.elemento) 
                return metodoB(aux1.esquerda, aux2, e);
            else if (e>aux1.elemento) 
                return metodoB(aux1.direita, aux2, e); 
        }
        return aux2;
    }

    //
}
