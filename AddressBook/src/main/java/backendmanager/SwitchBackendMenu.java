package backendmanager;

import backend.SwitchToDatabaseBackend;
import backend.SwitchToFileBackend;
import menu.GoBack;
import menu.Menu;

public class SwitchBackendMenu extends Menu {
	
	public SwitchBackendMenu(int id, String name, BackendManagerMenu menu) {
		super(id, name);
		
		SwitchToDatabaseBackend database=new SwitchToDatabaseBackend(1, "Switch to Database Backend",menu);
		SwitchToFileBackend file=new SwitchToFileBackend(2, "Switch to File Backend ", menu);
		GoBack back=new GoBack(3, "Go Back");
		Exit exit=new Exit(4,"Exit");
		
		this.addMenuItem(database);
		this.addMenuItem(file);
		this.addMenuItem(back);
		this.addMenuItem(exit);
	}

	public void doSelected() {
		System.out.println("\n");
		super.doSelected();
	}
}
