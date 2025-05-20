package Q4;

public class Consulta {
    private String data;
    private Medico medico;
    private Paciente paciente;

    public Consulta(String data, Medico medico, Paciente paciente) {
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        medico.adicionarConsulta(this);
        paciente.adicionarConsulta(this);
    }

    public String getData() {
        return data;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }
}
