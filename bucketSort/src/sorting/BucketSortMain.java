package sorting;
import java.util.Random;

public class BucketSortMain {
	public static void main(String[] args) {
		
		int arr[] = new int[100];
		
		//Generating 100 random numbers in the range of 0-100
		//Random random = new Random();
		for(int i = 0; i < 100; i++) {
			//arr[i] = random.nextInt(100) + 100;
			arr[i] = (int)(Math.random() * 900 + 1) + 100;
		} 
		//Passing this array to BucketSort method
		BucketSort buckets = new BucketSort(arr);
		System.out.println("Array before Sorting: ");
		buckets.printArray();
		
		//Sort the array
		buckets.bucketSort();
		
		System.out.println("\n\nArray after Sorting: ");
		buckets.printArray();		
	}
}
