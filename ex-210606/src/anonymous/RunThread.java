package anonymous;

public class RunThread {

	public static void main(String[] args) {
		ThreadClass threadClass = new ThreadClass();
		
		threadClass.run();
		
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread run!!");
			}
		};
			
		runnable.run();
		
		
		
		Runnable lambdaRunnable = () -> System.out.println("lambda thread run!!");

			
		lambdaRunnable.run();
		
		
		
	}
	
}
