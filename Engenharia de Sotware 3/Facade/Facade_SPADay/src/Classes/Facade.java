/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Joice_
 */
public class Facade {

    private DaySpaDesportista desportista;
    private DaySpaEnergia energia;

    public Facade() {

        desportista = new DaySpaDesportista();
        energia = new DaySpaEnergia();

    }

    public void agendarSpaDesportista() {
        desportista.descDesportista();

    }

    public void agendarSpaEnergia() {

        energia.descSpaEnergia();
    }

}
