package lista2;

import java.util.Scanner;

public class Exercicio5_ComparaNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o 1° número: ");
	    int num1 = scanner.nextInt();
	    System.out.print("Digite o 2° número: ");
	    int num2 = scanner.nextInt();
	   
	    if (num1<num2) {
	    	System.out.println("O maior número é o: "+ num2);
	    } else if (num2<num1) {
	    	System.out.println("O maior número é o: "+ num1);
	    } else {
	    	System.out.println("Eles são iguais: "+ num1);
	    }
	    
	    scanner.close();
	}

}
