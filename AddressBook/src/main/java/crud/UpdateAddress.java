package crud;

import java.util.Scanner;

import backendmanager.BackendManagerMenu;
import menuItem.MenuItem;

public class UpdateAddress extends MenuItem {
	BackendManagerMenu bm;
	private Scanner scanner;
	
	public UpdateAddress(int id, String name, BackendManagerMenu menu) {
		super(id, name);
		scanner=new Scanner(System.in);
		this.bm=menu;
	}

	@Override
	public void doSelected() {
		System.out.println("Enter the name to update the Address: ");
		String name=scanner.next();
		bm.getBackendhelper().updateAddressbook(name);
	}

}
