package crud;

import java.util.Scanner;

import backendmanager.BackendManagerMenu;
import menuItem.MenuItem;

public class ReadAddress extends MenuItem {
	BackendManagerMenu bm;
	Scanner scanner;
	public ReadAddress(int id, String name, BackendManagerMenu menu) {
		super(id, name);
		scanner=new Scanner(System.in);
		this.bm=menu;
	}

	@Override
	public void doSelected() {
		System.out.println("Enter the name to display the Address: ");
		String name=scanner.next();
		bm.getBackendhelper().readAddressbook(name);
	}

}
