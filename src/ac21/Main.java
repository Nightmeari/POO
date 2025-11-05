import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Paciente> pacientes = new ArrayList<>();
    static List<Consulta> consultas = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n1. Registrar paciente");
            System.out.println("2. Agendar consulta");
            System.out.println("3. Reagendar consulta");
            System.out.println("4. Exibir todas as consultas");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt(); sc.nextLine();

            switch (opcao) {
                case 1 -> registrarPaciente();
                case 2 -> agendarConsulta();
                case 3 -> reagendarConsulta();
                case 4 -> exibirConsultas();
            }
        } while (opcao != 0);
    }

    static void registrarPaciente() {
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        pacientes.add(new Paciente(cpf, nome));
        System.out.println("Paciente registrado.");
    }

    static void agendarConsulta() {
        System.out.print("CPF do paciente: ");
        String cpf = sc.nextLine();
        Paciente paciente = buscarPaciente(cpf);
        if (paciente == null) {
            System.out.println("Paciente não encontrado.");
            return;
        }

        System.out.print("Data e hora da consulta (AAAA-MM-DDTHH:MM): ");
        String entrada = sc.nextLine();
        LocalDateTime dataHora = LocalDateTime.parse(entrada);
        Consulta consulta = new Consulta(paciente, dataHora);
        consultas.add(consulta);
        consulta.exibirDetalhes();
    }

    static void reagendarConsulta() {
        System.out.print("CPF do paciente: ");
        String cpf = sc.nextLine();
        Consulta consulta = buscarConsultaPorCpf(cpf);
        if (consulta == null) {
            System.out.println("Consulta não encontrada.");
            return;
        }

        System.out.print("Reagendar para daqui quantos dias? ");
        int dias = sc.nextInt(); sc.nextLine();
        consulta.reagendar(dias);
        System.out.println("Consulta reagendada.");
        consulta.exibirDetalhes();
    }

    static void exibirConsultas() {
        for (Consulta c : consultas) {
            c.exibirDetalhes();
        }
    }

    static Paciente buscarPaciente(String cpf) {
        for (Paciente p : pacientes) {
            if (p.getCpf().equals(cpf)) return p;
        }
        return null;
    }

    static Consulta buscarConsultaPorCpf(String cpf) {
        for (Consulta c : consultas) {
            if (c.getPaciente().getCpf().equals(cpf)) return c;
        }
        return null;
    }
}

