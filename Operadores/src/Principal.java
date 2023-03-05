import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		Scanner receber1 = new Scanner(System.in);
		System.out.println("Escreva a primeira nota: ");
		nota1 = receber1.nextDouble();
		
		Scanner receber2 = new Scanner(System.in);
		System.out.println("Escreva a segunda nota: ");
		nota2 = receber2.nextDouble();
		
		Scanner receber3 = new Scanner(System.in);
		System.out.println("Escreva a terceira nota: ");
		nota3 = receber3.nextDouble();
		
		Scanner receber4 = new Scanner(System.in);
		System.out.println("Escreva a quarta nota: ");
		nota4 = receber4.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		
		System.out.println(media);

	}

}
