package baguette;

/**
 * Clase que simula un pan, elemento donde inicia la preparacion del baguette
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */

public class Pan implements Baguette {

    /**
    * Cadena que denota la descripcion de la baguette
    */
    protected String descripcion;

    /**
    * Double que denota el precio de la baguette
    */
    protected double precio;

    /**
    * Entero que indica el numero de porciones de pollo
    */
    protected int pollo;

    /**
    * Entero que indica el numero de porciones de pepperoni
    */
    protected int pepperoni;

    /**
    * Entero que indica el numero de porciones de jamón
    */
    protected int jamon;

    /**
    * Entero que indica el numero de porciones de lechuga
    */
    protected int lechuga;

    /**
    * Entero que indica el numero de porciones de jitomate
    */
    protected int jitomate;

    /**
    * Entero que indica el numero de porciones de cebolla
    */
    protected int cebolla;

    /**
    * Entero que indica el numero de porciones de mostaza
    */
    protected int mostaza;

    /**
    * Entero que indica el numero de porciones de catsup
    */
    protected int catsup;

    /**
    * Entero que indica el numero de porciones de mayonesa
    */
    protected int mayonesa;

    /**
    * Constructor del pan
    */
    public Pan() {
        this.descripcion = "Pan";
        this.precio = 20.0;
        this.pollo = 0;
        this.pepperoni = 0;
        this.jamon = 0;
        this.lechuga = 0;
        this.jitomate = 0;
        this.cebolla = 0;
        this.mostaza = 0;
        this.catsup = 0;
        this.mayonesa = 0;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double precio() {
        return precio;
    }

    @Override
    public int getPollo() {
        return pollo;
    }

    @Override
    public int getPepperoni() {
        return pepperoni;
    }

    @Override
    public int getJamon() {
        return jamon;
    }

    @Override
    public int getLechuga() {
        return lechuga;
    }

    @Override
    public int getJitomate() {
        return jitomate;
    }

    @Override
    public int getCebolla() {
        return cebolla;
    }

    @Override
    public int getMostaza() {
        return mostaza;
    }

    @Override
    public int getCatsup() {
        return catsup;
    }

    @Override
    public int getMayonesa() {
        return mayonesa;
    }

    
}
