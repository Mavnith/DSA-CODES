package JavaPlacement;

public class Reverse {

		    public static void reverseArray(int[] array) {
		        int n = array.length;
		        for (int i = 0; i < n / 2; i++) {
		            int temp = array[i];
		            array[i] = array[n - i - 1];
		            array[n - i - 1] = temp;
		        }
		    }

		    public static void main(String[] args) {
		        int[] array = {1, 1, 2, 3};
		        
		        System.out.println("Original array:");
		        for (int num : array) {
		            System.out.print(num + " ");
		        }
		        System.out.println();

		        reverseArray(array);

		        System.out.println("Reversed array:");
		        for (int num : array) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    

	}
}
