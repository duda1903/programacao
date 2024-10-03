/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabHospital;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Paciente {
    private String nome;
    private LocalDate dataNascimento;
    private ArrayList<Atendimento> atendimentos;
    private boolean ativo;

    public Paciente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.atendimentos = new ArrayList<>();
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        this.atendimentos.add(atendimento);
    }

    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void desativar() {
        this.ativo = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Paciente paciente = (Paciente) obj;
        return nome.equals(paciente.nome);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascimentoFormatada = formatoBr.format(this.dataNascimento);
        return "Nome: " + nome + "\nData de Nascimento: " + dataNascimentoFormatada + "\nIdade: " + getIdade();
    }
}

