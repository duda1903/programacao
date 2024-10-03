/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabHospital;

import trabHospital.Atendimento;
import trabHospital.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Paciente> pacientes;

    public Main() {
        pacientes = new ArrayList<>();
    }

    public void incluirPaciente(String nome, LocalDate dataNascimento) {
        Paciente novoPaciente = new Paciente(nome, dataNascimento);
        pacientes.add(novoPaciente);
        System.out.println("Paciente incluído com sucesso!");
    }

    public void alterarPaciente(String nome) {
        Paciente paciente = buscarPaciente(nome);
        if (paciente != null) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Novo nome: ");
            paciente.setNome(sc.nextLine());
            System.out.println("Paciente alterado com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public void realizarAtendimento(String nome, LocalDate data, String descricao) {
        Paciente paciente = buscarPaciente(nome);
        if (paciente != null) {
            Atendimento atendimento = new Atendimento(data, descricao);
            paciente.adicionarAtendimento(atendimento);
            System.out.println("Atendimento realizado com sucesso!");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public void listarPacientes() {
        for (Paciente paciente : pacientes) {
            if (paciente.isAtivo()) {
                System.out.println(paciente);
            }
        }
    }

    public void mostrarPaciente(String nome) {
        Paciente paciente = buscarPaciente(nome);
        if (paciente != null) {
            System.out.println(paciente);
            ArrayList<Atendimento> atendimentos = paciente.getAtendimentos();
            for (int i = 0; i < atendimentos.size(); i += 5) {
                for (int j = i; j < Math.min(i + 5, atendimentos.size()); j++) {
                    System.out.println(atendimentos.get(j));
                }
                if (i + 5 < atendimentos.size()) {
                    System.out.println("Pressione Enter para continuar...");
                    new Scanner(System.in).nextLine();
                }
            }
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public void apagarPaciente(String nome) {
        Paciente paciente = buscarPaciente(nome);
        if (paciente != null) {
            paciente.desativar();
            System.out.println("Paciente desativado com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    private Paciente buscarPaciente(String nome) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome) && paciente.isAtivo()) {
                return paciente;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Main sistema = new Main();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Incluir Paciente");
            System.out.println("2. Alterar Paciente");
            System.out.println("3. Realizar Atendimento");
            System.out.println("4. Listar Pacientes");
            System.out.println("5. Mostrar Paciente");
            System.out.println("6. Apagar Paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do Paciente: ");
                    String nome = sc.nextLine();
                    System.out.print("Data de Nascimento (YYYY-MM-DD): ");
                    LocalDate dataNascimento = LocalDate.parse(sc.nextLine());
                    sistema.incluirPaciente(nome, dataNascimento);
                }
                case 2 -> {
                    System.out.print("Nome do Paciente a ser alterado: ");
                    String nome = sc.nextLine();
                    sistema.alterarPaciente(nome);
                }
                case 3 -> {
                    System.out.print("Nome do Paciente: ");
                    String nome = sc.nextLine();
                    System.out.print("Data do Atendimento (YYYY-MM-DD): ");
                    LocalDate dataAtendimento = LocalDate.parse(sc.nextLine());
                    System.out.print("Descrição do Atendimento: ");
                    String descricao = sc.nextLine();
                    sistema.realizarAtendimento(nome, dataAtendimento, descricao);
                }
                case 4 -> sistema.listarPacientes();
                case 5 -> {
                    System.out.print("Nome do Paciente: ");
                    String nome = sc.nextLine();
                    sistema.mostrarPaciente(nome);
                }
                case 6 -> {
                    System.out.print("Nome do Paciente a ser apagado: ");
                    String nome = sc.nextLine();
                    sistema.apagarPaciente(nome);
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}

