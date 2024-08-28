package componentes.cabina;

/**
 * Clase que simula una cabina de una tripulacion de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class CabinaTripulacion extends Cabina{

    @Override
    public String nombre() {
        return "Cabina de tripulacion";
    }

    @Override
    public int ataque() {
        return 0;
    }

    @Override
    public int defensa() {
        return 0;
    }

    @Override
    public int velocidad() {
        return 0;
    }

    @Override
    public double peso() {
        return 100;
    }

    @Override
    public double precio() {
        return 100000;
    }
    
}
