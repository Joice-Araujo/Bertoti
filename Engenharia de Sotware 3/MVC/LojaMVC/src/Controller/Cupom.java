/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;


import Model.Loja;
import View.View;

public interface Cupom {
    View view = new View();
    Loja loja = new Loja();
   
    public void receberCupom();

}
