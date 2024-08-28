package baguette;
/**
 * Interface que simula un Baguette
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public interface Baguette{

    /**
     * Devuelve la descripcion del baguette
     * 
     * @return Descripcion Baguette
     */
    String getDescripcion();

    /**
     * Devuelve el precio del baguette
     * 
     * @return Precio Baguette
     */
    double precio();

    /**
     * Devuelve la cantidad de porciones de pollo en el baguette
     * 
     * @return Cantidad de porciones de pollo en el baguette
     */
    int getPollo();

    /**
     * Devuelve la cantidad de porciones de pepperoni en el baguette
     * 
     * @return Cantidad de porciones de pepperoni en el baguette
     */
    int getPepperoni();

    /**
     * Devuelve la cantidad de porciones de jamon en el baguette
     * 
     * @return Cantidad de porciones de jamon en el baguette
     */
    int getJamon();

    /**
     * Devuelve la cantidad de porciones de lechuga en el baguette
     * 
     * @return Cantidad de porciones de lechuga en el baguette
     */
    int getLechuga();

    /**
     * Devuelve la cantidad de porciones de jitomate en el baguette
     * 
     * @return Cantidad de porciones de jitomate en el baguette
     */
    int getJitomate();

    /**
     * Devuelve la cantidad de porciones de cebolla en el baguette
     * 
     * @return Cantidad de porciones de cebolla en el baguette
     */
    int getCebolla();

    /**
     * Devuelve la cantidad de porciones de mostaza en el baguette
     * 
     * @return Cantidad de porciones de mostaza en el baguette
     */
    int getMostaza();

    /**
     * Devuelve la cantidad de porciones de catsup en el baguette
     * 
     * @return Cantidad de porciones de catsup en el baguette
     */
    int getCatsup();

    /**
     * Devuelve la cantidad de porciones de mayonesa en el baguette
     * 
     * @return Cantidad de porciones de mayonesa en el baguette
     */
    int getMayonesa();

}
