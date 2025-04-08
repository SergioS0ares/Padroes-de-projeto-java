/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package padraoprojeto.Observer;

import javax.swing.JTextArea;


public class MostrarClimaConsole implements Observer, DisplayElement {
    private JTextArea area;
    private float temperatura, umidade, pressao;

    public MostrarClimaConsole(Subject estacao, JTextArea area) {
         this.area = area;
        estacao.registerObserver(this);
    }

    public void update(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        display();
    }

    public void display() {
    area.setText("=== CLIMA ATUAL ===\n" +
                 "Temperatura: " + temperatura + " ºC\n" +
                 "Umidade:     " + umidade + " %\n" +
                 "Pressão:     " + pressao + " hPa\n" +
                 "====================\n");
}

}
