//package JavaPlacement;
//import java.util.Scanner;
//public class Amstrong {
//public static void main(String[]args)
//{
//	int r=0;
//	Scanner src = new Scanner(System.in);
//	int n = src.nextInt();
//	int temp = n;
//	while(n!=0)
//	{
//		int N = n%10;
//		r+= Math.pow(N, 3);
//		n= n/10;
//	}
//	if(temp == r)
//	System.out.println("Given " +temp+ " is amstrong");
//	else
//	{
//		System.out.println("Given"+temp+"is not a amstrong");
//	}
//   }
//}
package JavaPlacement;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int n = String.valueOf(number).length(); 
        while (number > 0) {
            int digit = number % 10;
            sum +=(int) Math.pow(digit, n);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
