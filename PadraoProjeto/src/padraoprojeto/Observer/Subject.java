/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package padraoprojeto.Observer;

/**
 *
 * @author sergy
 */
// Sujeito a ser observado
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
