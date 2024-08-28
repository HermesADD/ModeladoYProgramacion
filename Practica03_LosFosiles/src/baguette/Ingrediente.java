package baguette;

/**
 * Clase abstracta que simula un ingrediente
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public abstract class Ingrediente implements Baguette{
    
    /**
     * Baguette referencia donde se coloca el ingrediente
     */
    protected Baguette nucleo;

    /**
     * Constructor de ingrediente
     * 
     * @param nucleo Baguette donde se colocara los ingredientes
     */
    public Ingrediente(Baguette nucleo){
        this.nucleo = nucleo;
    }

    public abstract String getDescripcion();

    public abstract double precio();

    public abstract int getPollo();

    public abstract int getPepperoni();
    
    public abstract int getJamon();
    
    public abstract int getLechuga();
    
    public abstract int getJitomate();
    
    public abstract int getCebolla();
    
    public abstract int getMostaza();
    
    public abstract int getCatsup();
    
    public abstract int getMayonesa();

}
