/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Factory_Decorator.modelos;

public abstract class Melhoria extends Arma {

    public Melhoria(String nome, String material, int dano) {
        super(nome, material, dano);
    }
    public abstract String getDescricao();
}

