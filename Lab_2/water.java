package Lab_2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class water {
    private String name;        
    private String type;        
    private double area;        
    private double depth;      
    private String location;    
    private double waterVolume; 
    private boolean isFresh;    
    private String origin;  

    public water(){
        this.name = "Your custom water";
        this.type = "unknown";
        this.area = 0.0;
        this.depth = 0;
        this.location = "unknown";
        this.waterVolume = 0.0;
        this.isFresh = false;
        this.origin = "unknown";
    }


    public water(String userName , String userType , double userArea , double userDepth , String userLocation , double userWaterVolume, boolean userIsFresh, String userOrigin){
        this.name = userName;
        this.type = userType;
        this.area = userArea;
        this.depth = userDepth;
        this.location = userLocation;
        this.waterVolume = userWaterVolume;
        this.isFresh = userIsFresh;
        this.origin = userOrigin;
    }

    public water(String userName){
        this.name = userName;
        this.type = "unknown";
        this.area = 0.0;
        this.depth = 0;
        this.location = "unknown";
        this.waterVolume = 0.0;
        this.isFresh = false;
        this.origin = "unknown";
    }

    private void logAction(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("Lab_2/activity.log", true))) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            
            writer.println(dtf.format(now) + " - " + message);
        } catch (IOException e) {
            System.err.println("Logs written attempt occur error:" + e.getMessage());
        }
    }

    public void showAllAttributes() {
        logAction("Method showAllAttributes() called for: " + name);
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Area: " + area);
        System.out.println("Depth: " + depth);
        System.out.println("Location: " + location);
        System.out.println("Water Volume: " + waterVolume);
        System.out.println("Is Fresh: " + isFresh);
        System.out.println("Origin: " + origin);
        System.out.println("\n");
    }

    public void calculateWaterVolume() {
    logAction("Method calculateWaterVolume() called for: " + name);
    this.waterVolume = this.area * this.depth;
    }
    

    public void volumeDifferenceCheck(water otherWater) {
        logAction("volumeDifferenceCheck(water otherWater) called for: ");
        if (this.waterVolume > otherWater.waterVolume) {
             System.out.println(this.name + " water volume larger then " + otherWater.name);
        }
        if (this.waterVolume < otherWater.waterVolume) {
             System.out.println(this.name + " water volume smaler then " + otherWater.name);
        }
        if (this.waterVolume == otherWater.waterVolume) {
             System.out.println(this.name + " water volume equal to " + otherWater.name);
        }
    }


    public void clearLogFile() {
        try {
            FileWriter writer = new FileWriter("Lab_2/activity.log", false); 
            writer.close();
            System.out.println("Log file 'activity.log' has been cleared.");
        } catch (IOException e) {
            System.err.println("Logs cleaning ocure an error" + e.getMessage());
        }
}
    
    

}
