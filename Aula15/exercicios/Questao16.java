package exercicios;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public final class Questao16 {
    private Questao16() {}

    public static class Paciente {
        private final String nome;

        public Paciente(String nome) {
            if (nome == null || nome.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome do paciente obrigatório.");
            }
            this.nome = nome;
        }

        public String getNome() { return nome; }
    }

    public static class Medico {
        private final String nome;

        public Medico(String nome) {
            if (nome == null || nome.trim().isEmpty()) {
                throw new IllegalArgumentException("Nome do médico obrigatório.");
            }
            this.nome = nome;
        }

        public String getNome() { return nome; }
    }

    public static class Consulta {
        private final Paciente paciente;
        private final Medico medico;
        private final LocalDateTime horario;

        public Consulta(Paciente paciente, Medico medico, LocalDateTime horario)
                throws ConsultaInvalidaException {
            if (paciente == null || medico == null) {
                throw new ConsultaInvalidaException("Paciente e médico são obrigatórios.");
            }
            if (horario == null || horario.getHour() < 8 || horario.getHour() >= 18) {
                throw new ConsultaInvalidaException("A consulta deve ser marcada entre 08:00 e 17:59.");
            }
            this.paciente = paciente;
            this.medico = medico;
            this.horario = horario;
        }

        public Paciente getPaciente() { return paciente; }
        public Medico getMedico() { return medico; }
        public LocalDateTime getHorario() { return horario; }

        @Override
        public String toString() {
            return horario + " - " + paciente.getNome() + " com Dr(a). " + medico.getNome();
        }
    }

    public static class ConsultaInvalidaException extends Exception {
        public ConsultaInvalidaException(String message) { super(message); }
    }

    public static class Hospital {
        private final List<Consulta> consultas = new ArrayList<>();

        public void agendar(Consulta consulta) throws ConsultaInvalidaException {
            if (consulta == null) {
                throw new ConsultaInvalidaException("Consulta obrigatória.");
            }
            for (Consulta existente : consultas) {
                if (existente.getHorario().equals(consulta.getHorario())
                        && (existente.getMedico() == consulta.getMedico()
                        || existente.getPaciente() == consulta.getPaciente())) {
                    throw new ConsultaInvalidaException("Médico ou paciente já possui consulta nesse horário.");
                }
            }
            consultas.add(consulta);
            System.out.println("Consulta agendada: " + consulta);
        }

        public List<Consulta> getConsultas() { return new ArrayList<>(consultas); }
    }

    public static void executar() {
        System.out.println("\n=== Questão 16 - Sistema hospitalar ===");
        Hospital hospital = new Hospital();
        Paciente paciente = new Paciente("Ana");
        Medico medico = new Medico("Silva");
        try {
            new Consulta(paciente, medico, LocalDateTime.now().withHour(7).withMinute(0));
        } catch (ConsultaInvalidaException e) {
            System.out.println("Horário inválido: " + e.getMessage());
        }
        try {
            hospital.agendar(new Consulta(paciente, medico, LocalDateTime.now().withHour(10).withMinute(0).withSecond(0).withNano(0).plusDays(1)));
            hospital.agendar(new Consulta(paciente, medico, LocalDateTime.now().withHour(10).withMinute(0).withSecond(0).withNano(0).plusDays(1)));
        } catch (ConsultaInvalidaException e) {
            System.out.println("Falha no agendamento: " + e.getMessage());
        }
    }
}
