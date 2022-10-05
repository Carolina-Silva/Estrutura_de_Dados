public class ListaLigada {
    private No inicio;

    public ListaLigada() {
        inicio = null;
    }

    public void adicionaInicio(int e) {
        //instancia novo No
        No novo = new No(e);
        //atribui o endereco do novo no que esta no inicioao atributo prox do novo No 
        novo.prox = inicio;
        //atribui endereco do  do novo ao inicio;
        inicio = novo;
    }

    public int removeInicio() {
        // variavel para retornar elemento removido
        int r = -1;
        //teste de lista vazia ou não
        if (inicio == null) {
            System.out.println("ERRO: Lista vazia");
        }else{
            // pega elemento do inicio e coloca para retornar 
            r = inicio.dado;
            // pula um elemento tornando o segundo elemento o primeiro da lista
            inicio = inicio.prox;
        }
        return r;
    }

    public void adicionaFinal(int e){
        No novo = new No(e);
        if (inicio == null){
            inicio = novo;
        }else{
            No aux = inicio;
            while(aux.prox != null){
                aux = aux.prox;
            }
            aux.prox = novo;
        }
    }


    public int removeFinal(){
        int r = -1;
        if (inicio == null) {
            System.out.println("ERRO: Lista vazia");
        }else if(inicio.prox != null){
            No aux1 = inicio;
            No aux2 = null;
            while(aux1.prox != null){
                aux2 = aux1;
                aux1 = aux1.prox;
            }
            r = aux1.dado;
            aux2.prox = null;
        }else{
            r = inicio.dado;
            inicio = null;
        }
        return r;
    }

    public String toString() {
        //criar um nó auxiliar para percorrer a lista
        No aux = inicio;
        //declara string que recebe elementos da lista
        String resp = "";
        //percorre lista enquanto nao ultrapassar o ultimo nó
        while (aux != null) {
            resp =  resp + " " + aux.dado;
            aux = aux.prox;
        }
        return resp;
    }
}