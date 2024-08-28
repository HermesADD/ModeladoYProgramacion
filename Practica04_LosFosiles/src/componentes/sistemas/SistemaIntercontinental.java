package componentes.sistemas;

/**
 * Clase que simula un sistema de propulsion intercontinental de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class SistemaIntercontinental extends SistemasPropulsion{

    @Override
    public String nombre() {
        return "Sistema de propulsion intercontinental";
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
        return 700;
    }

    @Override
    public double peso() {
        return 100;
    }

    @Override
    public double precio() {
        return 200000;
    }
    
}
