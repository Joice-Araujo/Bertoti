/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author Joice_
 */
public class Configuracao {
    
    private static Configuracao instancia;
    private String idioma;
    private int volume;
    
    
      private Configuracao() {
        idioma = "Portugues ";
        volume = 80;
        
    }
      
      
      public static synchronized Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public static Configuracao getInstancia() {
        return instancia;
    }

    public static void setInstancia(Configuracao instancia) {
        Configuracao.instancia = instancia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

   

    
    
      
      
      
}
