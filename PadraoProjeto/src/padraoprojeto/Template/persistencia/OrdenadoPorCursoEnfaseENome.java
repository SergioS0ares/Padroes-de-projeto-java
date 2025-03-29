/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Template.persistencia;

import padraoprojeto.Template.models.AlunoCompleto;

/**
 *
 * 
 */

public class OrdenadoPorCursoEnfaseENome extends AlunoTemplateMethod {
    public OrdenadoPorCursoEnfaseENome(String nomeArquivo) {
        super(nomeArquivo);
    }
    @Override
    public boolean ePrimeiro(AlunoCompleto a1, AlunoCompleto a2) {
        int cmp1 = a1.getCurso().compareToIgnoreCase(a2.getCurso());
        if (cmp1 != 0) return cmp1 <= 0;
        int cmp2 = a1.getEnfase().compareToIgnoreCase(a2.getEnfase());
        if (cmp2 != 0) return cmp2 <= 0;
        return a1.getNomeCompleto().compareToIgnoreCase(a2.getNomeCompleto()) <= 0;
    }
}
