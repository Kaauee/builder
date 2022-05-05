/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas;

/**
 *
 * @author G-fire
 */
public class Pepsi extends Refrigerante{

    @Override
    public float preco() {
        return 35.0f;
    }

    @Override
    public String nome() {
       return "Pepsi";
    }
    
}
