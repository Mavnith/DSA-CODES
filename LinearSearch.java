package JavaPlacement;
import java.util.Scanner;

public class LinearSearch {
	void disp(int [ ]arr,int n,int target)
	{
		int i;
		for(i=0;i<n;i++)
		{
			if(arr[i] ==target) {
				System.out.println("Array element found: "+arr[i]);
			}
			else {
				System.out.println("Array element not found");
				
			}
		}
	}
	public static void maion(String[]args)
	{
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the size:\n");
		int n = src.nextInt();
		
		int []arr = new int [n];
	System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = src.nextInt();
		}
      int target;
      Scanner src2 = new Scanner(System.in);
		System.out.println("Enter the target\n");
      target = src2.nextInt();
      
	    LinearSearch arrayInstance = new LinearSearch();
        arrayInstance.disp(arr, n,target); 
        src.close();
	}

}
