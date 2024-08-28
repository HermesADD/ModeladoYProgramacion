package baguette;

/**
 * Clase que simula el ingrediente jitomate en el baguette
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */
public class Jitomate extends Ingrediente {

    /**
     * Constructor de jitomate
     * 
     * @param nucleo Baguette donde se agregara jitomate
     */
    public Jitomate(Baguette nucleo) {
        super(nucleo);
        if(this.getJitomate() > 3) throw new RuntimeException("No se pueden poner mas de 3 porciones de jitomate");
    }

    @Override
    public String getDescripcion() {
        return nucleo.getDescripcion() + ", Jitomate";
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
        return nucleo.getJitomate() + 1;
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
