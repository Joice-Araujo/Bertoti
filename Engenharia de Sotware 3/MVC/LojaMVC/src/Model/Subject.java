/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

import View.Observer;
import java.util.List;


public interface Subject {

    public void registerObserver(Observer ob);

    public void notifyObservers(List<Produto> p);

}