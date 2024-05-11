/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.Componente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joice_
 */
public class Apartamento implements Componente {
    
    private int numero;
    private List<Componente> componentes = new ArrayList<>();

    public Apartamento(int numero) {
        this.numero = numero;
        
    }

    
    
    
    public void add(Componente component){
        
      componentes.add(component);
    
    
    }
    
    public void remove(Componente component){
    
    componentes.remove(component);
    
    }

    @Override
    public void display() {
        
        System.out.println("Apartamento: " + numero);
        for (Componente componente : componentes) {
            componente.display();
        }

    }
    
    
    
}
