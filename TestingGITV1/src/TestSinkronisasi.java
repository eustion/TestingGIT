
public class TestSinkronisasi {
	private java.util.Random random = new java.util.Random();

	public void callMe(String data) {
		System.out.print("[");
		try {
			Thread.sleep(random.nextInt(200));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(data);
		try {
			Thread.sleep(random.nextInt(200));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}