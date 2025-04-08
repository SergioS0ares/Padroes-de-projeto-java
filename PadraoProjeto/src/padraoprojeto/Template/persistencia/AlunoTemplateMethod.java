/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Template.persistencia;

/**
 *
 * 
 */

import java.io.*;
import java.util.*;
import models.AlunoCompleto;

public abstract class AlunoTemplateMethod {
    private String nomeArquivo;

    public AlunoTemplateMethod(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public abstract boolean ePrimeiro(AlunoCompleto a1, AlunoCompleto a2);

    public ArrayList<AlunoCompleto> listar() throws Exception {
        ArrayList<AlunoCompleto> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            lista.add(new AlunoCompleto(linha));
        }
        br.close();

        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (!ePrimeiro(lista.get(i), lista.get(j))) {
                    AlunoCompleto temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
        return lista;
    }
}