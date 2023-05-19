/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livraria;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fatec
 */
public class Livraria {
    private ArrayList<Livro> livros;
    private ArrayList<Cliente> clientes;
    private ArrayList<Compra> compras;
   
    public Livraria() {
        livros = new ArrayList<>();
        clientes = new ArrayList<>();
        compras = new ArrayList<>();
    }

    public Livraria(ArrayList<Livro> livros, ArrayList<Cliente> clientes, ArrayList<Compra> compras) {
        this.livros = livros;
        this.clientes = clientes;
        this.compras = compras;
    }

    
    public void cadastrarLivro(String nome, String autor, float preco) {
         Livro livro = new Livro( nome, autor, preco);
         livros.add(livro);
       
    }
    
    public void cadastrarCliente(String nome, String cpf, String email) {
            Cliente cliente = new Cliente(nome, cpf, email);
            clientes.add(cliente);
    }
     
     public void adicionarCompra(String nomeLivro, String nomeCliente, String cpfCliente, float precoLivro) {
            Compra compra = new Compra (nomeLivro, nomeCliente, cpfCliente, precoLivro);
            compras.add(compra);
    }

     
     
      public Livro buscarLivroPorNome(String nome){
        for(Livro livro : livros){
            if(livro.getNome().equals(nome)){
                System.out.println(livro.getNome()+ "\n" + livro.getPreco()+ "\n");
                return livro;
            }
            
        }
        System.out.println("Livro não encontrado! \n" );
        return null;
    }
     
   public void comprar(String nomeLivro, String nomeCliente, String cpfCliente) {
    Livro livro = buscarLivroPorNome(nomeLivro);
    Cliente cliente = buscarClientePorNomeECpf(nomeCliente, cpfCliente);

    if (livro != null && cliente != null) {
        Compra compra = new Compra(nomeLivro, nomeCliente, cpfCliente, livro.getPreco());
        compras.add(compra);
        System.out.println("Compra realizada com sucesso!" + "\n" + compra.getPrecoLivro()+ "\n");
    } else {
        System.out.println("Cliente ou livro não encontrado!"+ "\n");
    }
}
   
   public Cliente buscarClientePorNomeECpf(String nome, String cpf) {
    for (Cliente cliente : clientes) {
        if (cliente.getNomeCliente().equals(nome) && cliente.getCpf().equals(cpf)) {
            System.out.println("Cliente encontrado: " + cliente.getNomeCliente() + " - " + cliente.getCpf() + "\n");
            return cliente;
        }
    }
    System.out.println("Cliente não encontrado.");
    return null;
}

  
   
}
    

