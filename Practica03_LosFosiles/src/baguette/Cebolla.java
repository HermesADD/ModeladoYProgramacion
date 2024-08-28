package baguette;

/**
 * Clase que simula el ingrediente cebolla en el baguette
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class Cebolla extends Ingrediente{

    /**
     * Constructor de cebolla
     * 
     * @param nucleo Baguette donde se agregara cebolla
     */
    public Cebolla(Baguette nucleo) {
        super(nucleo);
        if(this.getCebolla() > 3) throw new RuntimeException("No se pueden poner mas de 3 porciones de cebolla");
    }

    @Override
    public String getDescripcion() {
        return nucleo.getDescripcion() + ", Cebolla";
    }

    @Override
    public double precio() {
        return nucleo.precio() + 4.0;
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
        return nucleo.getCebolla() + 1;
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
