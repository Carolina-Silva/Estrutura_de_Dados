public class ListaLigadaAluno {
    private No inicio;

    public ListaLigadaAluno() {
        inicio = null;
    }

    public void adicionaInicio(Aluno e) {
        No novo = new No(e);
        novo.prox = inicio;
        inicio = novo;
    }

    public Aluno removeInicio() {
        Aluno r = null;
        if (inicio == null) {
            System.out.println("ERRO: Lista vazia");
        }else{
            r = inicio.dado;
            inicio = inicio.prox;
        }
        return r;
    }

    public void adicionaFinal(Aluno e){
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


    public Aluno removeFinal(){
        Aluno r = null;
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
        No aux = inicio;
        String resp = "";
        while (aux != null) {
            resp =  resp + " " + aux.dado;
            aux = aux.prox;
        }
        return resp;
    }
}