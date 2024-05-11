/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.Observer;
import java.math.BigDecimal;

/**
 *
 * @author Joice_
 */
public class Painel_de_Compras implements Observer{
    
    private String responsavel;
    
    public Painel_de_Compras(){};

    public Painel_de_Compras(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public void update(Estoque estoque) {
        
        BigDecimal quantidade = estoque.getQuantidade();
        BigDecimal limite = new BigDecimal("30");
        if(quantidade.compareTo(limite)<0){
        
            System.out.println(responsavel + ":" + estoque.getProduto() + " esta com baixo estoque! " + estoque.getQuantidade() + " unidades ");
              
        
        }
        
        
    }
    
    
    
}
