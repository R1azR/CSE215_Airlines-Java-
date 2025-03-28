
package project;

public class FlightInformation {
    
    private String aircraftNO ;
    private String economicCapacity ;
    private String engineType ;
    private String airLength ;
    private String avgSpeed ;
   // private String araivalTime ;
   // private String departureTime ;
    
    

    public FlightInformation(String aircraftNO, String economicCapacity, String engineType, String airLength , String avgSpeed ) {
        this.aircraftNO = aircraftNO;
        this.economicCapacity = economicCapacity;
        this.engineType = engineType;
        this.airLength = airLength;
        this.avgSpeed =  avgSpeed ;
    }

    public String getAircraftNO() {
        return aircraftNO;
    }

    public void setAircraftNO(String aircraftNO) {
        this.aircraftNO = aircraftNO;
    }

    public String getEconomicCapacity() {
        return economicCapacity;
    }

    public void setEconomicCapacity(String economicCapacity) {
        this.economicCapacity = economicCapacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getAirLength() {
        return airLength;
    }

    public void setAirLength(String airLength) {
        this.airLength = airLength;
    }

    public String getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(String avgSpeed) {
        this.avgSpeed = avgSpeed;
    }
    
    
    public double speed(double v){
        try{
            if(v>= 400){
                System.out.println("Please slow your flight and make it's speed under 400km/h.");
            }
            else
                System.out.println("Flight engine is good to go.");
        }catch(Exception e){
            e.printStackTrace();
        }
        return 0 ;
    }
    
    
    public void weather(int w1 , int w2){
        if(w1>2 && w2<65)
            System.out.println("You can land your flight.");
        else
            System.out.println("Please Postpone the flight.");
        
                
    }

    
    public double flyingTimeS(double k){
        double t ;
        if( k <= 450 ){
             t = k * 0.10 ;
            
        }
        else
             t = k * 0.08;
        
        return t ;
    }
    
    
   
    
    @Override
    public String toString() {
        return " (" + "Aircraft NO = " + aircraftNO + ", Economic Capacity = " + economicCapacity + ", Engine Type = " + engineType + ", Air Length = " + airLength + " , Average Speed : "+getAvgSpeed()+")";
    }
    
    
    
}
