/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.Componente;

/**
 *
 * @author Joice_
 */
public class Morador implements Componente {
    
    private String nome;

    public Morador(String nome) {
        this.nome = nome;
        
    }
    
    public void display(){
    
        System.out.println("Morador: " + nome);
        
    };
}
