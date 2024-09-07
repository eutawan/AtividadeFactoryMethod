package creators;
import interfaces.Drink;
import products.Coffee;

public class FactoryCoffee extends FactoryDrink{

// RETORNA A INSTANCIA DA BEBIDA CORRESPONDENTE A CLASSE
    @Override
    public Drink createDrink() {
        return new Coffee();
    }
}
