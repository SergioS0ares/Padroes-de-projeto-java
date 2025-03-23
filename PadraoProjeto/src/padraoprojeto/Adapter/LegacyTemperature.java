/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Adapter;

/**
 *
 * @author sergy
 */
public class LegacyTemperature {
    public double toF(double tempC) {
        return (tempC * 9.0 / 5.0) + 32;
    }

    public double toC(double tempF) {
        return (tempF - 32) * 5.0 / 9.0;
    }
}
