import java.util.ArrayList;
import java.util.List;

public class Search extends Thread {
	
	private int returnVal = -1;

	//Make sure its arrayList
	public Search(ArrayList<Integer> array, int ID) {
		
		//int partitionSize = 10;
		List<List<Integer>> partitions = new ArrayList<List<Integer>>();
		
//		for (int i = 0; i < array.size(); i += partitionSize) {
//		    partitions.add(array.subList(i, Math.min(i + partitionSize, array.size())));
//		}
		
		int size = array.size();
		
		SearchThread thread1 = new SearchThread(array.subList(0, size/2), ID);
		SearchThread thread2 = new SearchThread(array.subList(size/2, size), ID);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}
		catch (InterruptedException e) {
			System.out.println("Search thread interrupted!");
		}

		//Jika tidak ketemu
		if (thread1.getFoundItem() == -1 && thread2.getFoundItem() == -1) {
			returnVal = -1;
		}
		else {
			returnVal = (thread1.getFoundItem() != -1) ? thread1.getFoundItem() : thread2.getFoundItem(); 
		}
		
	}
	
	public int getReturnVal() {
		return returnVal;
	}

	public void setReturnVal(int returnVal) {
		this.returnVal = returnVal;
	}
	
	
	
		


}
