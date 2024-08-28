package baguette;

/**
 * Clase que simula el ingrediente pollo en el baguette
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class Pollo extends Ingrediente{

    /**
     * Constructor de pollo
     * 
     * @param nucleo Baguette donde se agregara pollo
     */
    public Pollo(Baguette nucleo) {
        super(nucleo);
        if(this.getPollo() > 3) throw new RuntimeException("No se pueden poner mas de 3 porciones de pollo");
    }

    @Override
    public String getDescripcion() {
        return nucleo.getDescripcion() + ", Pollo";
    }

    @Override
    public double precio() {
        return nucleo.precio() + 10.0;
    }

    @Override
    public int getPollo() {
        return nucleo.getPollo() + 1;
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
