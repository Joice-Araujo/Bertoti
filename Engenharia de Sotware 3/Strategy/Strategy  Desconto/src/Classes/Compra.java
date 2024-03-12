/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Manhã
 */
public class Compra {
    public IDesconto desconto;

    public IDesconto getDesconto() {
        return desconto;
    }

    public void setDesconto(IDesconto desconto) {
        this.desconto = desconto;
    }
    
    public void Descontar(){
        desconto.Descontar();
    }
    
}
