package bebidas;

import com.mycompany.exerciciobuilder.Empacotamento;
import com.mycompany.exerciciobuilder.Item;

public abstract class Refrigerante implements Item{

    @Override
    public Empacotamento empacotamento() {
        return new Garrafa();
    }

    @Override
    public abstract float preco();
    
}
