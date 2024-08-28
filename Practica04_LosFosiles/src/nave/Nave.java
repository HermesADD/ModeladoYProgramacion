package nave;

import componentes.armas.*;
import componentes.blindaje.*;
import componentes.cabina.*;
import componentes.sistemas.*;

/**
 * Clase que simula la nave construida
 * 
 * @author Hermes
 * @author Steve
 * @autho Emiliano
 */
public class Nave {
    
    /**
     * Arma de la nave
     */
    private Arma arma;

    /**
     * Blindaje de la nave
     */
    private Blindaje blindaje;

    /**
     * Cabina de la nave
     */
    private Cabina cabina;

    /**
     * Sistema de propulsion de la nave
     */
    private SistemasPropulsion sistemaPropulsion;

    /**
     * Metodo que asigna el tipo de arma deseada para la nave
     * @param arma - Arma asignada a la nave
     */
    public void setArma(Arma arma){
        this.arma = arma;
    }

    /**
     * Metodo que asigna el tipo de blindaje deseado para la nave
     * @param blindaje - Blindaje asignado a la nave
     */
    public void setBlindaje(Blindaje blindaje){
        this.blindaje = blindaje;
    }

    /**
     * Metodo que asigna el tipo de cabina deseada para la nave
     * @param cabina - Cabina asignada a la nave
     */
    public void setCabina(Cabina cabina){
        this.cabina = cabina;
    }

    /**
     * Metodo que asigna el sistema de propulsion deseado para la nave
     * @param sistemasPropulsion - Sistema asignado a la nave
     */
    public void setSistema(SistemasPropulsion sistemasPropulsion){
        this.sistemaPropulsion = sistemasPropulsion;
    }

    /**
     * Metodo que calcula el ataque total de la nave 
     * @return ataque de la nave
     */
    public int ataque(){
        return arma.ataque() 
            + blindaje.ataque() 
            + cabina.ataque()
            + sistemaPropulsion.ataque();
    }

    /**
     * Metodo que calcula la defensa total de la nave
     * @return defensa de la nave
     */
    public int defensa(){
        return arma.defensa()
            + blindaje.defensa()
            + cabina.defensa()
            + sistemaPropulsion.defensa();
    }

    /**
     * Metodo que calcula la velocidad total de la nave
     * @return velocidad de la nave
     */
    public int velocidad(){
        return arma.velocidad()
            + blindaje.velocidad()
            + cabina.velocidad()
            + sistemaPropulsion.velocidad();
    }

    /**
     * Metodo que calcula el peso total de la nave
     * @return peso de la nave
     */
    public double peso(){
        return arma.peso()
            + blindaje.peso()
            + cabina.peso()
            + sistemaPropulsion.peso();
    }

    /**
     * Metodo que calcula el precio total de la nave
     * @return precio de la nave
     */
    public double precio(){
        return arma.precio()
            + blindaje.precio()
            + cabina.precio()
            + sistemaPropulsion.precio();
    }

    /**
     * Metodo que regresa los datos de la nave
     * @return datos de la nave
     */
    @Override
    public String toString(){
        return "#### Informacion de tu nave ####" 
            + "\nAtaque: " + ataque()
            + "\nDefensa: " + defensa()
            + "\nVelocidad: " + velocidad()
            + "\nPeso: " + peso()
            + "\nPrecio: $" + precio(); 

    }
}
