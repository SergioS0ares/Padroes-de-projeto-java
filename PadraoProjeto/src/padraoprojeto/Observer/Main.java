/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package padraoprojeto.Observer;

public class Main {
    public static void main(String[] args) {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();

        

        estacao.setMeasurements(25.0f, 70.0f, 1013.0f);
        estacao.setMeasurements(30.0f, 60.0f, 1010.0f);
    }
}
