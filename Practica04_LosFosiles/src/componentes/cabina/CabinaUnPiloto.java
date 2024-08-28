package componentes.cabina;

/**
 * Clase que simula una cabina de un piloto de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class CabinaUnPiloto extends Cabina {

    @Override
    public String nombre() {
        return "Cabina de un piloto";
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
        return 80;
    }

    @Override
    public double precio() {
        return 80000;
    }
    
}
