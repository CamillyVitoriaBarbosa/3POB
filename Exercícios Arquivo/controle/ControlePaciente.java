package exercicioArrayList.controle;


import java.util.ArrayList;
import java.util.Scanner;

import exercicioArrayList.dominio.Paciente;

public class ControlaPaciente {
   private ArrayList<Paciente> pacientes;

    public ControlaPaciente() {
        this.pacientes = new ArrayList<>();
    }

    public void adicionarPaciente(int numero, double peso, double altura) {
        Paciente paciente = new Paciente(numero, peso, altura);
        pacientes.add(paciente);
        System.out.println("Paciente adicionado com sucesso!");
    }

    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("Lista de Pacientes:");
            for (Paciente paciente : pacientes) {
                paciente.listarPaciente();
            }
        }
    }

    public void alterarPaciente(int numero) {
        Paciente paciente = buscarPacientePorNumero(numero);
        if (paciente != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Novo peso do paciente: ");
            double novoPeso = scanner.nextDouble();
            System.out.print("Nova altura do paciente: ");
            double novaAltura = scanner.nextDouble();
            
            paciente.setPeso(novoPeso);
            paciente.setAltura(novaAltura);
            System.out.println("Paciente alterado com sucesso!");
        } else {
            System.out.println("Paciente de número " + numero + " não encontrado.");
        }
    }

    public void excluirPaciente(int numero) {
        Paciente paciente = buscarPacientePorNumero(numero);
        if (paciente != null) {
            pacientes.remove(paciente);
            System.out.println("Paciente excluído com sucesso!");
        } else {
            System.out.println("Paciente com número " + numero + " não encontrado.");
        }
    }

    private Paciente buscarPacientePorNumero(int numero) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                return paciente;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ControlaPaciente controle = new ControlaPaciente();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Listar Paciente");
            System.out.println("3. Alterar Paciente");
            System.out.println("4. Excluir Paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Número do Paciente: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Peso do Paciente: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura do Paciente: ");
                    double altura = scanner.nextDouble();
                    controle.adicionarPaciente(numero, peso, altura);
                    break;
                case 2:
                    controle.listarPaciente();
                    break;
                case 3:
                    System.out.print("Número do Paciente a alterar: ");
                    int numeroAlterar = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    controle.alterarPaciente(numeroAlterar);
                    break;
                case 4:
                    System.out.print("Número do Paciente a excluir: ");
                    int numeroExcluir = scanner.nextInt();
                    controle.excluirPaciente(numeroExcluir);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}