public class Main{
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adicionaInicio(10); // 10 
        lista.adicionaInicio(20); // 20 - 10
        lista.adicionaInicio(30); //30 - 20 - 10


        System.out.print(lista.toString()+ "\n");

        System.out.println("rodando remove inicio");

        int x = lista.removeInicio();

        System.out.print(lista.toString());
        System.out.printf("\nItem removido = %d", x);

    }
}