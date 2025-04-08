/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Factory_Decorator.factory;

/**
 *
 * @author sergy
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import padraoprojeto.Factory_Decorator.modelos.Arma;
import padraoprojeto.Factory_Decorator.modelos.EncantamentoFogo;
import padraoprojeto.Factory_Decorator.modelos.FabricaDeArmas;
import padraoprojeto.Factory_Decorator.modelos.PontaAfiada;
import padraoprojeto.Factory_Decorator.modelos.ReforcoMitril;

public class TelaArmas extends JFrame {
    private JComboBox<String> comboTipoArma;
    private JCheckBox chkFogo, chkPonta, chkMithril;
    private JButton btnMontar;
    private JTextArea txtResultado;

    public TelaArmas() {
        super("Montagem de Armas");

        setLayout(new BorderLayout());

        // Painel superior
        JPanel painelSuperior = new JPanel(new GridLayout(2, 1));

        comboTipoArma = new JComboBox<>(new String[]{"Espada", "Arco", "Lanca"});
        painelSuperior.add(new JLabel("Selecione o tipo de arma:"));
        painelSuperior.add(comboTipoArma);

        // Painel melhorias
        JPanel painelMelhorias = new JPanel();
        painelMelhorias.setBorder(BorderFactory.createTitledBorder("Melhorias"));

        chkFogo = new JCheckBox("Encantamento de Fogo");
        chkPonta = new JCheckBox("Ponta Afiada");
        chkMithril = new JCheckBox("Reforço de Mithril");

        painelMelhorias.add(chkFogo);
        painelMelhorias.add(chkPonta);
        painelMelhorias.add(chkMithril);

        // Botão
        btnMontar = new JButton("Montar Arma");
        btnMontar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                montarArma();
            }
        });

        // Resultado
        txtResultado = new JTextArea(5, 30);
        txtResultado.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtResultado);

        // Montagem da tela
        add(painelSuperior, BorderLayout.NORTH);
        add(painelMelhorias, BorderLayout.CENTER);
        add(btnMontar, BorderLayout.EAST);
        add(scroll, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void montarArma() {
        String tipo = comboTipoArma.getSelectedItem().toString().toLowerCase();
        Arma arma = FabricaDeArmas.criarArma(tipo);

        if (chkFogo.isSelected()) arma = new EncantamentoFogo(arma);
        if (chkPonta.isSelected()) arma = new PontaAfiada(arma);
        if (chkMithril.isSelected()) arma = new ReforcoMitril(arma);

        txtResultado.setText("Arma montada: " + arma.getNome()
                + "\nDescrição: " + arma.descricao()
                + "\nDano total: " + arma.getDano());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaArmas());
    }
}
