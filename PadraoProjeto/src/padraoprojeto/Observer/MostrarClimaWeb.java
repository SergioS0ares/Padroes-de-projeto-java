/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package padraoprojeto.Observer;

import javax.swing.JTextArea;

public class MostrarClimaWeb implements Observer, DisplayElement {
    private JTextArea area;
    private float temperatura;
    private float umidade;
    private float pressao;
    

    public MostrarClimaWeb(Subject estacao, JTextArea area) {
         this.area = area;
        estacao.registerObserver(this);
    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        display();
    }

    @Override
    public void display() {
    area.setText("Web Interface - Atualização de Clima:\n" +
                 "Temperatura: " + temperatura + " ºC\n" +
                 "Umidade: " + umidade + " %\n" +
                 "Pressão: " + pressao + " hPa\n");
}
}
