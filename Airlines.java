
package project;

public class Airlines {
    public static void main(String[] args) {
        
       
        
        
        Flight f = new Flight("Emirates",737,100,30) ;
        System.out.println(" Flight : \n" +f);
        //calling of a totalSeat method .
        System.out.println("Seat is : "+f.totalSeat()) ;  
      
        System.out.println("We have "+f.freeSeat(75)+" available seats ."); 
        
        f.airportFees(6);
      
     
       
       
        
        FlightInformation fi = new FlightInformation("PW","100","Fuel","70000 meters upper from the earth", "200 km/h") ;
        System.out.println("Information of the Flight : \n "+fi);
        fi.weather(3, 67);
        fi.weather(5, 30);
        fi.speed(450) ;
        double r = fi.flyingTimeS(750) ;
        System.out.println("You will reach at your destination within "+r+" minutes .");
        
        
        
        Airport a = new Airport("Dac","Dhaka") ;
        System.out.println("Information of the Airport .\n"+a);
        a.airlinesCode("Em-225") ;
        
        
        
    }
    
}
