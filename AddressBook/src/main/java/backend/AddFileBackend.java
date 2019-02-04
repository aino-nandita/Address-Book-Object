package backend;

import java.util.Scanner;

import backendmanager.BackendManagerMenu;
import menu.Menu;
import menuItem.MenuItem;

public class AddFileBackend extends MenuItem {
	BackendManagerMenu bm;
	private Scanner scanner;

	public AddFileBackend(int id, String name, BackendManagerMenu menu) {
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
		FileBackend filebackend=new FileBackend();
		System.out.println("Enter your path");
		scanner = new Scanner(System.in);
		filebackend.setPath(scanner.next());
		bm.addBackendDetails(filebackend);
	}
}
