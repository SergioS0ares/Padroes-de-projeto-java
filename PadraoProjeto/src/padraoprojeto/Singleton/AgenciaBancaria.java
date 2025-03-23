package padraoprojeto.Singleton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sergy
 */
public class AgenciaBancaria {
    private static AgenciaBancaria instancia;
    private String nome = "Agência Central";
    private int totalClientes = 0;

    private AgenciaBancaria() {}

    public static AgenciaBancaria getInstancia() {
        if (instancia == null) {
            instancia = new AgenciaBancaria();
        }
        return instancia;
    }

    public void registrarCliente() {
        totalClientes++;
    }

    public String getNome() {
        return nome;
    }

    public int getTotalClientes() {
        return totalClientes;
    }
}
