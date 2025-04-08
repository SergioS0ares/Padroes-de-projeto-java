/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoprojeto.Factory_Decorator.modelos;

public class Arco extends Arma {
    public Arco(String nome, String material, int dano) {
        super(nome, material, dano);
    }

    @Override
    public String descricao() {
        return "Arco de longo alcance com flechas certeiras.";
    }
}

