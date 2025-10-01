package Lab_5;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        double x;

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter your x: ");

        x = scanner.nextDouble();

        Solution.WriteTxt(x);

        Solution.WriteBin(x);

        Solution.ReadTxt();

        Solution.ReadBin();

        scanner.close();

    }
    
}
