/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Iterator.classeDados;

/**
 *
 * @author sergy
 */
public class Piloto {
   private int codigo;
   private String nome;
   private String pais;
   private int idade;
   private String equipe;
   private String motor;
   private int pontos;

   public Piloto(String linhaCSV) {
    String[] dados = linhaCSV.split(",");

    this.codigo = Integer.parseInt(dados[0].trim());
    this.nome = dados[1].trim();
    this.pais = dados[2].trim();
    this.idade = Integer.parseInt(dados[3].trim());
    this.equipe = dados[4].trim();
    this.motor = dados[5].trim();
    this.pontos = Integer.parseInt(dados[6].trim());
}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    @Override
    public String toString() {
        return nome + " | " + pais + " | " + equipe + " | " + pontos + " pts";
    }
}