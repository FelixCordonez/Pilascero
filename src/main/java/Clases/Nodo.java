package Clases;

public class Nodo {

    // Primero se crea el nodo 
    int dato;//Variable donde se lamacena el valor
    // donde se guardo el anterior dato de la pila
    Nodo siguiente;// referencia al siguiente nodo del siguiente compañero

    //contrutor que recibe un entero como dato
    // simpre se llama igual a la clase
    public Nodo (int dato){
    
        this.dato = dato;
        this.siguiente = null;
        
    }
    
    //  METODO ´PARA OBTENER ESE DATO

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
}
