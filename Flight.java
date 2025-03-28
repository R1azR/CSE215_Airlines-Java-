
package project;

public class Flight {
    private String flightName ; 
    private int flightCode ;
    private int economySeat ;
    private int bussinesSeat ;
   // private int totalSeat ;
    //private int haveSeat ;

    public Flight(String flightName, int flightCode, int economySeat, int bussinesSeat) {
        this.flightName = flightName;
        this.flightCode = flightCode;
        this.economySeat = economySeat;
        this.bussinesSeat = bussinesSeat;
      // this.totalSeat = totalSeat;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(int flightCode) {
        this.flightCode = flightCode;
    }

    public int getEconomySeat() {
        return economySeat;
    }

    public void setEconomySeat(int economySeat) {
        this.economySeat = economySeat;
    }

    public int getBussinesSeat() {
        return bussinesSeat;
    }

    public void setBussinesSeat(int bussinesSeat) {
        this.bussinesSeat = bussinesSeat;
    }

    
   /*
    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }
    
     */

    @Override
    public String toString() {
        return "(" + "Flight Name = " + flightName + ", Flight Code = " + flightCode + ", Economy Seat = " + economySeat + ", Bussiness Seat = " + bussinesSeat + ")";
    }
    

    public int totalSeat(){
        int e_seat = getEconomySeat();
        int b_seat = getBussinesSeat() ;
        int seat = e_seat + b_seat ;
        
        return seat ;
        
                
        
    }
    /*
    public int availableSeat(int e , int b ){
        int a = 0 ;//this. b +this.e ;
        int r = 0 ;
        int  s = getEconomySeat() + getBussinesSeat() ;
        if(a < s ){
            s -- ;
           r  = a ++ ;
        
            
         System.out.println("Free seat is : "+r);   
         }
        return r ;
          
    }
    */
    
    
   public int freeSeat(int numOfPassB){
       int totalSeat = getBussinesSeat() + getEconomySeat() ;
       int freeSeat = totalSeat - numOfPassB ;
      
       return  freeSeat   ;
   }

     
    public void airportFees(int x){
        int s = 2 ;
        if(x <= s){
            int v = 300  ;
            System.out.println("Costing of Airport Fees is "+v+ " dollar");
        }
        else if(x > s){
            double v = (double)(300 + ( (x-2) * (300*0.25)) ) ;
            System.out.println("Costing of Airport Fees is "+v+ " dollar");
        }
        
      }
    
}

        
   
      
   

    
    
    



