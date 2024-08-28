package componentes;

/**
 * Interface que simula un componente(parte) de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */

public interface NaveComponente{

    /**
     * Metodo que regresa el nombre del componente de la nave
     * @return nombre del componente
     */
    public String nombre();

    /**
     * Metodo que regresa el ataque del componente de la nave
     * @return ataque del componente
     */
    public int ataque();

    /**
     * Metodo que regresa la defensa del componente de la nave
     * @return defensa del componente
     */
    public int defensa();

    /**
     * Metodo que regresa la velocidad del componente de la nave
     * @return velocidad del componente
     */
    public int velocidad();

    /**
     * Metodo que regresa el peso del componente de la nave
     * @return peso del componente
     */
    public double peso();
    
    /**
     * Metodo que regresa el precio del componente de la nave
     * @return precio del componente 
     */
    public double precio();

}