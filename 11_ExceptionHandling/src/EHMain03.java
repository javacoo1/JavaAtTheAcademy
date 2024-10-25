
public class EHMain03 {
	public static void main(String[] args) {
		try {
			test();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void test() throws InterruptedException {
		System.out.println("asd");
			Thread.sleep(1000);
	}
	
}
