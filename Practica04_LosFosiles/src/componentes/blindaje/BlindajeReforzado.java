package componentes.blindaje;

/**
 * Clase que simula un blindaje reforzado de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class BlindajeReforzado extends Blindaje{

    @Override
    public String nombre() {
        return "Blindaje Reforzado";
    }

    @Override
    public int ataque() {
        return 0;
    }

    @Override
    public int defensa() {
        return 100;
    }

    @Override
    public int velocidad() {
        return 0;
    }

    @Override
    public double peso() {
        return 120;
    }

    @Override
    public double precio() {
        return 100000;
    }

}
