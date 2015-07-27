/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201123045;

/**
 *
 * @author LuisGerardo
 */
public class nodo_lista {
    nodo_lista siguiente, anterior;
    String nombre, tipo;
    
    nodo_lista(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        siguiente = null;
        anterior = null;
    }
    
}
