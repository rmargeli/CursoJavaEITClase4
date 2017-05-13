package cursojavaeitclase4;

public class Pila<T> {                      //T: Generico, remplaza a clases
    private final int MAX;
    private T[] elementos;
    private int tope = -1;
    
    public Pila(int max){
        this.MAX = max;
        elementos = (T[])new Object[MAX];
    }
  
    public void push(T o){
        if (MAX-1 == tope){
            System.out.println("Pila Llena");
            return;
        }
        else
            elementos[++tope] = o;
    }
    
    public T pop(){
        if (tope != -1){           
            T o = elementos[tope];
            elementos[tope--] = null;
            return o;
        }
        else{
            System.out.println("Pila Vacia");
            return null;
        }        
    }
    
    public boolean isEmpty(){
        return(tope < 0);         
    }  

    void mostrar() {
        for(int i = tope; i > -1; i--)
            System.out.println(elementos[i]);       
    }    
    
}
