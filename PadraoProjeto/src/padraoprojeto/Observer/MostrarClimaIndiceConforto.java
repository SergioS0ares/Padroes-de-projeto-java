package padraoprojeto.Observer;


import javax.swing.JTextArea;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class MostrarClimaIndiceConforto implements Observer, DisplayElement {
    private float temperatura, umidade;
    private JTextArea area;

    public MostrarClimaIndiceConforto(Subject estacao, JTextArea area) {
        this.area = area;
        estacao.registerObserver(this);
    }

    public void update(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        display();
    }

    public void display() {
        float indice = calcularIndiceConforto(temperatura, umidade);
        area.setText("Índice de Conforto: " + indice + " %");
    }

    private float calcularIndiceConforto(float temp, float umidade) {
        return 100 - Math.abs(22 - temp) * 2 - (100 - umidade) * 0.3f;
    }
}
