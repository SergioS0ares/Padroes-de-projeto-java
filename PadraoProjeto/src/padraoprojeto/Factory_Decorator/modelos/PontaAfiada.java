/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Factory_Decorator.modelos;

/**
 *
 * @author sergy
 */
public class PontaAfiada extends Melhoria {
    private Arma arma;

    public PontaAfiada(Arma arma) {
        super(arma.getNome(), arma.getMaterial(), arma.getDano());
        this.arma = arma;
    }

    @Override
    public String getDescricao() {
        return arma.descricao() + " + Ponta Afiada";
    }

    @Override
    public int getDano() {
        return arma.getDano() + 10;
    }

    @Override
    public String descricao() {
        return getDescricao();
    }
}
