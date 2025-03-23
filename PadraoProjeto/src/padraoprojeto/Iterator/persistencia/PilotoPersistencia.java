/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoprojeto.Iterator.persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import padraoprojeto.Iterator.classeDados.Piloto;

/**
 *
 * @author eugeniojulio
 */
public class PilotoPersistencia {
    // Atributo padronizado
    private String nomeDoArquivo;

    // Construtor padronizado
    public PilotoPersistencia(String nome) {
        nomeDoArquivo = nome;
    }

    // Método padronizado igual ao do Piloto
    private int quantidadeDePilotosNoArquivo() throws Exception {
        try {
            int quantidade = 0;
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                quantidade++;
            }
            br.close();
            return quantidade;
        } catch (Exception erro) {
            throw erro;
        }
    }

    // LinkedList
    public Iterator listarComLinkedList() throws Exception {
        try {
            LinkedList<Piloto> lista = new LinkedList<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                Piloto p = new Piloto(linha);
                lista.add(p);
            }
            br.close();
            return lista.iterator();
        } catch (Exception erro) {
            throw erro;
        }
    }

    // HashSet
    public Iterator listarComHashSet() throws Exception {
        try {
            HashSet<Piloto> set = new HashSet<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                Piloto p = new Piloto(linha);
                set.add(p);
            }
            br.close();
            return set.iterator();
        } catch (Exception erro) {
            throw erro;
        }
    }

    // TreeSet
    public Iterator listarComTreeSet() throws Exception {
        try {
            TreeSet<Piloto> set = new TreeSet<>(Comparator.comparing(Piloto::getNome));
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                Piloto p = new Piloto(linha);
                set.add(p);
            }
            br.close();
            return set.iterator();
        } catch (Exception erro) {
            throw erro;
        }
    }

    // PriorityQueue
   public Iterator listarComHashMap() throws Exception {
    try {
        HashMap<String, Piloto> mapa = new HashMap<>();
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha;

        while ((linha = br.readLine()) != null) {
            Piloto p = new Piloto(linha);
           mapa.put(String.valueOf(p.getCodigo()), p); // Usando o código como chave
        }

        br.close();
        return mapa.values().iterator(); // Retorna apenas os valores (Piloto)
    } catch (Exception erro) {
        throw erro;
    }
}



    // Stack
    public Iterator listarComStack() throws Exception {
        try {
            Stack<Piloto> pilha = new Stack<>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                Piloto p = new Piloto(linha);
                pilha.push(p);
            }
            br.close();
            return pilha.iterator();
        } catch (Exception erro) {
            throw erro;
        }
    }
}
