package lista2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exercicio2_eleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataNascimento;
        System.out.println("Digite a sua data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = scanner.nextLine();
        dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        
        Period periodo = Period.between(dataNascimento, dataAtual);
        int idade = periodo.getYears();
        
        System.out.println("Sua idade é: "+ idade);
        
        if (idade<16) {
        	System.out.println("Você não pode votar");
        } else {
        	System.out.println("Você pode votar");
        }
        
        scanner.close();
    }
    
}
