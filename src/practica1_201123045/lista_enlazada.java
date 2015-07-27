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
public class lista_enlazada {
    nodo_lista primero, aux;
    int cantidad = 0;
    
    lista_enlazada(){
        primero = new nodo_lista(null, null);
        aux = new nodo_lista(null,null);
    }
    
    public void insertar (String nombre, String tipo){
        nodo_lista nuevo = new nodo_lista(nombre, tipo);
        if (cantidad == 0){
            primero = nuevo;
            cantidad++;
        }else{
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
            cantidad++;
        }
    }
    
}
