package exam;

interface Action {
	void work();
}

public class ActionExample {
	public static void main(String[] args) {
		
		Action action = new Action() {
			
			@Override
			public void work() {
				System.out.println("곱등이는 곱등곱등");
			}
		};
		
		action.work();
	}
}
