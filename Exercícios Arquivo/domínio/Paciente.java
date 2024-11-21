package exercicioArrayList.dominio;

public class Paciente {
    private int numero;
    private double peso;
    private double altura;

    // Construtor
    public Paciente(int numero, double peso, double altura) {
        this.numero = numero;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double altura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para listar paciente
    public void listarPaciente() {
        System.out.println("Número: " + numero);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }
