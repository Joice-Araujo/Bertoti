/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.Observer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joice_
 */
public class Estoque {
    
    private String produto;
    private BigDecimal quantidade;
    private List<Observer> observers = new ArrayList<Observer>();

    public Estoque(){};

    public Estoque(String produto, BigDecimal quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
        avisar();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
    
  
    

    public void enviar(Observer observer){
    
        observers.add(observer);
    };
   
    public void avisar (){
        
        for(Observer observer: observers){
            
            observer.update(this);
        
        }
    };

   
    
    
    
    
}
