/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livraria;

import java.util.List;

/**
 *
 * @author Fatec
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livraria livraria = new Livraria();

        
        livraria.cadastrarLivro("Cisne Negro", "L. Santana", 56.90f);
        livraria.cadastrarLivro("Capitães da Areia", "Jorge Amado", 38.55f);

        livraria.cadastrarCliente("Jéssica", "645859852", "jessica.38@hotmail.com");
        livraria.cadastrarCliente("Catiel", "526487921", "castiel.xexeu7@hotmail.com");
       

         livraria.buscarLivroPorNome("Cisne Negro");
         livraria.buscarLivroPorNome("Macunaima");
         
        
    
        livraria.comprar("Capitães da Areia", "Jéssica", "645859852");
        livraria.comprar("A Pequena sereia", "Pedro", "987654321");
    
        livraria.buscarClientePorNomeECpf("Maria", "987654321");
        livraria.buscarClientePorNomeECpf("Jéssica", "645859852");


    
    }
}
