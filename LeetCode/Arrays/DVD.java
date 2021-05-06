  import java.util.Iterator;
  
  class DVD {

    private String name ;
    private int releaseYear ;
    private String director ;

    public DVD(String name, int year, String director_name){
        this.name = name ;
        this.releaseYear = year ;
        this.director = director_name ;
    }

    public void display(){
        System.out.println(this.name + " directed by- " + this.director + "in the year-" + this.releaseYear);

    }

    
}

class Demo {
   public static void main(String[] args) {

        DVD[] dvdCollection = new DVD[15];

        DVD avengerDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        dvdCollection[0] = avengerDVD ;
        dvdCollection[1] = incrediblesDVD;
        dvdCollection[2] = findingDoryDVD ;
        dvdCollection[3] = lionKingDVD ;

       avengerDVD.display() ;
       incrediblesDVD.display() ;
       
   }
   
    
}