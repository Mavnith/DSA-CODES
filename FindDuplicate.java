package JavaPlacement;
import java.util.Scanner;
public class Duplicates {
	
		
			    public static void Array(int arr[], int n) {
			        for (int i = 0; i < n; i++) {
			        	for(int j=i+1;j<n;j++)
			        	{
			        		if(arr[i]== arr[j])
			        			System.out.println("\n The duplicate numbers in the ARRAY ARE:\n"+arr[i]);
			        }
			        }
			    }

			    public static void main(String[] args) {
			        Scanner src = new Scanner(System.in);
			        System.out.println("Enter the size of array:");
			        int n = src.nextInt();
			        int[] arr = new int[n];

			        System.out.println("Enter the array elements:\n");
			        for (int i = 0; i < n; i++) {
			            arr[i] = src.nextInt(); 
			        }
			        Array(arr,n);

			        src.close(); 
			    }
		

	}
