package pack2 ;
import pack1.E ;

class F extends E {
    public static void main(String[] args) {

       // Error not allowed  
        E e = new E();
        e.m1() ; // error: m1() has protected access in E
    
    // Valid allowd
        F f = new F() ;
        f.m1() ; // E class protected method

     // Error not allowed  
        E e1 = new F() ;
        e1.m1() ; // error: m1() has protected access in E
    }
    
}