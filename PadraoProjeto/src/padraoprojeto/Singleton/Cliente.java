/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padraoprojeto.Singleton;

/**
 *
 * @author sergy
 */
public class Cliente {
    private String nome;
    private AgenciaBancaria agencia;

    public Cliente(String nome) {
        this.nome = nome;
        this.agencia = AgenciaBancaria.getInstancia();
        this.agencia.registrarCliente();
    }

    public String descricao() {
        return "Cliente: " + nome +
               "\nAgência: " + agencia.getNome() +
               "\nTotal de Clientes na Agência: " + agencia.getTotalClientes() +
               "\nCódigo da Agência (hash): " + agencia.hashCode() + "\n";
    }
}