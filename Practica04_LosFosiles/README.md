# Práctica 4

> Los Fósiles.

## Integrantes
- Delgado Díaz Hermes Alberto (319258613)
- Paredes Gonzalez Emiliano Sebastian (320047956)
- Quezada Ordoñe Kevin Steve (318331241)

## Paquetes
En esta práctica seccionamos el codigo en 3 paquetes, componentes, nave, colors.
- componentes

    El paquete componentes contiene 4 paquetes, armas, blindaje, cabina y sistemas, ademas de una interface
    - armas 

        El paquete armas contiene las clases 
        - Arma
        - LaserDestructor
        - LaserSimple
        - MisilesPlasma

    - blindaje

        El paquete blindaje contiene las clases
        - Blindaje
        - BlindajeFortaleza
        - BlindajeReforzado
        - BlindajeSimple

    - cabina

        El paquete cabina contiene las clases
        - Cabina
        - CabinaEjercito
        - CabinaTripulacion
        - CabinaUnPiloto
    
    - sistemas

        El paquete sistemas contiene las clases
        - SistemaIntercontinental
        - SistemaInterGalactico
        - SistemaInterplanetario
        - SistemaPropulsion
    
    - Interface llamada NaveComponente

- nave

    El paquete nave contiene 2 clases
    - Ingeniero
    - Nave

- colors
    
    El paquete colors contiene solo una clase llamada Colors que da estilo 
    a los textos que se imprimen en terminal.
    - Colors

Además, en la carpeta src tenemos un archivo Main.java donde se ejecuta el programa.

## Comandos

Para compilar el programa

```shell
user:~/src$ javac Main.java
```

Para ejecutar el programa

```shell
user:~/src$ java Main
```

## Clase Colors

En la práctica se utiliza la clase especial `Colors`̣ elaborada anteriormente en el curso de Estructuras de Datos.

## Patron de Diseño utilizado 

El patron utilizado es Builder, diseñamos una interface NaveComponente que representa un componente de la nave. 

Este componente se implementa en 4 clases abstractas en diferentes partes, arma, blindaje, cabina, y sistemas de propulsión.

Estas clases abstractas se extienden cada una en su tipo de componente específico que se desee.

Además tenemos metodos builder que sirven para construir naves ya predeterminadas por nosotros.

La razón por la cual se utilizo este patron es por la practicidad que da para poder construir un componente dependiedo de lo que desee la persona. Nos permite que sea simple construir la nave a partir de un atributo Arma, Blindaje, Cabina, SistemasPropulsion.

Además se encontro una cierta similitud con el ejemplo de código visto en laboratorio y eso ayudo a la hora de elegirlo. 



