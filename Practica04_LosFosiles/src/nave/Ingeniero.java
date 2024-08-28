package nave;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import componentes.armas.*;
import componentes.blindaje.*;
import componentes.cabina.*;
import componentes.sistemas.*;
import colors.*;

/**
 * Clase que simula al ingeniero que construira la nave
 * 
 * @author Hermes
 * @author Steve
 * @autho Emiliano
 */
public class Ingeniero {

    /**
     * Primera parte de la clase
     * 
     * Metodos que serviran para armar una nave propia
     */

    /**
     * Metodo privado para seleccionar arma
     * @return arma seleccionada
     */
    private Arma seleccionarArma(){
        Scanner scn = new Scanner(System.in);
        Arma arma = null;
        int opcion;

        do{
            Colors.println("Selecciona el tipo de arma que desees!"
                + "\n1. Arma de Laser Simple $25,000 "
                + "\n2. Arma Misiles de Plasma $60,000"
                + "\n3. Arma de Laser Destructor $100,00" ,Colors.CYAN );
            
            while(true){
                try{
                    String opcionUsuario = scn.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;  
                }catch(NumberFormatException e){
                    Colors.println("Opcion invalida", Colors.RED);
                    Colors.println("Ingrese un numero"
                        + "\n1. Arma de Laser Simple $25,000 "
                        + "\n2. Arma Misiles de Plasma $60,000"
                        + "\n3. Arma de Laser Destructor $100,00" ,Colors.CYAN);
                }catch(NoSuchElementException e){
                    //No hace nada
                }
            }
            switch(opcion){
                case 1:
                    arma = new LaserSimple();
                    break;
                case 2:
                    arma = new MisilesPlasma();
                    break;
                case 3:
                    arma = new LaserDestructor();
                    break;
                default:
                    Colors.println("Opcion invalida",Colors.RED);
                    opcion = 0;
                    break;
            }
        }while(opcion == 0);

        return arma;
    } 

    /**
     * Metodo privado para seleccionar el blindaje
     * @return blindaje seleccionado
     */
    private Blindaje seleccionarBlindaje(){
        Scanner scn = new Scanner(System.in);
        Blindaje blindaje = null;
        int opcion;

        do{
            Colors.println("Selecciona el tipo de blindaje que desees!"
                + "\n1. Blindaje simple $50,000"
                + "\n2. Blindaje reforzado $100,000"
                + "\n3. Blindaje fortaleza $250,000" ,Colors.CYAN );
            
            while(true){
                try{
                    String opcionUsuario = scn.nextLine();
                    opcion = Integer.parseInt(opcionUsuario); 
                    break;
                }catch(NumberFormatException e){
                    Colors.println("Opcion invalida", Colors.RED);
                    Colors.println("Ingrese un numero"
                        + "\n1. Blindaje simple $50,000"
                        + "\n2. Blindaje reforzado $100,000"
                        + "\n3. Blindaje fortaleza $250,000" ,Colors.CYAN);
                }catch(NoSuchElementException e){
                    //No hace nada
                }
            }
            switch(opcion){
                case 1:
                    blindaje = new BlindajeSimple();
                    break;
                case 2:
                    blindaje = new BlindajeReforzado();
                    break;
                case 3:
                    blindaje = new BlindajeFortaleza();
                    break;
                default:
                    Colors.println("Opcion invalida",Colors.RED);
                    opcion = 0;
                    break;
            }
        }while(opcion ==0);

        return blindaje;
    }

    /**
     * Metodo privado para seleccionar la cabina
     * @return cabina seleccionada
     */
    private Cabina seleccionarCabina(){
        Scanner scn = new Scanner(System.in);
        Cabina cabina = null;
        int opcion;

        do{
            Colors.println("Selecciona el tipo de cabina que desees!"
                + "\n1. Cabina de un piloto $80,000"
                + "\n2. Cabina de tripulacion $100,000"
                + "\n3. Cabina de ejercito $250,000" ,Colors.CYAN );
            
            while(true){
                try{
                    String opcionUsuario = scn.nextLine();
                    opcion = Integer.parseInt(opcionUsuario); 
                    break;
                }catch(NumberFormatException e){
                    Colors.println("Opcion invalida", Colors.RED);
                    Colors.println("Ingrese un numero"
                        + "\n1. Cabina de un piloto $80,000"
                        + "\n2. Cabina de tripulacion $100,000"
                        + "\n3. Cabina de ejercito $250,000",Colors.CYAN);
                }catch(NoSuchElementException e){
                    //No hace nada
                }
            }
            switch(opcion){
                case 1:
                    cabina = new CabinaUnPiloto();
                    break;
                case 2:
                    cabina = new CabinaTripulacion();
                    break;
                case 3:
                    cabina = new CabinaEjercito();
                    break;
                default:
                    Colors.println("Opcion invalida",Colors.RED);
                    opcion = 0;
                    break;
            }
        }while(opcion == 0);

        return cabina;
    }

    private SistemasPropulsion seleccionarSistema(){
        Scanner scn = new Scanner(System.in);
        SistemasPropulsion sistema= null;
        int opcion;

        do{
            Colors.println("Selecciona el tipo de cabina que desees!"
                + "\n1. Sistema de propulsion intercontinental $200,000"
                + "\n2. Sistema de propulsion interplanetario $500,000"
                + "\n3. Sistema de propulsion intergalactico $1,000,000" ,Colors.CYAN );
            
            while(true){
                try{
                    String opcionUsuario = scn.nextLine();
                    opcion = Integer.parseInt(opcionUsuario); 
                    break;  
                }catch(InputMismatchException e){
                    Colors.println("Opcion invalida", Colors.RED);
                    Colors.println("Ingrese un numero"
                        + "\n1. Sistema de propulsion intercontinental $200,000"
                        + "\n2. Sistema de propulsion interplanetario $500,000"
                        + "\n3. Sistema de propulsion intergalactico $1,000,000",Colors.CYAN);
                }catch(NoSuchElementException e){
                    //No hace nada
                }
            }
            switch(opcion){
                case 1:
                    sistema = new SistemaIntercontinental();
                    break;
                case 2:
                    sistema = new SistemaInterplanetario();
                    break;
                case 3:
                    sistema = new SistemaInterGalactico();
                    break;
                default:
                    Colors.println("Opcion invalida",Colors.RED);
                    opcion = 0;
                    break;
            }
        }while(opcion ==0);

        return sistema;
    }

    /**
     * Metodo para crear nave personalizada
     * @return nave personalizada
     */
    public Nave crearNave(){
        Nave naveCreada = new Nave();
        Colors.println("Crearas tu propia nave", Colors.HIGH_INTENSITY);
        Arma armaPer = seleccionarArma();
        Blindaje blindajePer = seleccionarBlindaje();
        Cabina cabinaPer = seleccionarCabina();
        SistemasPropulsion sistemaPer = seleccionarSistema();
        naveCreada.setArma(armaPer);
        naveCreada.setBlindaje(blindajePer);
        naveCreada.setCabina(cabinaPer);
        naveCreada.setSistema(sistemaPer);

        return naveCreada;
    }

    /**
     * Segunda parte
     * Metodos builder para naves ya predeterminadas en el catalogo!!!!
     */

    /**
     * Metodo builder para crear una nave individual de combate
     * @return nave indidual de combate
     */
    public Nave naveIndividual(){
        Nave nave = new Nave();
        nave.setArma(new LaserSimple());
        nave.setBlindaje(new BlindajeReforzado());
        nave.setCabina(new CabinaUnPiloto());
        nave.setSistema(new SistemaInterplanetario());

        return nave;
    }

    /**
     * Metodo builder para crea una nave militar de transporte
     * @return nave militar de transporte
     */
    public Nave naveMilitarDeTransporte(){
        Nave nave = new Nave();
        nave.setArma(new LaserSimple());
        nave.setBlindaje(new BlindajeSimple());
        nave.setCabina(new CabinaEjercito());
        nave.setSistema(new SistemaIntercontinental());

        return nave;
    }

    /**
     * Metodo builder para crear una nave Base espacial de guerra
     * @return nave base espacial de guerra
     */
    public Nave naveEspacialDeGuerra(){
        Nave nave = new Nave();
        nave.setArma(new LaserDestructor());
        nave.setBlindaje(new BlindajeFortaleza());
        nave.setCabina(new CabinaUnPiloto());
        nave.setSistema(new SistemaInterGalactico());

        return nave;
    }
}
