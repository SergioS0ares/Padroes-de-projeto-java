/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package padraoprojeto.Observer;

import java.util.ArrayList;

public class EstacaoMeteorologica implements Subject {
    private ArrayList<Observer> observers;
    private float temperatura;
    private float umidade;
    private float pressao;

    public EstacaoMeteorologica() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(temperatura, umidade, pressao);
        }
    }

    public void setMedicoes(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        notifyObservers();
    }
    public void setMeasurements(float temperatura, float umidade, float pressao) {
    this.temperatura = temperatura;
    this.umidade = umidade;
    this.pressao = pressao;
    notifyObservers(); // Notifica os observers da mudança
}

}
