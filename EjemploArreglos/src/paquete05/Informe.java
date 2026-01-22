/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
import paquete04.Operacion;

/**
 *
 * @author reroes
 */
public class Informe {
    
    public static int obtenerTotalDia(int [][] pedidos, int dia){
        /*
        En esta funcion lo que realiza es que aqui hace la suma de todos los pedidos
        pero por cada dia.
        */
        
        int suma = 0;
        for (int i = 0; i < pedidos.length; i++) {
            suma = suma + pedidos[i][dia-1];
        }
        return suma;
    }
    
    public static String obtenerCafeteriaMasPedidos(int [][] pedidos, String[] cafeterias){
        /*
        En esta funcion lo que hace es que se le dan los valor de los pedidos de 
        manera semanal.
        */
        
        int [] sumaSemanal = Operacion.obtenerSumaSemanal(pedidos);
        
        int mayor = sumaSemanal[0];
        int indice = 0;
        for (int i = 0; i < sumaSemanal.length; i++) {
            int valor = sumaSemanal[i];
            
            if (valor > mayor){
                mayor = valor;
                indice = i;
            }
        }
        
        return cafeterias[indice];
        
    }
    
    public static int [] obtenerMenorPedidoCafeteria(int [][] pedidos){
        /*
        En esta funciones se obtiene lo que es el numero menor de pedidos 
        */
        int [] pedidosMenores = new int[8];
        
        for (int i = 0; i < pedidos.length; i++) {
            pedidosMenores[i] = Operacion.obtenerMenor(pedidos[i]);
        }
        
        return pedidosMenores;
    
    }
    
    public static int [] obtenerMayorPedidoCafeteria(int [][] pedidos){
        /* 
        Aqui se lo que hace esta funcion es la de obtener el numero mayor de 
        pedidos que hay en todo el arreglo.
        */
        int [] pedidosMayores = new int[8];
        
        for (int i = 0; i < pedidos.length; i++) {
            pedidosMayores[i] = Operacion.obtenerMayor(pedidos[i]);
        }
        
        return pedidosMayores;
    }
    
    
    
}
