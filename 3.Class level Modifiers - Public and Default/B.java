package pack2 ;

import pack1.A ;

public class B {
    public static void main(String[] args) {
        A a = new A();
    }
    
}

/*
B.java:3: error: A is not public in pack1; cannot be accessed from outside package
import pack1.A ;
            ^   
B.java:7: error: cannot find symbol
        A a = new A();
        ^
  symbol:   class A
  location: class B
B.java:7: error: cannot find symbol
        A a = new A();
                  ^
  symbol:   class A
  location: class B
3 errors
 */