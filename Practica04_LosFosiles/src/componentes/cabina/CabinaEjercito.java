package componentes.cabina;

/**
 * Clase que simula una cabina de ejercito de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class CabinaEjercito extends Cabina {

    @Override
    public String nombre() {
        return "Cabina de Ejercito";
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
        return 150;
    }

    @Override
    public double precio() {
        return 250000;
    }
    
}
