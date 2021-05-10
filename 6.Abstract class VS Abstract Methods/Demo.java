abstract public class Demo {

    abstract void m1();
    abstract void m2();

}

abstract  class SubDemo extends Demo {

    public void m1(){

    }

}

class SubSubDemo extends SubDemo {
    public void m2() {

    }
}