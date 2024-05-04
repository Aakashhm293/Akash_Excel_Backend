package programs;

public class OccurencesArray {
	
	public static void occurenceArray() {
		int[] array1= {7,8,9,6,5,4,5,6,8};
		int array2[]=new int[array1.length];
		for(int i=0;i<array1.length;i++) {
			array2[i]=1;
			for(int j=i+1;j<array1.length;j++) {
				if(array1[i]==array1[j]) {
					array1[j]=-1;
					array2[i]++;
			
				}			
			}		
		}	
		
		for(int i=0;i<array1.length;i++) {
			if(array1[i]!=-1) {
			System.out.println(array1[i]+ " occured " + array2[i] + " Time(s)");
		}
		}
	}
	
	public static void main(String[] args) {
		occurenceArray();
	}
}
