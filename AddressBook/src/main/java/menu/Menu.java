package menu;

import java.util.ArrayList;
import java.util.Scanner;

import menuItem.MenuItem;

public class Menu extends MenuItem {
	protected ArrayList<MenuItem> menuItems=new ArrayList<MenuItem>();
	int ch=-1;
	String title;
	private Scanner scanner;
	/*public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}*/

	public Menu(int ch, String title) {
		super(ch, title);
	}

	

	public void addMenuItem(MenuItem m) {
		menuItems.add(m);
	}

	@Override
	public void doSelected() {
		while(true){
			System.out.println(getName());
			
			displayMenuItems();
			
			System.out.println("Enter your choice: ");
			selectMenuItemChoice();
			validateChoice();
		}
	}

	public void displayMenuItems() {	
		for(MenuItem m : menuItems) {
			System.out.println(m);
		}
	}

	public void selectMenuItemChoice() {
		scanner = new Scanner(System.in);
		ch=scanner.nextInt();
	}

	public void validateChoice() {
		boolean found=false;
		for(MenuItem m : menuItems) {
			if(ch==m.getId()) {
				m.doSelected();
				found=true;
				break;
			}
			
		}
		if(found==false) {
			System.out.println("Invalid choice! ");
		}
	}
}
