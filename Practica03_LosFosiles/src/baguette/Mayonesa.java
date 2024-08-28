package baguette;

/**
 * Clase que simula el ingrediente mayonesa en el baguette
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class Mayonesa extends Ingrediente{


    /**
     * Constructor de mayonesa
     * 
     * @param nucleo Baguette donde se agregara mayonesa
     */
    public Mayonesa(Baguette nucleo) {
        super(nucleo);
        if(this.getMayonesa() > 3) throw new RuntimeException("No se pueden poner mas de 3 porciones de mayonesa");
    }

    @Override
    public String getDescripcion() {
        return nucleo.getDescripcion() + ", Mayonesa";
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
        return nucleo.getCatsup();
    }

    @Override
    public int getMayonesa() {
        return nucleo.getMayonesa() + 1;
    }    
    
}
