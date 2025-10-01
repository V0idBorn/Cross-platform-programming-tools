package Lab_5;
import java.io.*;


public class Solution {

    public static void WriteTxt(double x) {
        double y = (Math.sin(x)) / (Math.tan(4 * x));

        try (PrintWriter writer = new PrintWriter(new FileWriter("Lab_5/Result.txt", true))) {
            writer.println("Result of y=sin(x)/tg(4x) with x = " + x + " = " + y);
            System.out.println("Your result was written to file Result.txt");
        } catch (IOException exeException) {
            System.err.println("Logs written attempt occur error: " + exeException.getMessage());
        }
    }

    public static void WriteBin(double x) {
        double y = Math.sin(x) / Math.tan(4 * x);

        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("Lab_5/Result.bin", true))) {

            dos.writeDouble(y);

            System.out.println("Result was written to file (binary).");
        } catch (IOException e) {
            System.err.println("Error writing to binary file: " + e.getMessage());
        }
    }

    public static void ReadTxt() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Lab_5/Result.txt"))) {
            String line;
            System.out.println("Contents of Result.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from text file: " + e.getMessage());
        }
    }

    public static void ReadBin() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("Lab_5/Result.bin"))) {
            System.out.println("Contents of Result.bin:");
            while (dis.available() > 0) {
                double y = dis.readDouble();
                System.out.println( "y = " + y);
            }
        } catch (IOException e) {
            System.err.println("Error reading from binary file: " + e.getMessage());
        }
    }
}
