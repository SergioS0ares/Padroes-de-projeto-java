/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaEstacaoMeteorologica extends JFrame {

    private JTextArea areaConsole = new JTextArea(10, 30);
    private JTextArea areaWeb = new JTextArea(10, 30);
    private JTextArea areaConforto = new JTextArea(10, 30);

    private JTextField txtTemperatura, txtUmidade, txtPressao;
    private JButton btnAtualizar;

    private EstacaoMeteorologica estacao;

    public TelaEstacaoMeteorologica() {
        super("Estação Meteorológica - Observer");

        estacao = new EstacaoMeteorologica();

        // Cria os observers com áreas de texto
        new MostrarClimaConsole((Subject) estacao, areaConsole);
        new MostrarClimaWeb((Subject) estacao, areaWeb);
        new MostrarClimaIndiceConforto((Subject) estacao, areaConforto);

        txtTemperatura = new JTextField(10);
        txtUmidade = new JTextField(10);
        txtPressao = new JTextField(10);
        btnAtualizar = new JButton("Atualizar Clima");

        setLayout(new GridLayout(7, 2, 10, 10));

        add(new JLabel("Temperatura (°C):"));
        add(txtTemperatura);
        add(new JLabel("Umidade (%):"));
        add(txtUmidade);
        add(new JLabel("Pressão (hPa):"));
        add(txtPressao);
        add(new JLabel(""));
        add(btnAtualizar);

        add(new JLabel("Console:"));
        add(new JScrollPane(areaConsole));
        add(new JLabel("Web:"));
        add(new JScrollPane(areaWeb));
        add(new JLabel("Índice de Conforto:"));
        add(new JScrollPane(areaConforto));

        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    float temperatura = Float.parseFloat(txtTemperatura.getText().trim());
                    float umidade = Float.parseFloat(txtUmidade.getText().trim());
                    float pressao = Float.parseFloat(txtPressao.getText().trim());


                    estacao.setMeasurements(temperatura, umidade, pressao);
                    JOptionPane.showMessageDialog(null, "Clima atualizado e observers notificados!");
                } catch (Exception ex) {
    ex.printStackTrace(); 
    JOptionPane.showMessageDialog(null, "Digite valores válidos!");
}

            }
        });

        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaEstacaoMeteorologica();
    }
}