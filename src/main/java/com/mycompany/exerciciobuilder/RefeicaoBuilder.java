/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exerciciobuilder;

import comida.HamburguerFrango;
import bebidas.Cocacola;
import comida.HamburguerVegano;
import bebidas.Pepsi;

/**
 *
 * @author G-fire
 */
public class RefeicaoBuilder {
 
    public Refeicao prepararComidaVegana(){
    Refeicao meal = new Refeicao();
    meal.addItem(new HamburguerVegano());
    meal.addItem(new Pepsi());
    return meal;
    }

    public Refeicao prepararNaoComidaVegana(){
    Refeicao meal = new Refeicao();
    meal.addItem(new HamburguerFrango());
    meal.addItem(new Cocacola());
    return meal;
    }
    
}
