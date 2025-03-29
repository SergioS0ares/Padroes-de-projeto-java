/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Template.persistencia;

/**
 *
 * 
 */
import padraoprojeto.Template.models.AlunoCompleto;

public class OrdenadoPorNome extends AlunoTemplateMethod {
    public OrdenadoPorNome(String nomeArquivo) {
        super(nomeArquivo);
    }
    @Override
    public boolean ePrimeiro(AlunoCompleto a1, AlunoCompleto a2) {
        return a1.getNomeCompleto().compareToIgnoreCase(a2.getNomeCompleto()) <= 0;
    }
}