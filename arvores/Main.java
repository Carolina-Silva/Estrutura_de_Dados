package arvores;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Arvore a = new Arvore();
		a.addElemento(10);
		a.addElemento(5);
		a.addElemento(20);
		a.addElemento(6);
		a.addElemento(1);
		a.addElemento(16);
		System.out.println("Pré Ordem");
		a.preOrdem(a.getRaiz());
		System.out.println("Pos Ordem");
		a.posOrdem(a.getRaiz());
		System.out.println("Em Ordem");
		a.emOrdem(a.getRaiz());

		a.addElemento2(10);
		a.addElemento2(5);
		a.addElemento2(20);
		a.addElemento2(6);
		a.addElemento2(1);
		a.addElemento2(16);
		System.out.println("Em Ordem (decrescente)");
		a.emOrdem(a.getRaiz());
		
	}
}
