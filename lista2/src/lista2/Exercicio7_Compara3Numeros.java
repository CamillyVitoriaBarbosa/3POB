package lista2;

import java.util.Scanner;

public class Exercicio7_Compara3Numeros {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Digite o 1° número: ");
	int num1 = scanner.nextInt();
	System.out.print("Digite o 2° número: ");
	int num2 = scanner.nextInt();
	System.out.print("Digite o 3° número: ");
	int num3 = scanner.nextInt();
	   
	if (num1<num2 && num3<num2) {
	    System.out.println("O maior número é o: "+ num2);
	} else if (num2<num1 && num3<num1) {
	    System.out.println("O maior número é o: "+ num1);
	} else if (num1<num3 && num2<num3) {
	    System.out.println("O maior número é o: "+ num3);
	} else {
	    System.out.println("Eles são iguais: "+ num1);
	}
	    
	scanner.close();
    }
}
