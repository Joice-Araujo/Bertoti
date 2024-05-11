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
public class Edificio implements Componente{
    
     private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Edificio(String nome) {
        this.nome = nome;
        
    }
    
    
    public void add(Componente component){
    
    componentes.add(component);
    
    }
    
    
    public void remove(Componente component){
    
    componentes.remove(component);
        
    }
    
    public void display(){
    
        System.out.println("Edificio: " + nome);
        
        for (Componente componente : componentes) {
           
            System.out.println();
            componente.display();
            System.out.println();
        }
    
    
    }
    
    
}
