package componentes.sistemas;

/**
 * Clase que simula un sistema de propulsion interplanetario de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class SistemaInterplanetario extends SistemasPropulsion{

    @Override
    public String nombre() {
        return "Sistema de propulsion interplanetario";
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
        return 10000;
    }

    @Override
    public double peso() {
        return 180;
    }

    @Override
    public double precio() {
        return 500000;
    }

}
