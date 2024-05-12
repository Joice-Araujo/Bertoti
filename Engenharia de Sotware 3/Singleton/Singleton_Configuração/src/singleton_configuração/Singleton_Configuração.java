/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton_configuração;

import Classe.Configuracao;

/**
 *
 * @author Joice_
 */
public class Singleton_Configuração {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Configuracao configuracao = Configuracao.getInstance();
        
        System.out.println("Configuracao atual \n" + "Idioma: " + configuracao.getIdioma() + "\n" +
                "volume: " + configuracao.getVolume() + "\n");
        
        configuracao.setIdioma("Ingles");
        
        Configuracao configuracao2 = Configuracao.getInstance();
        
        System.out.println("Configuracao atual \n" + "Idioma: " + configuracao.getIdioma() + "\n" +
                "volume: " + configuracao.getVolume());
        
    }
    
}
