package comida;

import com.mycompany.exerciciobuilder.Empacotamento;
import com.mycompany.exerciciobuilder.Item;

public abstract class Hamburguer implements Item{

    @Override
    public Empacotamento empacotamento() {
       return new Plastico();
    }

    @Override
    public abstract float preco();
    
}
