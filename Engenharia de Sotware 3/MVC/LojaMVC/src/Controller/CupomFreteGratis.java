/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Loja;
import View.View;


public class CupomFreteGratis implements Cupom {

    private View view;
    private Loja loja;

    @Override
    public void receberCupom() {
        System.out.println("Você ganhou Frete Gratis!");
    }

    public void setView(View v) {
        this.view = v;
    }
}
