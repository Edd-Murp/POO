package exercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Questao27 {
    private Questao27() {}

    public static class ReservaException extends Exception {
        public ReservaException(String message) { super(message); }
    }

    public abstract static class Usuario {
        private final String nome;
        protected Usuario(String nome) {
            if (nome == null || nome.trim().isEmpty()) throw new IllegalArgumentException("Nome obrigatório.");
            this.nome = nome;
        }
        public String getNome() { return nome; }
    }

    public static class Hospede extends Usuario {
        public Hospede(String nome) { super(nome); }
    }

    public static class Administrador extends Usuario {
        public Administrador(String nome) { super(nome); }
    }

    public interface ReservaGerenciavel {
        void confirmar() throws ReservaException;
        void cancelar();
    }

    public static class Quarto {
        private final int numero;
        public Quarto(int numero) {
            if (numero <= 0) throw new IllegalArgumentException("Número do quarto inválido.");
            this.numero = numero;
        }
        public int getNumero() { return numero; }
    }

    public static class Reserva implements ReservaGerenciavel {
        private final Usuario usuario;
        private final Quarto quarto;
        private final LocalDate entrada;
        private final LocalDate saida;
        private boolean confirmada;

        private Reserva(Usuario usuario, Quarto quarto, LocalDate entrada, LocalDate saida) {
            this.usuario = usuario;
            this.quarto = quarto;
            this.entrada = entrada;
            this.saida = saida;
        }

        @Override public void confirmar() { confirmada = true; }
        @Override public void cancelar() { confirmada = false; }
        public boolean isConfirmada() { return confirmada; }
        public Quarto getQuarto() { return quarto; }
        public LocalDate getEntrada() { return entrada; }
        public LocalDate getSaida() { return saida; }
        public Usuario getUsuario() { return usuario; }
    }

    public static class Hotel {
        private final List<Reserva> reservas = new ArrayList<>();

        public Reserva reservar(Usuario usuario, Quarto quarto, LocalDate entrada, LocalDate saida)
                throws ReservaException {
            if (usuario == null || quarto == null || entrada == null || saida == null
                    || !saida.isAfter(entrada)) {
                throw new ReservaException("Usuário, quarto e intervalo de datas válido são obrigatórios.");
            }
            for (Reserva existente : reservas) {
                boolean datasSobrepostas = entrada.isBefore(existente.getSaida())
                        && saida.isAfter(existente.getEntrada());
                if (existente.isConfirmada() && existente.getQuarto() == quarto && datasSobrepostas) {
                    throw new ReservaException("Quarto " + quarto.getNumero() + " já está ocupado nessas datas.");
                }
            }
            Reserva reserva = new Reserva(usuario, quarto, entrada, saida);
            reserva.confirmar();
            reservas.add(reserva);
            return reserva;
        }

        public List<Reserva> getReservas() { return new ArrayList<>(reservas); }
    }

    public static void executar() {
        System.out.println("\n=== Questão 27 - Sistema de reservas ===");
        Hotel hotel = new Hotel();
        Quarto quarto = new Quarto(101);
        LocalDate entrada = LocalDate.now().plusDays(1);
        try {
            hotel.reservar(new Hospede("Rui"), quarto, entrada, entrada);
        } catch (ReservaException e) {
            System.out.println("Datas inválidas: " + e.getMessage());
        }
        try {
            hotel.reservar(new Hospede("Lia"), quarto, entrada, entrada.plusDays(2));
            hotel.reservar(new Hospede("Rui"), quarto, entrada.plusDays(1), entrada.plusDays(3));
        } catch (ReservaException e) {
            System.out.println("Reserva recusada: " + e.getMessage());
        }
    }
}
