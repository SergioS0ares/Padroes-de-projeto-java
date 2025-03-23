/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Adapter;

/**
 *
 * @author sergy
 */
public class Testando {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new TemperatureAdapter();

        double c = 25.0;
        double f = conversor.celsiusParaFahrenheit(c);
        System.out.println(c + "°C = " + f + "°F");

        double f2 = 77.0;
        double c2 = conversor.fahrenheitParaCelsius(f2);
        System.out.println(f2 + "°F = " + c2 + "°C");
    }
}
