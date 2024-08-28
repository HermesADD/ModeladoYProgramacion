package baguette;

/**
 * Clase que simula el ingrediente jamon en el baguette
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class Jamon extends Ingrediente{

    /**
     * Constructor de pepperoni
     * 
     * @param nucleo Baguette donde se agregara pepperoni
     */
    public Jamon(Baguette nucleo) {
        super(nucleo);
        if(this.getJamon() > 3) throw new RuntimeException("No se pueden poner mas de 3 porciones de jamon");
    }

    @Override
    public String getDescripcion() {
        return nucleo.getDescripcion() + ", Jamon";
    }

    @Override
    public double precio() {
        return nucleo.precio() + 10.0;
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
        return nucleo.getJamon() + 1;
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
        return nucleo.getMostaza();
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
