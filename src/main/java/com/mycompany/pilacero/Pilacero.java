

package com.mycompany.pilacero;

import Clases.Stack;


public class Pilacero {

    public static void main(String[] args) {
        //Creamo la pila 
        // agregamos un objeto
        Stack pila = new Stack();
        
        //agraganos los elementos
        pila.Push(5);
        pila.Push(7);
        pila.Push(3);
        pila.Push(9);
        // utilizamos el metod mostrar elemento para Mostrar los elementos de la pila 
        pila.Mostrarelemento();
    }
}
