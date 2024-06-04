/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package View;

/**
 *
 * @author Joice_
 */
import Model.Produto;
import java.util.List;


public interface Observer {
    public void update(List<Produto> l); 
    
}
