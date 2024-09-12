package JavaPlacement;
import java.util.Scanner;

public class Binary2 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int sum = 0;
        int a = src.nextInt();  
        int p = 1;

        while (a > 0) {
            int d = a % 10;  
            sum = sum + (d * p);
            p = p * 2;  
            a = a / 10; 
        }

        System.out.println("Decimal equivalent: " + sum);
    }
}

