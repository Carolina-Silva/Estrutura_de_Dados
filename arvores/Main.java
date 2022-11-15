package arvores;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Arvore a = new Arvore();
		a.addElemento(25);
		a.addElemento(83);
		a.addElemento(16);
		a.addElemento(36);
		a.addElemento(9);
		a.addElemento(13);
		a.addElemento(18);
		a.addElemento(64);
		a.addElemento(21);
		a.addElemento(17);
		a.addElemento(39);
		a.addElemento(5);
		a.addElemento(30);
		a.addElemento(92);
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
