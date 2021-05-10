class D {
    protected void m1(){
        System.out.println("D class protected method");
    }
}

class Demo extends D {
    public static void main(String[] args) {
        D d = new D();
        d.m1() ;

        Demo d1 = new Demo() ;
        d1.m1() ;

        D dd = new Demo() ;
        dd.m1() ;


    }
    
}