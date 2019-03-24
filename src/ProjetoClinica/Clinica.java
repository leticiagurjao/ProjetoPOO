package ProjetoClinica;

public class Clinica {
    public static void main (String args []){
        Paciente paciente = new Paciente();
        paciente.nome = "Maria";
        paciente.senha = 20;
        paciente.ordemAtendimento = "Emergência";

        Medico medico = new Medico();
        medico.nome = "Paulo";
        medico.matricula = 120945;
        medico.especialidade = "Cardiologista";

        AtendimentoMedico atendimento = new AtendimentoMedico();
        atendimento.exame = "Eletrocardiograma";
        atendimento.resultadoExame = "Batimentos normais";



    }
}
