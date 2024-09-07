package products;
import interfaces.Drink;

public class Coffee implements Drink {

// IMPLEMENTAÇÃO ESPECÍFICA DO METODO prepare();
    @Override
    public void prepare(){
        System.out.println("\nPlease wait a moment, coffee being created...");
    }
}
