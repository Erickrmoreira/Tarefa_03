package Q2;

public class Main {
    public static void main(String[] args) {
        Instrutor instrutor1 = new Instrutor("Marcela Alves", "Doutorado em Engenharia da Computação", "marcela@email.com", 10);
        Instrutor instrutor2 = new Instrutor("Javaldo Java da Silva", "Mestre em Engenharia da Computação", "Javaldo@email.com", 5);
        Curso curso1 = new Curso("Programação Orientada a Objetos", 102, "Intermediário", "Curso prático de Java.");
        Curso curso2 = new Curso("Python do Básico a Avançado", 90, "Iniciante", "Aprenda Python do Zero.");

        curso1.adicionarInstrutor(instrutor1);
        curso1.adicionarInstrutor(instrutor2);
        curso2.adicionarInstrutor(instrutor1);

        curso1.exibirDetalhes();
        System.out.println();
        curso2.exibirDetalhes();

        curso1.removerInstrutor(instrutor2);
        System.out.println("\nApós remover instrutor do curso 1:");
        curso1.exibirDetalhes();
    }
}