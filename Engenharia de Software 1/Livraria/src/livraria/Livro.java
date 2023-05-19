/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria;


public class Livro {
    
    private String nome;
    private String autor;
    private float preco;

    public Livro(String nome, String autor, float preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public float getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    
    
    
    
    
}
