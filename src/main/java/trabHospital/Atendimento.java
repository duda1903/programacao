/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabHospital;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atendimento {
    private LocalDate data;
    private String descricao;

    public Atendimento(LocalDate data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatoBr.format(this.data);
        return "Data: " + dataFormatada + "\nDescrição: " + descricao;
    }
}

