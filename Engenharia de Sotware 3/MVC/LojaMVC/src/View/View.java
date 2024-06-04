/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Joice_
 */
import Controller.Cupom;
import Model.Produto;
import java.util.List;


public class View implements Observer {

   private Cupom cupom;
   private List<Produto> produtos;

   public void setCupom(Cupom c){
       this.cupom = c;
   }

   @Override
   public void update(List<Produto> p){
       this.produtos = p;
   }
}
