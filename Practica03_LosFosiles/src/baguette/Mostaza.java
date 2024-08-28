package baguette;

/**
 * Clase que simula el ingrediente mostaza en el baguette
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class Mostaza extends Ingrediente{

    /**
     * Constructor de mostaza
     * 
     * @param nucleo Baguette donde se agregara mostaza
     */
    public Mostaza(Baguette nucleo) {
        super(nucleo);
        if(this.getMostaza() > 3) throw new RuntimeException("No se pueden poner mas de 3 porciones de mostaza");
    }

    @Override
    public String getDescripcion() {
        return nucleo.getDescripcion() + ", Mostaza";
    }

    @Override
    public double precio() {
        return nucleo.precio() + 3.0;
    }

    @Override
    public int getPollo() {
        return nucleo.getPollo();
    }

    @Override
    public int getPepperoni() {
        return nucleo.getPepperoni();
    }

    @Override
    public int getJamon() {
        return nucleo.getJamon();
    }

    @Override
    public int getLechuga() {
        return nucleo.getLechuga();
    }

    @Override
    public int getJitomate() {
        return nucleo.getJitomate();
    }

    @Override
    public int getCebolla() {
        return nucleo.getCebolla();
    }

    @Override
    public int getMostaza() {
        return nucleo.getMostaza() + 1;
    }

    @Override
    public int getCatsup() {
        return nucleo.getCatsup();
    }

    @Override
    public int getMayonesa() {
        return nucleo.getMayonesa();
    }    
    
}
