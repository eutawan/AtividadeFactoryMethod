import creators.FactoryBeer;
import creators.FactoryCoffee;
import creators.FactoryDrink;
import creators.FactoryTea;

public class Main {
    public static void main(String[] args) {

// TESTANDO IMPLEMENTAÇAO: CRIANDO INSTANCIAS DAS FABRICAS FactoryBeer, FactoryCoffee e FactoryTea
        FactoryDrink newBeer = new FactoryBeer();
        FactoryDrink newCoffee = new FactoryCoffee();
        FactoryDrink newTea = new FactoryTea();

// UTILIZANDO METODO prepare(); PARA EXIBIR UMA SAIDA
        newBeer.createDrink().prepare();
        newCoffee.createDrink().prepare();
        newTea.createDrink().prepare();
    }
}
