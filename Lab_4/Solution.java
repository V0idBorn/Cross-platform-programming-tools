package Lab_4;

import java.lang.Math;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Solution {

    public void Function(double x) {

        double y = (Math.sin(x))/(Math.tan(4*x));

        try (PrintWriter writer = new PrintWriter(new FileWriter("Lab_4/Result.txt", true))) { 
            writer.println("Result of y=sin(x)/tg(4x) with x = " + x + "= " + y );
            System.out.println("Your result was written to file Result.txt");
        } catch (IOException exeException) {
            System.err.println("Logs written attempt occur error:" + exeException.getMessage());
        }
    }
    
    
}
