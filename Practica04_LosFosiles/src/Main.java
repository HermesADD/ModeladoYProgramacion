import java.util.Scanner;

import colors.Colors;
import nave.*;

/**
 * Clase principal del programa
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */

 public class Main {
    
    public static void main(String[] args){
        Ingeniero ingeniero = new Ingeniero();
        Scanner sc = new Scanner(System.in);

        double presupuesto;
        int opcion;

        Colors.println("Bienvenido a la tienda Imperio Galactico!!!", Colors.GREEN);

        do{
            while(true){
                try{
                    Colors.println("Cual es tu presupuesto?", Colors.BLUE);
                    String opcionUsuario = sc.nextLine();
                    presupuesto = Double.parseDouble(opcionUsuario);
                    break;
                }catch(Exception e){
                    Colors.println("Digita bien tu presupuesto", Colors.RED);
                }
            }
            if(presupuesto <= 0){ 
                Colors.println("Digita un numero positivo", Colors.RED);
            }
        }while(presupuesto<=0);

        Colors.println("A continuacion veras y crearas tu nave personalizada", Colors.CYAN);
        Nave navePersonalizada = ingeniero.crearNave();
        Colors.println(navePersonalizada, Colors.MAGENTA);

        if(presupuesto >= navePersonalizada.precio()){
            Colors.println("Tu presupuesto te alcanza!!!, Gracias por comprar", Colors.GREEN);
        }else{
            do{
                
                navePersonalizada = null;
                
                do{
                    Colors.println("Dado que no te alcanza el presupuesto tienes las siguientes opciones"
                        + "\n1. Ver catalogo "
                        + "\n2. Hacer otra nave mas barata"
                        + "\n3. Salir ", Colors.CYAN);
                    
                    while(true){
                        try{
                            String opcionUsuario = sc.nextLine();
                            opcion = Integer.parseInt(opcionUsuario);
                            break;
                        }catch(NumberFormatException e){
                            Colors.println("Digita un numero",Colors.RED);
                        }
                    }
                    
                    if(opcion <=0){
                        Colors.println("Digita un numero positivo",Colors.RED);
                    }else if(opcion >3){
                        Colors.println("Digita un numero valido", Colors.RED);
                    }
                }while(opcion<=0 || opcion>3);

                switch(opcion){
                    case 1:
                        int opcion2;
                        do{
                            while(true){
                                Colors.println("Selecciona la nave"
                                    + "\n1. Nave individual de combate $740,000 "
                                    + "\n2. Nave militar de transporte $525,000"
                                    + "\n3. Nave Espacial de Guerra $1,430,000"
                                    + "\n4. Salir", Colors.CYAN);
                                try{
                                    String opcionUsuario = sc.nextLine();
                                    opcion2 = Integer.parseInt(opcionUsuario);
                                    break;
                                }catch(NumberFormatException e){
                                    Colors.println("Digita un numero",Colors.RED);
                                }
                            }

                            switch(opcion2){
                                case 1:
                                    Nave nave1 = ingeniero.naveIndividual();
                                    Colors.println(nave1, Colors.MAGENTA);
                                    if(presupuesto < nave1.precio()){
                                        Colors.println("No te alcanza", Colors.RED);
                                    }else{
                                        Colors.println("Felicidades, tu presupuesto te alcanza!, gracias por comprar",Colors.GREEN );
                                        opcion = 3;
                                    }
                                    break;
                                case 2:
                                    Nave nave2 = ingeniero.naveMilitarDeTransporte();
                                    Colors.println(nave2, Colors.MAGENTA);
                                    if(presupuesto < nave2.precio()){
                                        Colors.println("No te alcanza", Colors.RED);
                                    }else{
                                        Colors.println("Felicidades, tu presupuesto te alcanza!, gracias por comprar",Colors.GREEN );
                                        opcion = 3;
                                    }
                                    break;
                                case 3:
                                    Nave nave3 = ingeniero.naveEspacialDeGuerra();
                                    Colors.println(nave3, Colors.MAGENTA);
                                    if(presupuesto < nave3.precio()){
                                        Colors.println("No te alcanza", Colors.RED);
                                    }else{
                                        Colors.println("Felicidades, tu presupuesto te alcanza!, gracias por comprar",Colors.GREEN );
                                        opcion = 3;
                                    }
                                    break;
                                case 4:
                                    Colors.println("Saliendo, nos vemos pronto", Colors.YELLOW);
                                    opcion = 3;
                                    break;
                                default:
                                    Colors.println("Opcion invalida", Colors.RED);
                                    break;
                            }
                        }while(opcion2 <= 0 || opcion2 > 4);
                        break;
                    
                    case 2:
                        navePersonalizada = ingeniero.crearNave();
                        Colors.println(navePersonalizada, Colors.MAGENTA);

                        if(presupuesto < navePersonalizada.precio()){
                            Colors.println("No te alcanza", Colors.RED);
                        }else{
                            Colors.println("Felicidades, tu presupuesto te alcanza!, gracias por tu compra", Colors.GREEN);
                            opcion = 3;
                        }
                        break;
                    case 3: 
                        Colors.println("Saliendo, nos vemos pronto", Colors.YELLOW);
                        break;
                    default:
                        Colors.println("Opcion invalida", Colors.RED);
                        break;
                }
            }while(opcion != 3);
        }
        sc.close();
    }
}
