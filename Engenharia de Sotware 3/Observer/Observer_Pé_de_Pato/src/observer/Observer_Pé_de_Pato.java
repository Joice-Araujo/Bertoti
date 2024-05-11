/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;

import Classes.Estoque;
import Classes.Painel_de_Compras;
import java.math.BigDecimal;

/**
 *
 * @author Joice_
 */
public class Observer_Pé_de_Pato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BigDecimal quantidadeEstoque = new BigDecimal("25");
        
        Painel_de_Compras resp01 = new Painel_de_Compras("Mario");
        
        Estoque estoq01 = new Estoque (" Pe de pato amarelo", quantidadeEstoque);
        estoq01.enviar(resp01);
        estoq01.setQuantidade(quantidadeEstoque);
        

        BigDecimal quantidadeEstoque02 = new BigDecimal("45");
        
        Painel_de_Compras resp02 = new Painel_de_Compras("Ana");
        
        Estoque estoq02 = new Estoque (" Pe de pato azul", quantidadeEstoque02);
        estoq02.enviar(resp02);
        estoq02.setQuantidade(quantidadeEstoque02);
        
    }
    
}
