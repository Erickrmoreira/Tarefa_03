package Q1;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Carro> carrosDirigidos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.carrosDirigidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void usarCarro(Carro carro) {
        carro.setMotoristaAtual(this);
        if (!carrosDirigidos.contains(carro)) {
            carrosDirigidos.add(carro);
        }
    }

    public List<Carro> getCarrosDirigidos() {
        return carrosDirigidos;
    }
}
