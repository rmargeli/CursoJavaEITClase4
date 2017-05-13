package cursojavaeitclase4;
/*Throwable--> Exception--> IOException
                       |--> SQLException                                    //chequeadas
                       |--> Runtime Exception--> IndexOutOfboundException   //no chequeadas

try{
    -   
    -
    -
}catch(SQLException e){                                        
}catch(IOException e){                                         //Atrapo excepcion determinada        
}catch(Throwable th){                                          //Atrapo cualquier otro tipo excepcion
            
}finally{                                                      //Se ejecuta siempre, entre o no al catch
}

public Conection Conect() throws SQLException{               //Obligatorio declarar que hay chance de excepcion     
    -
    -
    if(ValidarConexion())
        throw new SQLException();

}  

public void grabar() throws SQLException{                    //Obligatorio declarar que hay chance de excepcion               
    -
    -
    Conection c = db.conectar();
}  




*/

import Exceptions.PilaLlenaException;
import Exceptions.PilaVaciaException;

public class Pila<T> {                      //T: Generico, remplaza a clases
    private final int MAX;
    private T[] elementos;
    private int tope = -1;
    
    public Pila(int max){
        this.MAX = max;
        elementos = (T[])new Object[MAX];
    }
  
    public void push(T o) throws PilaLlenaException{
        if (MAX-1 == tope){
            throw new PilaLlenaException("Pila Llena");
        }
        else
            elementos[++tope] = o;
    }
    
    public T pop() throws PilaVaciaException{
        if (tope != -1){           
            T o = elementos[tope];
            elementos[tope--] = null;
            return o;
        }
        else{
            throw new PilaVaciaException("Pila Vacia");
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
