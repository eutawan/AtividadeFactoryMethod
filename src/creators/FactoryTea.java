package creators;
import interfaces.Drink;
import products.Tea;

public class FactoryTea extends FactoryDrink{

// RETORNA A INSTANCIA DA BEBIDA CORRESPONDENTE A CLASSE
    @Override
    public Drink createDrink(){
        return new Tea();
    }

}
