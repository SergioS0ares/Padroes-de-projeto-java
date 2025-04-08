/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoprojeto.Factory_Decorator.modelos;

public abstract class Arma {
    private String nome;
    private String material;
    private int dano;

    public Arma(String nome, String material, int dano) {
        this.nome = nome;
        this.material = material;
        this.dano = dano;
    }

    public abstract String descricao();

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public int getDano() {
        return dano;
    }
}
