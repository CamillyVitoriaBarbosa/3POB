package lista2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio4_DescontoPGenero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu gênero (M/F): ");
        char genero = scanner.next().charAt(0);
        System.out.print("Digite o seu salário bruto: ");
        double salarioBruto = scanner.nextDouble();
        
        if(genero == 'M') {
        	double desconto = salarioBruto * 0.05;
        	double salarioLiquido = salarioBruto - desconto;
        	
        	System.out.println("O valor do seu desconto é de: " + df.format(desconto));
            System.out.println("O seu salário final é: " + df.format(salarioLiquido));
        } else {
        	double desconto = salarioBruto * 0.03;
        	double salarioLiquido = salarioBruto - desconto;
        	
        	System.out.println("O valor do seu desconto é de: " + df.format(desconto));
            System.out.println("O seu salário final é: " + df.format(salarioLiquido));
        }
        
        scanner.close();
	}

}
