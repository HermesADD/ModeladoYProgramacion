package componentes.armas;

/**
 * Clase que simula una arma laser simple de la nave
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class LaserSimple extends Arma{
    
    @Override
    public String nombre() {
        return "Laser Simple";
    }

    @Override
    public int ataque() {
        return 35;
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
        return 25;
    }

    @Override
    public double precio() {
        return 25000;
    }

}
