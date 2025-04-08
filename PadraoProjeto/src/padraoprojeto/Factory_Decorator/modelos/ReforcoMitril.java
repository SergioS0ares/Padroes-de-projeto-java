/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Factory_Decorator.modelos;

/**
 *
 * @author sergy
 */
public class ReforcoMitril extends Melhoria {
    private Arma arma;

    public ReforcoMitril(Arma arma) {
        super(arma.getNome(), arma.getMaterial(), arma.getDano());
        this.arma = arma;
    }

    @Override
    public String getDescricao() {
        return arma.descricao() + " + Reforço de Mithril";
    }

    @Override
    public int getDano() {
        return arma.getDano() + 20;
    }

    @Override
    public String descricao() {
        return getDescricao();
    }
}
