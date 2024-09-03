package JavaPlacement;

import java.util.Scanner;
public class Fibo {
	public static void main(String[]args)
	{
		int n,n1=0,n2=1,n3,i;
		System.out.println("Enter the fibo num");
		System.out.println(n1);
		System.out.println(n2);
		Scanner src = new Scanner(System.in);
		n=src.nextInt();
	 for(i=0;i<n;i++){
		 n3 = n1+n2;
		 n1=n2;n2=n3;
		 System.out.println(n3);
	 }
		
	}

}
