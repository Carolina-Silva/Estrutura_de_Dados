class Main {
    public static void main(String[] args) {
        ListaDeInteiros lista1 = new ListaDeInteiros(3);
        lista1.adicionaFinal(15);
        lista1.adicionaFinal(30);
        lista1.adicionaFinal(53);
        lista1.adicionaFinal(9);

        System.out.println(lista1.toString());
    }
}