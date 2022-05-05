
package com.mycompany.exerciciobuilder;

public class Principal {
    
    public static void main(String[] args) {
      
        RefeicaoBuilder refeicaoBuilder = new RefeicaoBuilder();
        
        Refeicao comidaVegana = refeicaoBuilder.prepararComidaVegana();
        System.out.println("Comida Vegana");
        comidaVegana.showItems();
        System.out.println("Preco total: " + comidaVegana.getCost());
        
        Refeicao comidaNaoVegana = refeicaoBuilder.prepararNaoComidaVegana();
        System.out.println("Comida Não Vegana");
        comidaNaoVegana.showItems();
        System.out.println("Preco total: " + comidaNaoVegana.getCost());
        
        
        
    }
    
}
