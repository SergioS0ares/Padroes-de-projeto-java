package padraoprojeto.Factory_Decorator.modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergy
 */

public class EncantamentoFogo extends Melhoria {
    private Arma arma;

    public EncantamentoFogo(Arma arma) {
        super(arma.getNome(), arma.getMaterial(), arma.getDano());
        this.arma = arma;
    }

    @Override
    public String getDescricao() {
        return arma.descricao() + " + Encantamento de Fogo";
    }

    @Override
    public int getDano() {
        return arma.getDano() + 15;
    }

    @Override
    public String descricao() {
        return getDescricao();
    }
}

