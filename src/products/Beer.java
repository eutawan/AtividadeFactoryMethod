package products;
import interfaces.Drink;

public class Beer implements Drink {

// IMPLEMENTAÇÃO ESPECÍFICA DO METODO prepare();
    @Override
    public void prepare(){
        System.out.println("\nPlease wait a moment, beer being created...");
    }
}
