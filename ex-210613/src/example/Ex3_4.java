package example;

public class Ex3_4 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		
		int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);
		
		System.out.println(numOfBucket);
	}
	
}
