package Q4;

import java.util.ArrayList;
import java.util.List;

public class UnidadeAtendimento {
    private String nome;
    private String tipo;
    private List<Medico> medicos;

    public UnidadeAtendimento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.medicos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void adicionarMedico(Medico medico) {
        if (!medicos.contains(medico)) {
            medicos.add(medico);
            medico.adicionarUnidade(this);
        }
    }

    public void removerMedico(Medico medico) {
        if (medicos.remove(medico)) {
            medico.removerUnidade(this);
        }
    }
}
