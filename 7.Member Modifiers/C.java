public class C {

    private void m1(){
        System.out.println("C class private member");
    }

}

class Test {
    public static void main(String[] args) {
        C c = new C() ;
        c.m1();
    }
    
}