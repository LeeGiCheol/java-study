package example;

public class Ex6_19_Main {

	public static void main(String[] args) {
		Ex6_19 tv = new Ex6_19();
		
		tv.channel = 100;
		tv.volume = 0;
		
		System.out.println("ch : " + tv.channel);
		System.out.println("vol : " + tv.volume);
		
		tv.channelDown();
		tv.volumeDown();
		
		System.out.println("ch : " + tv.channel);
		System.out.println("vol : " + tv.volume);

		tv.volume = 100;
		tv.channelUp();
		tv.volumeUp();
		
		System.out.println("ch : " + tv.channel);
		System.out.println("vol : " + tv.volume);

	}
	
}
