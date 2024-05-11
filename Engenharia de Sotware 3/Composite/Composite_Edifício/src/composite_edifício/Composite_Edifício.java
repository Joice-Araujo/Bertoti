/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite_edifício;

import Classes.Apartamento;
import Classes.Edificio;
import Classes.Morador;
import Interfaces.Componente;

/**
 *
 * @author Joice_
 */
public class Composite_Edifício {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Morador morador01 = new Morador("Camila");
        Morador morador02 = new Morador("Joao");

        Apartamento apart4 = new Apartamento(04);
        ((Apartamento) apart4).add(morador01);
        ((Apartamento) apart4).add(morador02);

        Morador morador03 = new Morador("Jorge");
        Morador morador04 = new Morador("Mateus");
        Morador morador05 = new Morador("Felipe");

        Apartamento apart5 = new Apartamento(05);
        ((Apartamento) apart5).add(morador03);
        ((Apartamento) apart5).add(morador04);
        ((Apartamento) apart5).add(morador05);
        //((Apartamento) apart5).remove(morador05);

        Edificio edificio = new Edificio("Bem-te-vi");
        ((Edificio) edificio).add(apart4);
        ((Edificio) edificio).add(apart5);

        edificio.display();

    }

}
