package lista2;

import java.util.Scanner;

public class Exercicio9_Triangulo {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Digite os comprimentos dos lados do triângulo: ");
	System.out.println("Lado X: ");
	int ladoX = scanner.nextInt();
	System.out.print("Lado Y: ");
	int ladoY = scanner.nextInt();
	System.out.print("Lado Z: ");
	int ladoZ = scanner.nextInt();
	   
	if ((ladoX < ladoY + ladoZ) && (ladoY < ladoX + ladoZ) && (ladoZ < ladoX + ladoY)) {
	    if (ladoX == ladoY && ladoY == ladoZ) {
		System.out.println("O triângulo é equilátero");
	    } else if (ladoX == ladoY || ladoY == ladoZ || ladoZ == ladoX) {
		System.out.println("O triângulo é isósceles");
	    } else {
		System.out.println("O triângulo é escaleno");
	    }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
	    
	scanner.close();
    }
}
