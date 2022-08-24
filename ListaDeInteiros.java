
public class ListaDeInteiros{
    //atributos
    private int dados[];
    private int tamanho;


    //metodos
    public ListaDeInteiros(int capacidade){ //metodo construtor
        dados = new int[capacidade];
        tamanho = 0;
    }
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