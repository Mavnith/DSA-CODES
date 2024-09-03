package JavaPlacement;

import java.util.Scanner;

public class Prime {
public static void main(String[]argd)
{
	int num;
	Scanner src = new Scanner(System.in);
	num = src.nextInt();
	if(num%num==1) {
		System.out.println("Given num is Prime");
	}
	else {
		System.out.println("Given num not a Prime");
	}
}
}
