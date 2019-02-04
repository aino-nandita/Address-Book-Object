package backendmanager;

import backend.AddDatabaseBackend;
import backend.AddFileBackend;
import backend.SwitchToDatabaseBackend;
import menu.GoBack;
import menu.Menu;

public class AddBackendMenu extends Menu {
	
	public AddBackendMenu(int id, String name, BackendManagerMenu menu) {
		super(1, "Add Backend Menu");
		
		AddDatabaseBackend database=new AddDatabaseBackend(1, "Database Backend",menu);
		AddFileBackend file=new AddFileBackend(2, "File System Backend", menu);
		GoBack back=new GoBack(3, "Go Back");
		Exit exit=new Exit(4,"Exit");
		
		this.addMenuItem(database);
		this.addMenuItem(file);
		this.addMenuItem(back);
		this.addMenuItem(exit);
	}

	@Override
	public void doSelected() {
		System.out.println("\n");
		super.doSelected();
	}
}
