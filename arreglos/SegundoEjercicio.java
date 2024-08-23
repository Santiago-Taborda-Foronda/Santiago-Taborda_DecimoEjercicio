package arreglos;

public class SegundoEjercicio {
	
	    public static void main(String[] args) {
	      
	        int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {5, 4, 3, 2, 1};      
	        
	        if (array1.length != array2.length) {
	            System.out.println("Los arreglos deben tener la misma longitud.");
	            return;
	        }
	        	       
	        int[] sumArray = sumArrays(array1, array2);	        
	       
	        System.out.println("El arreglo resultante de la suma es:");
	        printArray(sumArray);
	    }
	    	   
	    public static int[] sumArrays(int[] arr1, int[] arr2) {
	        int length = arr1.length;
	        int[] result = new int[length];
	        	  
	        for (int i = 0; i < length; i++) {
	            result[i] = arr1[i] + arr2[i];
	        }
	        
	        return result;
	    }
	   
	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}



