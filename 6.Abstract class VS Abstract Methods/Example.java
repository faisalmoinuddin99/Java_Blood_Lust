abstract class Vehicle {
   abstract public int getNoWheels();
}

class Bus extends Vehicle {
    public int getNoWheels(){
        return 6 ;
    }
}

class Auto extends Vehicle {
    public int getNoWheels() {
        return 3 ;
    }
}

public class Example {
    public static void main(String[] args) {
        Bus b = new Bus();
        System.out.println(b.getNoWheels());

        Auto a = new Auto() ;
        System.out.println(a.getNoWheels());
    }
    
}

/*
6 
3
*/