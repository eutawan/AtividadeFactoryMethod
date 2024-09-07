package products;
import interfaces.Drink;

public class Tea implements Drink {

// IMPLEMENTAÇÃO ESPECÍFICA DO METODO prepare();
    @Override
    public void prepare(){
        System.out.println("\nPlease wait a moment, tea being created...");
    }
}
