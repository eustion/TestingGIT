import java.util.ArrayList;

public class Main {
	
	ArrayList<Integer> numbers = new ArrayList<>();
	
	public Main() {
		for (int i = 0; i < 2000; ++i) {
			numbers.add(i);
		}
		
		Search searchObj = new Search(numbers, -2); 
		int itemFound = searchObj.getReturnVal();
		System.out.println(itemFound);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}