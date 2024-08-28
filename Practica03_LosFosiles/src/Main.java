import java.util.Scanner;

import baguette.*;
import pizza.*;
import colors.*;

/**
 * Clase principal del programa
 * 
 * @author Hermes
 * @author Steve
 * @author Emiliano
 */

public class Main {
    
    public static void main(String[] args){
        Colors.println("Bienvenido a WaySub, ahora asociado con Las pizzas de Don Crangrejo!!!",Colors.HIGH_INTENSITY);
        Baguette pedido = new Pan();
        Scanner scn = new Scanner(System.in);

        int opcion = -1;

        do{
            Colors.println("¿Que deseas ordenar?\n" +
            "1. Baguette\n" +
            "2. Pizza\n" +
            "0. Salir", Colors.HIGH_INTENSITY);

            while(true){
                try{
                    String opcionUsuario = scn.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                }catch(NumberFormatException e){
                    Colors.println("Opcion invalida\n" +
                    "¿Que deseas ordenar?\n" +
                    "1. Baguette\n" +
                    "2. Pizza\n" +
                    "0. Salir", Colors.RED);
                }
            }

            switch(opcion){
                
                case 1://Baguette
                    int pan;
                    int ingrediente = -1;

                    do{
                        Colors.println("Selecciona un tipo de pan:"
                            + "\n 1. Pan Integral $30"
                            + "\n 2. Pan Centeno $40"
                            + "\n 0. Salir", Colors.BLUE);
                        while(true){
                            try{
                                String opcionUsuario = scn.nextLine();
                                pan = Integer.parseInt(opcionUsuario);
                                break;
                            }catch(NumberFormatException e){
                                Colors.println("Opcion invalida"
                                    + "\n Selecciona un tipo de pan:"
                                    + "\n 1. Pan Integral $30"
                                    + "\n 2. Pan Centeno $40"
                                    + "\n 0. Salir" , Colors.RED);
                            }
                        }

                        switch(pan){
                            case 1:
                                pedido = new PanIntegral();
                                break;
                            case 2:
                                pedido = new PanCenteno();
                                break;
                            case 0:
                                opcion = 0;
                                ingrediente = 0;
                                Colors.println("Vuelva pronto, gracias!!!", Colors.MAGENTA);
                                break;
                            default:
                                Colors.println("Opcion invalida", Colors.RED);
                                break;
                        }
                    }while(pan<0 || pan>2);
                    while(ingrediente != 10 && ingrediente !=0){
                        Colors.println("¿Que desea agregar a su baguette?" +
                            "\n 1. Pollo $10.0" +
                            "\n 2. Pepperoni $10.0" +
                            "\n 3. Jamon $10.0" +
                            "\n 4. Lechuga $4.0" +
                            "\n 5. Jitomate $4.0" +
                            "\n 6. Cebolla $4.0$" +
                            "\n 7. Mostaza $3.0" +
                            "\n 8. Catsup $3.0" +
                            "\n 9. Mayonesa $3.00" +
                            "\n 10. Baguette Listo!!!" +
                            "\n 0. Salir\n", Colors.BLUE);
                        while(true){
                            try{
                                String opcionUsuario = scn.nextLine();
                                ingrediente = Integer.parseInt(opcionUsuario);
                                break;
                            }catch(NumberFormatException e){
                                Colors.println("Opcion Invalida" +
                                    "¿Que desea agregar a su baguette?" +
                                    "\n 1. Pollo $10.0" +
                                    "\n 2. Pepperoni $10.0" +
                                    "\n 3. Jamon $10.0" +
                                    "\n 4. Lechuga $4.0" +
                                    "\n 5. Jitomate $4.0" +
                                    "\n 6. Cebolla $4.0$" +
                                    "\n 7. Mostaza $3.0" +
                                    "\n 8. Catsup $3.0" +
                                    "\n 9. Mayonesa $3.00" +
                                    "\n 10. Baguette Listo!!!" +
                                    "\n 0. Salir\n", Colors.RED);
                            }
                        }
                        try{
                            switch(ingrediente){
                                case 1:
                                    pedido = new Pollo(pedido);
                                    break;
                                case 2:
                                    pedido = new Pepperoni(pedido);
                                    break;
                                case 3:
                                    pedido = new Jamon(pedido);
                                    break;
                                case 4:
                                    pedido = new Lechuga(pedido);
                                    break;
                                case 5:
                                    pedido = new Jitomate(pedido);
                                    break;
                                case 6:
                                    pedido = new Cebolla(pedido);
                                    break;
                                case 7:
                                    pedido = new Mostaza(pedido);
                                    break;
                                case 8:
                                    pedido = new Catsup(pedido);
                                    break;
                                case 9:
                                    pedido = new Mayonesa(pedido);
                                    break;
                                case 10:
                                    Colors.println("Baguette: "
                                    + "\n" + pedido.getDescripcion()
                                    + "\n Precio $" + pedido.precio()
                                    + "\n\nSiguiente Pedido!!!!", Colors.MAGENTA);
                                    break;
                                case 0:
                                    opcion = 0;
                                    Colors.println("Vuelve pronto, gracias!!!", Colors.MAGENTA);
                                    break;
                                default:
                                    Colors.println("Opcion Invalida", Colors.RED);
                                    break;
                            }
                        }catch(RuntimeException e){
                            Colors.println(e.getMessage(), Colors.RED);
                        }
                    }
                    break;

                case 2:
                    int opcionPizza = -1;
                    do{
                        Colors.println("Escoje tu pizza porfavor!"
                            + "\n 1. Pizza Especial 1 $200.0"
                            + "\n 2. Pizza Especial 2 $175.0"
                            + "\n 3. Pizza Especial 3 $220.0"
                            + "\n 4. Pizza Especial 4 $180.0"
                            + "\n 5. Pizza Especial 5 $215.0"
                            + "\n 0. Salir", Colors.GREEN);
                        while(true){
                            try{
                                String opcionUsuario = scn.nextLine();
                                opcionPizza = Integer.parseInt(opcionUsuario);
                                break;
                            }catch(NumberFormatException e){
                                Colors.println("Opcion invalida"
                                    + "\n Escoje tu pizza porfavor!"
                                    + "\n 1. Pizza Especial 1 $200.0"
                                    + "\n 2. Pizza Especial 2 $175.0"
                                    + "\n 3. Pizza Especial 3 $220.0"
                                    + "\n 4. Pizza Especial 4 $180.0"
                                    + "\n 5. Pizza Especial 5 $215.0"
                                    + "\n 0. Salir", Colors.RED);
                            }
                        }

                        switch(opcionPizza){
                            case 1:
                                pedido = new AdaptadorPizza(new Especial1());
                                Colors.println(pedido.getDescripcion(), Colors.MAGENTA);
                                Colors.println("Precio: $" + pedido.precio(),Colors.MAGENTA);
                                break;
                            case 2:
                                pedido = new AdaptadorPizza(new Especial2());
                                Colors.println(pedido.getDescripcion(), Colors.MAGENTA);
                                Colors.println("Precio: $" + pedido.precio(),Colors.MAGENTA);
                                break;
                            case 3:
                                pedido = new AdaptadorPizza(new Especial3());
                                Colors.println(pedido.getDescripcion(), Colors.MAGENTA);
                                Colors.println("Precio: $" + pedido.precio(),Colors.MAGENTA);
                                break;
                            case 4:
                                pedido = new AdaptadorPizza(new Especial4());
                                Colors.println(pedido.getDescripcion(), Colors.MAGENTA);
                                Colors.println("Precio: $" + pedido.precio(),Colors.MAGENTA);
                                break;
                            case 5:
                                pedido = new AdaptadorPizza(new Especial5());
                                Colors.println(pedido.getDescripcion(), Colors.MAGENTA);
                                Colors.println("Precio: $" + pedido.precio(),Colors.MAGENTA);
                                break;
                            case 0:
                                opcion = 0;
                                Colors.println("Vuelve pronto, gracias!!!", Colors.MAGENTA);
                                break;
                            default:
                                Colors.println("Opcion invalida", Colors.RED);
                                break;
                        }
                    }while(opcionPizza < 0 || opcionPizza > 5);

                    break;
            case 0:
                Colors.println("Vuelve Pronto!!!", Colors.MAGENTA);
                break;

            default:
                Colors.println("Opcion Invalida", Colors.RED);
                break;
            }

        }while( opcion !=0);

    }
}
