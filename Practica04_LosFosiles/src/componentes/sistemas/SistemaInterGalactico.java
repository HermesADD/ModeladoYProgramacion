package componentes.sistemas;

/**
 * Clase que simula un sistema de propulsion intergalactico de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class SistemaInterGalactico extends SistemasPropulsion {

    @Override
    public String nombre() {
        return "Sistema de propulsion intergalactico";
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
        return 100000;
    }

    @Override
    public double peso() {
        return 250;
    }

    @Override
    public double precio() {
        return 1000000;
    }

}
