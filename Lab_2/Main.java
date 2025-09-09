package Lab_2;

public class Main {

    public static void main(String[] args) {

     water obj = new water("Dnipro");

     water driver = new water("Tyasmin", "River", 10, 30, "Ukraine", 55.3, false, "unknown");

     driver.calculateWaterVolume();

     driver.showAllAttributes();

     obj.showAllAttributes();

     driver.volumeDifferenceCheck(obj);


    }
}
