package componentes.armas;

public class LaserDestructor extends Arma{

    @Override
    public String nombre() {
        return "Laser Destructor";
    }

    @Override
    public int ataque() {
        return 100;
    }

    @Override
    public int defensa() {
        return 0;
    }

    @Override
    public int velocidad(){
        return 0;
    }

    @Override
    public double peso() {
        return 45;
    }

    @Override
    public double precio() {
        return 100000;
    }
    
}
