package lista2;

import java.util.Scanner;

public class Exercicio3_Media {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a sua 1° nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a sua 2° nota: ");
        int nota2 = scanner.nextInt();
        
        float media = (nota1+nota2)/2;
        
        if(media<7) {
            System.out.println("Você está reprovado");
        } else {
            System.out.println("Você está Aprovado");
        }
        
        scanner.close();
     }
}
