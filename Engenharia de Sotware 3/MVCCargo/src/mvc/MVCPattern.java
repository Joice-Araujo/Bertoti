/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;

import Classes.Colaborador;
import Classes.ColaboradorController;
import Classes.ColaboradorView;

/**
 *
 * @author Joice_
 */
public class MVCPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Colaborador model = retriveColaboradorFromDatabase();
 
        ColaboradorView view = new ColaboradorView();
 
        ColaboradorController controller = new ColaboradorController(model, view);
 
        controller.updateView();
 
        controller.setColaboradorCargo("Gerente");
 
        controller.updateView();
    }
    
    private static Colaborador retriveColaboradorFromDatabase() {
        Colaborador colab = new Colaborador();
        colab.setNome("Carlos Mario");
        colab.setCargo("Auxiliar administrativo");
        return colab;
    }
    
}
