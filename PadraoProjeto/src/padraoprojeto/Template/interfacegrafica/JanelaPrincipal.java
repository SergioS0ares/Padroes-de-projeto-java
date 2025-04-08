/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacegrafica;

/**
 *
 * @author sergy
 */
import models.AlunoCompleto;
import persistencia.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import padraoprojeto.Template.persistencia.AlunoTemplateMethod;

public class JanelaPrincipal extends JFrame {

    private JComboBox<String> comboOrdenacao;
    private JButton btnListar;
    private JTable tabela;
    private DefaultTableModel modelo;
    private String caminhoCSV = "C:\\Users\\sergy\\OneDrive\\Documentos\\NetBeansProjects\\PadraoProjeto\\src\\padraoprojeto\\Template\\dados\\alunos.csv";

    public JanelaPrincipal() {
        super("Lista de Alunos - Template Method");
        setLayout(new BorderLayout());

        // Topo - Combobox e Botão
        JPanel painelSuperior = new JPanel();
        comboOrdenacao = new JComboBox<>(new String[] {
            "Por Nome",
            "Por Sobrenome",
            "Por Situação e Nome",
            "Por Curso e Nome",
            "Por Ênfase e Nome",
            "Por Curso, Ênfase e Nome",
            "Por Ênfase, Curso e Nome"
        });
        btnListar = new JButton("Listar");

        painelSuperior.add(new JLabel("Ordenar por:"));
        painelSuperior.add(comboOrdenacao);
        painelSuperior.add(btnListar);
        add(painelSuperior, BorderLayout.NORTH);

        // Centro - Tabela
        modelo = new DefaultTableModel(new String[] { "Nome", "Situação", "Curso", "Ênfase" }, 0);
        tabela = new JTable(modelo);
        add(new JScrollPane(tabela), BorderLayout.CENTER);

        // Ação do botão
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarAlunos();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void listarAlunos() {
        try {
            String selecao = (String) comboOrdenacao.getSelectedItem();
            AlunoTemplateMethod metodo = null;

            switch (selecao) {
                case "Por Nome": metodo = new OrdenadoPorNome(caminhoCSV); break;
                case "Por Sobrenome": metodo = new OrdenadoPorSobrenome(caminhoCSV); break;
                case "Por Situação e Nome": metodo = new OrdenadoPorSituacaoENome(caminhoCSV); break;
                case "Por Curso e Nome": metodo = new OrdenadoPorCursoENome(caminhoCSV); break;
                case "Por Ênfase e Nome": metodo = new OrdenadoPorEnfaseENome(caminhoCSV); break;
                case "Por Curso, Ênfase e Nome": metodo = new OrdenadoPorCursoEnfaseENome(caminhoCSV); break;
                case "Por Ênfase, Curso e Nome": metodo = new OrdenadoPorEnfaseCursoENome(caminhoCSV); break;
            }

            ArrayList<AlunoCompleto> lista = metodo.listar();
            modelo.setRowCount(0); // Limpa a tabela

            for (AlunoCompleto a : lista) {
                modelo.addRow(new String[] {
                    a.getNomeCompleto(),
                    a.getSituacao(),
                    a.getCurso(),
                    a.getEnfase()
                });
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }
    }

    // main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JanelaPrincipal());
    }
}
