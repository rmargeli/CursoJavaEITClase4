
package cursojavaeitclase4;

public class Programa {


    public static void main(String[] args) {
        Pila<Integer> p = new Pila <>(10);             //Indico tipo de datos
        p.push(55);
        p.push(44);
        p.push(24);
        p.push(15);
        p.push(8);
        p.push(32);
        p.push(42);
        p.mostrar();
        Pila<String> p1 = new Pila <>(10);
        p1.push("A");
        p1.push("ASDW");
        p1.push("ASW");
        p1.push("E");
        p1.push("C");
        p1.push("32");
        p1.push("8");
        p1.mostrar();
//        System.out.println(p.pop());
        
        
    }
    
}
