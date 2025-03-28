
package project;

public class Airport {
    private String airportCode ;
    private String airportName ;

    public Airport(String airportCode, String airportName) {
        this.airportCode = airportCode;
        this.airportName = airportName;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }
    
     public void airlinesCode(String s ){
        if(s.length()<=6)
            System.out.println("Airlines Code : "+s);
        else
            System.out.println("Sorry for the wrong code .");
        
        
        
    }

    @Override
    public String toString() {
        return  "(Airport Code = " + airportCode + " , Airport Name = " + airportName + ")";
    }
    
    
    
}
