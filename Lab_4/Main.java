package Lab_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter x for y=sin(x)/tg(4x) function: ");

        double x = scanner.nextDouble();

        Solution solution = new Solution();

        solution.Function(x);

        scanner.close();


    }
}
