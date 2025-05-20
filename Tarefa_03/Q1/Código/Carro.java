package Q1;

public class Carro {
    private String modelo;
    private Pessoa motoristaAtual;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.motoristaAtual = null;
    }

    public String getModelo() {
        return modelo;
    }

    public Pessoa getMotoristaAtual() {
        return motoristaAtual;
    }

    public void setMotoristaAtual(Pessoa motorista) {
        this.motoristaAtual = motorista;
    }

    public void dirigir() {
        if (motoristaAtual != null) {
            System.out.println("Carro " + modelo + " está sendo dirigido por " + motoristaAtual.getNome());
        } else {
            System.out.println("Carro " + modelo + " não tem motorista no momento.");
        }
    }
}
