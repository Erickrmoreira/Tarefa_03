package Q2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private List<Instrutor> instrutores;

    public Curso(String nome, int cargaHoraria, String nivel, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.instrutores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNivel() {
        return nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void adicionarInstrutor(Instrutor instrutor) {
        if (!instrutores.contains(instrutor)) {
            instrutores.add(instrutor);
            instrutor.adicionarCurso(this);
        }
    }

    public void removerInstrutor(Instrutor instrutor) {
        if (instrutores.remove(instrutor)) {
            instrutor.removerCurso(this);
        }
    }

    public void exibirDetalhes() {
        System.out.println("Curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Nível: " + nivel);
        System.out.println("Descrição: " + descricao);
        System.out.println("Instrutores:");
        if (instrutores.isEmpty()) {
            System.out.println("  Nenhum instrutor associado.");
        } else {
            for (Instrutor instrutor : instrutores) {
                System.out.println("  - " + instrutor.getNome() + " (" + instrutor.getFormacao() + ")");
            }
        }
    }
}
