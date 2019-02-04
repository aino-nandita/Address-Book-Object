package backendmanager;

import backend.AddFileBackend;
import backend.SwitchToDatabaseBackend;
import menu.GoBack;
import menu.Menu;

public class ListBackendMenu extends Menu {
	BackendManagerMenu bm;
	
	public ListBackendMenu(int id, String name, BackendManagerMenu menu) {
		super(id, name);
		
		SwitchToDatabaseBackend database=new SwitchToDatabaseBackend(1, "Database Menu",menu);
		AddFileBackend file=new AddFileBackend(2, "File System Menu", menu);
		GoBack back=new GoBack(3, "Go Back");
		Exit exit=new Exit(4,"Exit");
		
		this.bm=menu;
		
		this.addMenuItem(database);
		this.addMenuItem(file);
		this.addMenuItem(back);
		this.addMenuItem(exit);
	}
	
	public void doSelected() {
		bm.display();
	}
}
