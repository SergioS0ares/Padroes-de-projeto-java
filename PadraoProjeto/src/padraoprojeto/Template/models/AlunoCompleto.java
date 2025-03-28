package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julio
 */
public class AlunoCompleto {
    private String nomeCompleto;
    private String situacao;
    private String curso;
    private String enfase;

    public AlunoCompleto(String nomeCompleto, String situacao, String curso, String enfase) {
        this.nomeCompleto = nomeCompleto;
        this.situacao = situacao;
        this.curso = curso;
        this.enfase = enfase;
    }

    public AlunoCompleto(String linhaCSV) {
        String[] dados = linhaCSV.split(";");
        this.nomeCompleto = dados[0];
        this.situacao = dados[1];
        this.curso = dados[2];
        this.enfase = dados[3];
    }

    public String getNomeCompleto() { return nomeCompleto; }
    public String getSituacao() { return situacao; }
    public String getCurso() { return curso; }
    public String getEnfase() { return enfase; }

    public String getSobrenome() {
        String[] partes = nomeCompleto.trim().split(" ");
        return partes[partes.length - 1];
    }
}
