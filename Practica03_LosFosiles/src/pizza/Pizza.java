package pizza;

/**
 * Clase abstracta que simula una pizza
 * 
 * @author Hermes 
 * @author Steve
 * @author Emiliano
 */
public abstract class Pizza {

    /**
     * Precio de la pizza
     */
    protected double precio;

    /**
     * Tipo de queso en la pizza
     */
    protected String queso;

    /**
     * Tipo de carne en la pizza
     */
    protected String carne;

    /**
     * Tipo de masa en la pizza
     */
    protected String masa;

    /**
     * Método que regresa el precio que tiene la pizza
     * 
     * @return precio
     */
    public double getPrecio(){
        return precio;
    }

    /**
     * Método que regresa el tipo de carne del que está elaborado la pizza
     *
     * @return carne
     */
    public String getTipoCarne(){
        return carne;
    }

    /**
     * Método que regresa el tipo de masa del que está elaborado la pizza
     * 
     * @return masa
     */
    public String getTipoMasa(){
        return masa;
    }

    /**
     * Método que regresa el tipo de queso del que está elaborado la pizza
     * 
     * @return queso
     */
    public String getTipoQueso(){
        return queso;
    }
    
}
