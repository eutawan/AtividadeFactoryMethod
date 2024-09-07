package creators;
import interfaces.Drink;
import products.Beer;

public class FactoryBeer extends FactoryDrink{

// RETORNA A INSTANCIA DA BEBIDA CORRESPONDENTE A CLASSE
    @Override
    public Drink createDrink() {
        return new Beer();
    }

}
