package com.mycompany.listas.model;

public class ListaLigada {

    private No inicio;

    /**
     * Construtor
     */
    public ListaLigada() {
        inicio = null;
    }

    /**
     * Metodo que adiciona um no com o novo elemento no inicio da lista
     *
     * @param valor e o novo elemento
     */
    public void adicionaInicio(int valor) {
        No novo = new No(valor);
        novo.prox = inicio;
        inicio = novo;

    }

    /**
     * Metodo que remove o primeiro elemento da lista
     *
     * @return retorna o elemento removido
     */
    public int removeInicio() {
        int r = -1;
        if (inicio == null) {
            System.out.println("ERRO! Lista Vazia!");
        } else {
            r = inicio.dado;
            inicio = inicio.prox;
        }
        return r;
    }

    @Override
    public String toString() {
        if (inicio == null) {
            return "Lista Vazia";
        }
        /*String r = "";
        No aux = inicio;
        while (aux != null) {
            r = r + " " + aux.dado;
            aux = aux.prox;
        }
        return r;------------------------------------ Sem recursividade*/
        return percorreLista(inicio);
    }

    /**
     * Médoto recursivo, que percorre uma lista ligada e
     * concatena seus elemento
     * @param aux -- primeiro nó
     * @return -- string com os elementos que foram concat
     */
    public String percorreLista(No aux) {
        if (aux != null) {
            return percorreLista(aux.prox) + " " + aux.dado;
        }
        return "";
    }

}
