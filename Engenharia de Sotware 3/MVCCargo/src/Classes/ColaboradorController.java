/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Joice_
 */
public class ColaboradorController {
    
     private Colaborador model;
    private ColaboradorView view;
 
    public ColaboradorController(Colaborador model, ColaboradorView view) {
        this.model = model;
        this.view = view;
    }
 
    public void setColaboradorNome(String nome) {
        model.setNome(nome);
    }
 
    public String getSColaboradorNome() {
        return model.getNome();
    }
 
    public void setColaboradorCargo(String cargo) {
        model.setCargo(cargo);
    }
 
    public String getColaboradorCargo() {
        return model.getCargo();
    }
    
     public void updateView() {
        view.printColaboradorDetalhes(model.getNome(), model.getCargo());
    }
}
