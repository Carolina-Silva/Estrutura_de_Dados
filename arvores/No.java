package arvores;

public class No {
    int elemento, ocorrencias;
    No esquerda,  direita;

    No(int e){
        elemento = e;
        esquerda = null;
        direita = null;
        ocorrencias = 0;
    }
}
