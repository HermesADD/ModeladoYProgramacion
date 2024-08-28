package baguette;

/**
 * Clase que simula el ingrediente catsup en el baguette
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class Catsup extends Ingrediente{

    /**
     * Constructor de catsup
     * 
     * @param nucleo Baguette donde se agregara catsup
     */
    public Catsup(Baguette nucleo) {
        super(nucleo);
        if(this.getCatsup() > 3) throw new RuntimeException("No se pueden poner mas de 3 porciones de catsup");
    }

    @Override
    public String getDescripcion() {
        return nucleo.getDescripcion() + ", Catsup";
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
        return nucleo.getMostaza();
    }

    @Override
    public int getCatsup() {
        return nucleo.getCatsup() + 1;
    }

    @Override
    public int getMayonesa() {
        return nucleo.getMayonesa();
    }    
    
}
