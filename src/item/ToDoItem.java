package item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import com.to_do_item.to_do_item_hib.Item;

public class ToDoItem {

	static Scanner input;
	static Item item = new Item();
	static Database db;

//	static Session session = null;
//	static Transaction tx = null;

	public static void main(String[] args) {

		db = new Database();

// Hibernate code===========================================================================================================================================	

//		Configuration con = new Configuration().configure().addAnnotatedClass(Item.class);
//		
//		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//		SessionFactory sf = con.buildSessionFactory(reg);
//		
//		session = sf.openSession();
//		tx = session.beginTransaction();
//		
//Main functionality========================================================================================================================================

		input = new Scanner(System.in);
		boolean run = true;
		String menu;

		while (run) {

			System.out.println("1. List items");
			System.out.println("2. Add item");
			System.out.println("3. Delete item");
			System.out.println("4. Exit");

			menu = input.nextLine();

			switch (menu) {

			case "1":
				listItems();
				break;

			case "2":
				addItem();
				break;

			case "3":
				deleteItem();
				break;

			case "4":
				run = false;
				break;
			}

		}
		input.close();
	}

// Case functions ========================================================================================================================================

	// List data
	public static ArrayList<Item> listItems() {
		int i = 0;
		ArrayList<Item> items = null;
//		Collections.sort(item.items);
//		for (i = 0; i < item.items.size(); i++) {
//			System.out.println(item.items.get(i));
//		}

		db.listData();
		return item.getItems();
		
		// Hibernate code

//		session.save(items);
//		tx.commit();
//		item = (Item) session.get(Item.class, 1);
//		System.out.println(item);
	}
	
	//Add Data
	public static String addItem() {

		System.out.print("Enter new item: ");
		String userItem = input.nextLine();
		Item newItem = new Item(userItem);
		item.items.add(newItem);
		//Hibernate code
//		session.save(newItem);
//		tx.commit(); 

		db.addData(userItem);

		return userItem;
		


	}

	//Delete Data
	public static void deleteItem() {

		System.out.println("Enter the item's ID ");
		int itemID = input.nextInt();
		String sql = "DELETE FROM item Where id = '" + itemID + "' ";
		for (int i = 0; i < item.items.size(); i++) {
			if (item.items.get(i).itemID == itemID) {
				System.out.println(item.items.get(i) + " has been removed");
				item.items.remove(i);

			}
		}
	}
}
