/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

/**
 *
 * @author sergy
 */
import models.AlunoCompleto;
import padraoprojeto.Template.persistencia.AlunoTemplateMethod;

public class OrdenadoPorEnfaseENome extends AlunoTemplateMethod {
    public OrdenadoPorEnfaseENome(String nomeArquivo) {
        super(nomeArquivo);
    }
    @Override
    public boolean ePrimeiro(AlunoCompleto a1, AlunoCompleto a2) {
        int cmp = a1.getEnfase().compareToIgnoreCase(a2.getEnfase());
        if (cmp == 0) return a1.getNomeCompleto().compareToIgnoreCase(a2.getNomeCompleto()) <= 0;
        return cmp <= 0;
    }
}