package programs;

public class PrimeNumber {
	public static void primeArray() {
		int[] array = {4,6,5,2,3,55,66,8,9,1,5};
		System.out.println("Prime Numbers are Present inside the Array ");
		for(int i=0; i<array.length; i++){
	        boolean isPrime = true;
	        for (int j=2; j<array[i]; j++){        
	            if(array[i]%j==0){
	                isPrime = false;
	                break;
	            }
	        } 
	        if(isPrime) {
	            System.out.println(array[i]);
	        	}
	        }
	}
	
	public static void main(String[] args) {
		primeArray();
	}
}
