package backend;

import java.util.Scanner;

import backendmanager.BackendManagerMenu;
import menuItem.MenuItem;

public class AddDatabaseBackend extends MenuItem {
	
	BackendManagerMenu bm;
	private Scanner scanner;

	public AddDatabaseBackend(int id, String name, BackendManagerMenu menu) {
		super(id, name);
		
		this.bm=menu;
	}
	
	@Override
	public void doSelected() {
		create();
		bm.save();
		bm.display();
	}
	
	public void create() {
		DatabaseBackend databasebackend=new DatabaseBackend();
		System.out.println("Enter Url: ");
		scanner = new Scanner(System.in);
		databasebackend.setUrl(scanner.next());
		
		System.out.println("Enter User name: ");
		scanner = new Scanner(System.in);
		databasebackend.setUsername(scanner.next());
		
		System.out.println("Enter Password: ");
		scanner = new Scanner(System.in);
		databasebackend.setPassword(scanner.next());
		
		bm.addBackendDetails(databasebackend);
	}
}
