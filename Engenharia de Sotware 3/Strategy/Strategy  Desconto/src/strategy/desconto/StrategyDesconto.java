/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy.desconto;

import Classes.Cinco;
import Classes.Compra;
import Classes.FreteGratis;

/**
 *
 * @author Manhã
 */
public class StrategyDesconto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FreteGratis frete = new FreteGratis();
        Cinco cinco = new Cinco();
        Compra compraUm = new Compra();
        compraUm.setDesconto(cinco);
        compraUm.Descontar();
        compraUm.setDesconto(frete);
        compraUm.Descontar();
    }
    
}
