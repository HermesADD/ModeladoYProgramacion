package pizza;

import baguette.*;

/**
 * Clase que simula un adaptador de pizza
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class AdaptadorPizza implements Baguette{

    /**
     * Pizza que se adaptara
     */
    protected Pizza pizza;

    /**
     * Constructor del adaptador de pizza
     * @param pizza
     */
    public AdaptadorPizza(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescripcion() {
        return "Tipo de masa: " + pizza.getTipoMasa()  
                + " \nTipo de queso: " + pizza.getTipoQueso()
                + "\nTipo de carne:  "+pizza.getTipoCarne();
    }

    @Override
    public double precio() {
        return pizza.getPrecio();
    }

    @Override
    public int getPollo() {
        throw new RuntimeException("Porciones de ingredientes no contables en la pizza");
    }

    @Override
    public int getPepperoni() {
        throw new RuntimeException("Porciones de ingredientes no contables en la pizza");
    }

    @Override
    public int getJamon() {
        throw new RuntimeException("Porciones de ingredientes no contables en la pizza");
    }

    @Override
    public int getLechuga() {
        throw new RuntimeException("Porciones de ingredientes no contables en la pizza");
    }

    @Override
    public int getJitomate() {
        throw new RuntimeException("Porciones de ingredientes no contables en la pizza");
    }

    @Override
    public int getCebolla() {
        throw new RuntimeException("Porciones de ingredientes no contables en la pizza");
    }

    @Override
    public int getMostaza() {
        throw new RuntimeException("Porciones de ingredientes no contables en la pizza");
    }

    @Override
    public int getCatsup() {
        throw new RuntimeException("Porciones de ingredientes no contables en la pizza");
    }

    @Override
    public int getMayonesa() {
        throw new RuntimeException("Porciones de ingredientes no contables en la pizza");
    }
    
}
