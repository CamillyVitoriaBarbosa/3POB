package lista2;

import java.util.Scanner;

public class Exercicio8_FormaDPagamento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite a quantidade de produto(s): ");
        int qnt = scanner.nextInt();
        System.out.print("Digite o preço unitário do produto: ");
        double preco = scanner.nextDouble();
        System.out.println("Digite o forma de pagamento");
        System.out.println("1 - Dinheiro\t2 - Cheque\t3 - Cartão débito\t4 - Cartão crédito");
        int opPagamento = scanner.nextInt();

        preco *= qnt;
       
        switch (opPagamento) {
            case 1:
                preco -= (preco*0.10);
                break;

            case 2:
                preco -= (preco*0.02);
                break;

            case 3:
                preco -= (preco*0.05);
                break;

            case 4:
                preco -= (preco*0.03);
                break;

            default:
                System.out.println("Forma de pagamento inválida!");
                break;
        }

        System.out.println("Preço total:" + preco);

        scanner.close();
	}

}
