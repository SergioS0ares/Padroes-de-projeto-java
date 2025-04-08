/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoprojeto.Factory_Decorator.factory;

import padraoprojeto.Factory_Decorator.modelos.Arma;
import padraoprojeto.Factory_Decorator.modelos.EncantamentoFogo;
import padraoprojeto.Factory_Decorator.modelos.FabricaDeArmas;
import padraoprojeto.Factory_Decorator.modelos.PontaAfiada;
import padraoprojeto.Factory_Decorator.modelos.ReforcoMitril;



public class TesteFactory {
    public static void main(String[] args) {
        // Cria armas base via factory
        Arma arma1 = FabricaDeArmas.criarArma("espada");
        Arma arma2 = FabricaDeArmas.criarArma("arco");
        Arma arma3 = FabricaDeArmas.criarArma("lanca");

        // Aplica melhorias com decorators
        arma1 = new PontaAfiada(arma1);
        arma1 = new EncantamentoFogo(arma1);

        arma2 = new EncantamentoFogo(arma2);
        arma2 = new ReforcoMitril(arma2);

        arma3 = new ReforcoMitril(arma3);

        // Saída
        System.out.println(arma1.getNome() + " - " + arma1.descricao() + " - Dano: " + arma1.getDano());
        System.out.println(arma2.getNome() + " - " + arma2.descricao() + " - Dano: " + arma2.getDano());
        System.out.println(arma3.getNome() + " - " + arma3.descricao() + " - Dano: " + arma3.getDano());
    }
}

