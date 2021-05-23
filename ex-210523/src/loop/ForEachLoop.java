package loop;

public class ForEachLoop {

	public static void main(String[] args) {
		String[] arr = { "A", "B", "C", "D" };

		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		
//		for (String str : arr) {
//			str = "Z";
//			System.out.println(str);
//		}
		System.out.println();
		int index = 0;
		
		for (String string : arr) {
			if (index++ > 2) break;
			System.out.println(string);
		}
	}
	
}
