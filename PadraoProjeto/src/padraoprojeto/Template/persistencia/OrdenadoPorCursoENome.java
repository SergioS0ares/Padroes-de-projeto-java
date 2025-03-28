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

public class OrdenadoPorCursoENome extends AlunoTemplateMethod {
    public OrdenadoPorCursoENome(String nomeArquivo) {
        super(nomeArquivo);
    }
    @Override
    public boolean ePrimeiro(AlunoCompleto a1, AlunoCompleto a2) {
        int cmp = a1.getCurso().compareToIgnoreCase(a2.getCurso());
        if (cmp == 0) return a1.getNomeCompleto().compareToIgnoreCase(a2.getNomeCompleto()) <= 0;
        return cmp <= 0;
    }
}