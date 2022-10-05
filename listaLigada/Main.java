public class Main{
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adicionaInicio(10); // 10 
        lista.adicionaInicio(20); // 20 - 10
        lista.adicionaInicio(30); //30 - 20 - 10


         System.out.print("Estado Atual: " + lista.toString()+ "\n");

        System.out.println("rodando remove inicio");
        int x = lista.removeInicio();

        System.out.printf("\nItem removido = %d\n", x);
        
        System.out.print("Estado Atual: " + lista.toString()+ "\n");
        
        System.out.println("rodando adiciona Final");
        lista.adicionaFinal(2);
        
        System.out.print("Estado Atual: " + lista.toString()+ "\n");
        
        System.out.println("rodando remove final");

         x = lista.removeFinal();
        System.out.printf("\nItem removido = %d\n", x);
        
        System.out.print("Estado Atual: " + lista.toString()+ "\n");

    }
}