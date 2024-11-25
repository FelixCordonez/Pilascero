package Clases;



public class Stack {

    //ESTA ES LA CLSE PILA
    private Nodo cima;// presenta la cima de la fila 
    private int tamaño; // almacena el tamaño de la pila 

    //contructor
    // el constreutoe es que inicializa el objeto
    public Stack() {
        this.cima = null;// es el valor que le da al nicio de un pila que simpre va ser nulo
        this.tamaño = 0;// El tamaño va ir aumentando de 1 en uno
    }

    //metodo Push para agregar u elemnto a mi pila 
    public void Push(int dato) {
        Nodo nuevonodo = new Nodo(dato);//aqui añadimos el elento con un metodo
        nuevonodo.siguiente = cima;// sabemos que el primer nuemero de una pila es null

        cima = nuevonodo;//Añade el nuevo numero
        tamaño++;// va aumentando de 1 en  1

    }
   // para eliminar
    public int pop() {
        int dato = cima.getDato();
        cima = cima.siguiente;
        tamaño--;
        return dato;
    }

    //creamos un metodo de para mostrar elementos 
    public void Mostrarelemento() {
        Nodo nodoactual = cima;

        if (nodoactual == null) {
            System.out.println(" La pila esta vacia ");

        }

        System.out.println("Los elemetos de la pila son: ");
        while (nodoactual != null) {

            System.out.println(nodoactual.getDato());
            nodoactual = nodoactual.siguiente;

        }

    }
    
    //metodo pekk es para sacra el ultimo elemento de la pila
    
    
}
