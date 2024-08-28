package componentes.armas;

/**
 * Clase que simula una arma misiles de plasma de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class MisilesPlasma extends Arma{

    @Override
    public String nombre() {
        return "Misiles de Plasma";
    }

    @Override
    public int ataque() {
        return 70;
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
        return 35;
    }

    @Override
    public double precio() {
        return 60000;
    }

}
