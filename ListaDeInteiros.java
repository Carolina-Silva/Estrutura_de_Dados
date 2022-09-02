
public class ListaDeInteiros{
    //atributos
    private int dados[];
    private int tamanho;


    //metodos
    public ListaDeInteiros(int capacidade){ //metodo construtor
        dados = new int[capacidade];
        tamanho = 0;
    }
    public int removeInicio() {
        int r = -1;
        if (tamanho == 0){
            System.out.println("Erro lista vazia");
        }else{
            r = dados[0];
            for (int i = 1; i <= tamanho-1; i++){
                dados[i-1]= dados[i];
                tamanho --;
            }

        }
        return r;
    }
    public void adicionaInicio(){
        if (tamanho == dados.length){
            System.out.println("Lista cheia");
        }else{
            for(int i = tamanho -1; i>=0; i--){
                dados[i+1]= dados[i]
                dados[0]=e;
                tamanho ++;
            }
        }
    }

    public int removeFinal(){
        int r  = Integer.MIN_VALUE;
        if (tamanho == 0){
            System.out.println("ERRO: lista vazia");
        }else{
            r = dados[tamanho-1];
            tamanho = tamanho -1;
        }
        return r;
    }
    // public int removeFinal(){ // alternativa de código
    //     if (tamanho = 0){
    //         System.out.println("ERRO: lista vazia");
    //         return Integer.MIN_VALUE;
    //     }
    //     return dados[--tamanho];
    // }

    public void adicionaFinal(int e){
        if (tamanho == dados.length){
            System.out.println("Lista cheia");
        }else{
            dados[tamanho++] = e;
        }
    }
    public String toString(){
        String r = "";
        for(int i =0; i < tamanho; i ++){
            r = r + dados[i] + "\t";
        }
        r = r + "Quantidade de Elementos: "+tamanho;
        return r;
    }
}