/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria;


public class Compra {
    
    private String nomeLivro;
    private String nomeCliente;
    private String cpfCliente;
    private float precoLivro;

    public Compra(String nomeLivro, String nomeCliente, String cpfCliente, float precoLivro) {
        this.nomeLivro = nomeLivro;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.precoLivro = precoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public float getPrecoLivro() {
        return precoLivro;
    }
    
    
    
}
