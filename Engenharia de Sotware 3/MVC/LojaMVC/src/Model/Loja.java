/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Joice_
 */
import View.Observer;
import java.util.ArrayList;
import java.util.List;


public class Loja implements Subject {

    private List<Produto> produtos = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o){
        this.observers.add(o);
    }

    @Override
    public void notifyObservers(List<Produto> l){
        this.observers.stream().forEach(ob -> {
            System.out.println("Novos produtos adicionados:");
            l.stream().forEach(p -> {
                System.out.println(". " + p.getNome());
            });
        });
    }

    public void addProduto(Produto p){
        this.produtos.add(p);
        notifyObservers(this.produtos);
    }

    public Produto buscarProduto(String nome){
        return this.produtos.stream().filter(r -> r.getNome().equalsIgnoreCase(nome)).findFirst().get();
    }
}
