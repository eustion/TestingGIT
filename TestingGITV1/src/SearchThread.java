import java.util.ArrayList;
import java.util.List;


public class SearchThread extends Thread {
	
	private int foundItem = -1;
	private List<Integer> array;
	private int ID;

	public SearchThread(List<Integer> array, int ID) {
		this.array = array;
		this.ID = ID;
	}

	@Override
	public void run() {
		for (Integer items : array) {
			if (items == ID) {
				foundItem = items;
			}
		}
	}

	public int getFoundItem() {
		return foundItem;
	}

	public void setFoundItem(int foundItem) {
		this.foundItem = foundItem;
	}



}
