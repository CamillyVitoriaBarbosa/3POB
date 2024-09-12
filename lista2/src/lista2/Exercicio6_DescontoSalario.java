package lista2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio6_DescontoSalario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
		
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
		System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();
        
        if (salario<salarioMinimo) {
        	double desconto = salario* 0.02;
        	double salarioLiquido = salario - desconto;
        	
        	System.out.println("O valor do seu desconto é de: " + df.format(desconto));
            System.out.println("O seu salário final é: " + df.format(salarioLiquido));
	    } else if (salarioMinimo<salario) {
	    	double desconto = salario* 0.08;
        	double salarioLiquido = salario - desconto;
        	
        	System.out.println("O valor do seu desconto é de: " + df.format(desconto));
            System.out.println("O seu salário final é: " + df.format(salarioLiquido));
	    } else {
	    	double desconto = salario* 0.05;
        	double salarioLiquido = salario - desconto;
        	
        	System.out.println("O valor do seu desconto é de: " + df.format(desconto));
            System.out.println("O seu salário final é: " + df.format(salarioLiquido));
	    }

        scanner.close();
	}

}
