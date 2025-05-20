package Q3;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell", "XPS 13", "Intel i7", 16, "ASUS", "B550", 4, "DDR4");

        System.out.println("Detalhes iniciais do computador:");
        computador.exibirDetalhes();

        System.out.println("\nAtualizando placa-mãe...");
        computador.atualizarPlacaMae("MSI", "Z490", 2, "DDR5");

        System.out.println("\nDetalhes após atualização:");
        computador.exibirDetalhes();
    }
}