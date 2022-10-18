import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		Inteiro i1 = new Inteiro();
		System.out.println("Apresente o valor que quer calcular o Fatorial, Somatória 1 e 2: ");
		int n = sc.nextInt();
        int fatorial = i1.fatorialR(n);
        int somatoria1 = i1.somatoriaR(n);
        double somatoria2 = i1.somatoria2(n);
        System.out.printf("Fatorial: %d\nSomatória 1: %d\nSomatória 2: %.3f", fatorial, somatoria1,somatoria2);
        int fibo = i1.fibonacci(n);
        System.out.printf("\nNa sequencia de Fibonacci o %d° elemento é o %d ", n, fibo);
        
	}
}
