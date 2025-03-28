/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author julio
 */
import models.AlunoCompleto;

public class OrdenadoPorSobrenome extends AlunoTemplateMethod {
    public OrdenadoPorSobrenome(String nomeArquivo) {
        super(nomeArquivo);
    }
    @Override
    public boolean ePrimeiro(AlunoCompleto a1, AlunoCompleto a2) {
        return a1.getSobrenome().compareToIgnoreCase(a2.getSobrenome()) <= 0;
    }
}
