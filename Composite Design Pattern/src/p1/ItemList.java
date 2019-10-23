package p1;

import java.util.ArrayList;

public class ItemList {
	ArrayList<IItem> list;

	public ItemList() {
		list = new ArrayList<>();
	}

	public void addItem(IItem item) {
		list.add(item);
	}

	public void printAllItems() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
