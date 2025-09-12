package Lab_3;

import Lab_3.interfaces.SeaInterface;

public class sea extends water implements SeaInterface{
    private double salinity;    
    private int numberOfIslands;    
    private String climateZone;     
    private boolean hasTides;       
    private String adjoiningOceans; 
    private String largestPort;

    public sea(){
        super();

        this.salinity = 0.0;
        this.numberOfIslands = 0;
        this.climateZone = "unknown";
        this.hasTides = false;
        this.adjoiningOceans = "unknown";
        this.largestPort = "unknown";

    }

    public void paintSmth(){
        System.out.println("This is realisation of interface 'Art' by class sea");
    }

    public void SeaInterfaceWork(){
         System.out.println("This is realisation of interface 'SeaInterface' by class sea");
    }

    @Override
    void abstractMethod() {

        System.out.println("\nlalala, i am abstract method");

    }

    public sea(double userSalinity , int userNumberOfIslands , String userClimateZone , boolean userHasTides , String userAdjoiningOceans , String userLargestPort ,
                String userName , String userType , double userArea , double userDepth , String userLocation , double userWaterVolume, boolean userIsFresh, String userOrigin){
        super(userName , userType , userArea , userDepth , userLocation , userWaterVolume, userIsFresh, userOrigin);

        this.salinity = userSalinity;
        this.numberOfIslands = userNumberOfIslands;
        this.climateZone = userClimateZone;
        this.hasTides = userHasTides;
        this.adjoiningOceans = userAdjoiningOceans;
        this.largestPort = userLargestPort;

    }

    public void showAllAttributes(){
        super.showAllAttributes();

        System.out.println("Salinity: " + salinity);
        System.out.println("Number of islands: " + numberOfIslands);
        System.out.println("Climate zone: " + climateZone);
        System.out.println("Has tides: " + hasTides);
        System.out.println("Adjoining oceans: " + adjoiningOceans);
        System.out.println("Largest port: " + largestPort);

    }

    
}
