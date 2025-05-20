package Q2;

import java.util.ArrayList;
import java.util.List;

public class Instrutor {
    private String nome;
    private String formacao;
    private String email;
    private int anosExperiencia;
    private List<Curso> cursos;

    public Instrutor(String nome, String formacao, String email, int anosExperiencia) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.anosExperiencia = anosExperiencia;
        this.cursos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getEmail() {
        return email;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void adicionarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }
}
