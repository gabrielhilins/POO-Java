public class MainPacientesClinica {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.nome = "Sofia Oliveira";
        paciente1.idade = 35;
        paciente1.diagnostico = "Fratura de tornozelo direito devido a acidente de bicicleta";

        Paciente paciente2 = new Paciente();
        paciente2.nome = "Carlos Santos";
        paciente2.idade = 62;
        paciente2.diagnostico = " Hipertensão arterial e diabetes tipo 2 controladas com medicamentos";

        Paciente paciente3 = new Paciente();
        paciente3.nome = "Laura Ferreira";
        paciente3.idade = 18;
        paciente3.diagnostico = "Apendicite aguda, exigindo cirurgia de emergência para remoção do apêndice";

        System.out.println("Detalhes dos pacientes:");
        paciente1.imprimirDetalhes();
        paciente2.imprimirDetalhes();
        paciente3.imprimirDetalhes();
        
    }
}
