package example;

public class Ex5_5 {

	public static void main(String[] args) {
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;
			
			// logic
			// 0 ~ 8 arr[0~8] -> arr[i];
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		// Copy
//		System.arraycopy(ballArr, 0, ball3, 0, 3);
		ball3 = ballArr.clone();
		
		for (int i = 0; i < 3; i++) {
			System.out.print(ball3[i]);
		}
		
		
	}
	
}
