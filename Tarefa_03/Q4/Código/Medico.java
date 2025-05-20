package Q4;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nome;
    private String crm;
    private String especialidade;
    private List<UnidadeAtendimento> unidades;
    private List<Consulta> consultas;

    public Medico(String nome, String crm, String especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.unidades = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void adicionarUnidade(UnidadeAtendimento unidade) {
        if (!unidades.contains(unidade)) {
            unidades.add(unidade);
        }
    }

    public void removerUnidade(UnidadeAtendimento unidade) {
        unidades.remove(unidade);
    }

    public void adicionarConsulta(Consulta consulta) {
        if (!consultas.contains(consulta)) {
            consultas.add(consulta);
        }
    }
}