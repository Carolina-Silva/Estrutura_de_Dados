public class Main {
    public static void main(String[] args) {
       Pilha dados = new Pilha(3);

       dados.vazia();
    //    dados.empilha(1);
    //    dados.empilha(2);
    //    dados.empilha(3);
       dados.cheia();

    //    dados.desempilha();

        System.out.println(dados.toString());
    }
}