import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Consulta {
    private Paciente paciente;
    private LocalDateTime dataHora;

    public Consulta(Paciente paciente, LocalDateTime dataHora) {
        this.paciente = paciente;
        this.dataHora = dataHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public long diasAteConsulta() {
        return ChronoUnit.DAYS.between(LocalDateTime.now(), dataHora);
    }

    public LocalDateTime horaTermino() {
        return dataHora.plusMinutes(45);
    }

    public void reagendar(int dias) {
        this.dataHora = LocalDateTime.now().plusDays(dias);
    }

    public void exibirDetalhes() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("\n--- Consulta ---");
        System.out.println("Paciente: " + paciente.getNome() + " (CPF: " + paciente.getCpf() + ")");
        System.out.println("Data e hora: " + dataHora.format(formato));
        System.out.println("Término previsto: " + horaTermino().format(formato));
        System.out.println("Dias até a consulta: " + diasAteConsulta());
    }
}
