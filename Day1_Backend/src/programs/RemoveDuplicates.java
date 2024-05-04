package programs;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int [] array1= {1,2,8,3,6,5,4,1,2,5,8};for(
				int i = 0;i<array1.length;i++)
				{
					for (int j = i + 1; j < array1.length; j++) {
						if (array1[i] == array1[j]) {
							array1[j] = -1;

						}
					}

				}

				int result[] = new int[array1.length];
				int k = 0;for(
				int i = 0;i<array1.length;i++)
				{
					if (array1[i] != -1) {
						result[k++] = array1[i];
					}
				}
				int count = 0;for(
				int i = 0;i<result.length;i++)
				{
					if (result[i] != 0)
						count++;
				}System.out.println("Remove Duplicate Array : ");for(
				int i = 0;i<count;i++)
				{
					System.out.println(result[i]);
				}
	}
}
