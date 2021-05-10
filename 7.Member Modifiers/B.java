package pack2 ;
import pack1.A ;

public class B {

    public static void main(String[] args) {
        A a = new A() ;
        a.m1() ;
    }
    

}

/*
 A is not public in pack1; cannot be accessed from outside package
import pack1.A ;
 */