package Q4;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private List<UnidadeAtendimento> unidades;

    public Hospital(String nome) {
        this.nome = nome;
        this.unidades = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarUnidade(UnidadeAtendimento unidade) {
        unidades.add(unidade);
    }

    public List<UnidadeAtendimento> getUnidades() {
        return unidades;
    }

    public void exibirDetalhes() {
        System.out.println("Hospital: " + nome);
        System.out.println("Unidades de Atendimento:");
        if (unidades.isEmpty()) {
            System.out.println("  Nenhuma unidade registrada.");
        } else {
            for (UnidadeAtendimento unidade : unidades) {
                System.out.println("  - " + unidade.getNome() + " (" + unidade.getTipo() + ")");
                System.out.println("    Médicos:");
                if (unidade.getMedicos().isEmpty()) {
                    System.out.println("      Nenhum médico associado.");
                } else {
                    for (Medico medico : unidade.getMedicos()) {
                        System.out.println("      - " + medico.getNome() + " (" + medico.getEspecialidade() + ")");
                    }
                }
            }
        }
    }
}