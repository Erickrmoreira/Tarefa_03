package Q4;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Hospital Municipal de Marabá");
        UnidadeAtendimento upa = new UnidadeAtendimento("UPA de Marabá", "UPA");
        UnidadeAtendimento enfermaria = new UnidadeAtendimento("Enfermaria Geral", "Enfermaria");
        hospital.adicionarUnidade(upa);
        hospital.adicionarUnidade(enfermaria);

        Medico medico1 = new Medico("Dr. Erick", "CRM123", "Cardiologia");
        Medico medico2 = new Medico("Dra. Marcela", "CRM456", "Dermatologista");
        upa.adicionarMedico(medico1);
        upa.adicionarMedico(medico2);
        enfermaria.adicionarMedico(medico1);

        Paciente paciente = new Paciente("Java da silva", "123.456.789-00");
        Consulta consulta = new Consulta("2025-05-19", medico1, paciente);

        hospital.exibirDetalhes();

        System.out.println("\nConsultas do paciente " + paciente.getNome() + ":");
        for (Consulta c : paciente.getConsultas()) {
            System.out.println("  - Data: " + c.getData() + ", Médico: " + c.getMedico().getNome());
        }
    }
}