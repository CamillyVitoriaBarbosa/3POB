package lista2;

import java.util.Scanner;

public class Exercicio1_EhMenor {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Você é menor");
        }
        
        scanner.close();
     }
}
