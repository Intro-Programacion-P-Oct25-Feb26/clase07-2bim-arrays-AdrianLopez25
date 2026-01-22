/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Operacion {

    public static double[] obtenerPromedioSemanal(int[][] pedidos) {
      /* Aqui en esta funcion lo que hace es sacar los promedios de los pedidos
        lo cual se usan arreglos y ciclos para poder sacar el promedio total de
        todos los pedidos que le llegaran a la funciones obtenerPromedioSemanal
        
        */
        double[] promedios = new double[8];
        int suma;
        double promedio;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            promedio = (double) suma / 7;
            promedios[i] = promedio;
        }

        return promedios;
    }

    public static int obtenerSumaTotal(int[][] pedidos) {
        /* Aqui en esta funcion tambien le llega un arreglo bidimensional de 
        pedidos en el cual este se va a encargar de realizar la suma de todos
        gracias a un ciclo repetitivo.
        
        */

        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {

            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }

        }

        return suma;
    }

    public static int[] obtenerSumaSemanal(int[][] pedidos) {
        /* Esta funcion le llega un arreglo bidimensional en donde va a ser la
        suma semanal de los pedidos que le dan en el arreglo.
        
        */
        int[] sumaSemanal = new int[8];
        int suma;
        for (int i = 0; i < pedidos.length; i++) {
            suma = 0;
            for (int j = 0; j < pedidos[i].length; j++) {
                suma = suma + pedidos[i][j];
            }
            sumaSemanal[i] = suma;
        }

        return sumaSemanal;
    }

    public static int obtenerMenor(int[] pedidosCafeteria) {
        /*En esta funcion lo que hace crear un ciclo en donde lo que va a realizar
        es sacar el numero menor de todos los pedidos que le de valor que en esta 
        caso pedidosCafeterias de.
        
        */
        int menor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    public static int obtenerMayor(int[] pedidosCafeteria) {
        /* Aqui en esta funcion lo que se hace es sacar el numero mayor de todos
        los pedidos que le de pedidosCafeterias estos se a almacenar en una varible
        entera en cual va ir en un condicion para saber que pedidos es el menor.
        
        */
        int mayor = pedidosCafeteria[0];
        int valor;
        for (int i = 0; i < pedidosCafeteria.length; i++) {
            valor = pedidosCafeteria[i];
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }

}
