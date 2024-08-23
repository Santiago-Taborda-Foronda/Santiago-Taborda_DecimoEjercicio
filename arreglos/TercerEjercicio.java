package arreglos;

public class TercerEjercicio {
	
	    public static void main(String[] args) {
	       
	        int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {5, 4, 3, 2, 1};	        
	       
	        if (array1.length != array2.length) {
	            System.out.println("Los arreglos deben tener la misma longitud.");
	            return;
	        }	        
	       
	        sumInPlace(array1, array2);	        
	       
	        System.out.println("El primer arreglo después de la suma es:");
	        printArray(array1);
	    }	    
	   
	    public static void sumInPlace(int[] arr1, int[] arr2) {
	        int length = arr1.length;
	        	        
	        for (int i = 0; i < length; i++) {
	            arr1[i] += arr2[i];
	        }
	    }
	    	   
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	

	
}
