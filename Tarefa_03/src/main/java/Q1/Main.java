package Q1;

public class Main {
    public static void main(String[] args) {
        Pessoa erick = new Pessoa("Erick");
        Pessoa ana = new Pessoa("Ana");
        Carro civic = new Carro("Civic");
        Carro hilux = new Carro("Hilux");

        erick.usarCarro(civic);
        civic.dirigir();

        ana.usarCarro(civic);
        civic.dirigir();

        erick.usarCarro(hilux);
        hilux.dirigir();

        System.out.println("Carros dirigidos por " + erick.getNome() + ": " + erick.getCarrosDirigidos().size());
        System.out.println("Carros dirigidos por " + ana.getNome() + ": " + ana.getCarrosDirigidos().size());
    }
}