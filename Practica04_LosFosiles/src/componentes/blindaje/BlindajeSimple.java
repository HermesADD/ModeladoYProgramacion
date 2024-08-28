package componentes.blindaje;

/**
 * Clase que simula un blindaje simple de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class BlindajeSimple extends Blindaje{

    @Override
    public String nombre() {
        return "Blindaje Simple";
    }

    @Override
    public int ataque() {
        return 0;
    }

    @Override
    public int defensa() {
        return 40;
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
        return 50000;
    }

}
