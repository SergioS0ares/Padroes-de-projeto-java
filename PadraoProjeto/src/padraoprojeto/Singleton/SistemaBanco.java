/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Singleton;

/**
 *
 * @author sergy
 */
public class SistemaBanco {
    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana");
        System.out.println(ana.descricao());

        Cliente bruno = new Cliente("Bruno");
        System.out.println(bruno.descricao());

        Cliente carla = new Cliente("Carla");
        System.out.println(carla.descricao());
    }
}
