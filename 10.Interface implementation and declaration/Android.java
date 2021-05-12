 interface Phone {

    

    public void playMusic() ;
    public void openCamera() ;
    public void dialNumber(String number) ;

}


 public class Android implements Phone {

    private String number ;

    public void playMusic() {
        System.out.println("Playing Tere naam song.....");
    }

    public void openCamera() {
        System.out.println("Camera is working fine....");
    }

    public void dialNumber(String number) {
        this.number = number ;

        System.out.println("Dialed number is " + number);
    }

}

class Demo {
    public static void main(String[] args) {
        Android nokia = new Android() ;

        nokia.playMusic() ;
        nokia.dialNumber("8692927930") ;
        nokia.openCamera() ;
    }
    
}