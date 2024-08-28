package componentes.blindaje;

/**
 * Clase que simula un blindaje fortaleza de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class BlindajeFortaleza extends Blindaje{

    @Override
    public String nombre() {
        return "Blindaje Fortaleza";
    }

    @Override
    public int ataque() {
        return 0;
    }

    @Override
    public int defensa() {
        return 200;
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
