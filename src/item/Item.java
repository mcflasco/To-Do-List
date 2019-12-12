package item;

import java.util.ArrayList;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//import com.to_do_item.to_do_item_hib.Item;

/**
 * 
 * @author mcfla
 *
 */

//@Entity
public class Item {

	public ArrayList<Item> items = new ArrayList<Item>();
	public static Integer nextID = 1;

	public Integer itemID;

	public String item;
	
	
	
	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public Item() {

		items.add(new Item("Grocery shopping"));
		items.add(new Item("Take dog to the vet"));
		items.add(new Item("Clean house"));

	}

	public Item(String item) {
		this.itemID = nextID++;
		this.item = item;

	}

	@Override
	public String toString() {
		int num = 1;
		num++;
		return " Item " + num  + " " +  item;
	}

//	public int compareTo(Item secondItem) {
//		// TODO Auto-generated method stub
//		return nextID.compareTo(secondItem.itemID);
//	}

}
