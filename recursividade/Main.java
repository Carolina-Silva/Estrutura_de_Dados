import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		Inteiro i1 = new Inteiro();
		System.out.println("Apresente o valor que quer calcular o Fatorial: ");
		int n = sc.nextInt();
        int fatorial = i1.fatorialR(n);
        int somatoria = i1.somatoriaR(n);
        System.out.println("Fatorial:\n" + fatorial);
        System.out.println("Somatória:\n" + somatoria);
	}
}
