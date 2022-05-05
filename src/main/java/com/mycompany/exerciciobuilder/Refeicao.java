/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciobuilder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G-fire
 */
public class Refeicao {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.preco();

        }
        return cost;

    }

    public void showItems() {

        for (Item item : items) {
            System.out.print("Item: " + item.nome());
            System.out.print(", Pacote: " + item.empacotamento().empacotar());
            System.out.println(", Preco: " + item.preco());
        }

    }

}
