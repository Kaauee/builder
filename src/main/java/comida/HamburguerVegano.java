/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comida;

/**
 *
 * @author G-fire
 */
public class HamburguerVegano extends Hamburguer {

    @Override
    public float preco() {
        return 25.0f;
    }

    @Override
    public String nome() {
       return "Hambureguer Vegano";
    }
    
}
