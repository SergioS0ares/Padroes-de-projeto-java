/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Adapter;

/**
 *
 * @author sergy
 */
public class TemperatureAdapter implements ConversorTemperatura {
    private LegacyTemperature legado = new LegacyTemperature();

    public double celsiusParaFahrenheit(double c) {
        return legado.toF(c);
    }

    public double fahrenheitParaCelsius(double f) {
        return legado.toC(f);
    }
}
