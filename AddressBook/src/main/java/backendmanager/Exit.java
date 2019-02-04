package backendmanager;

import menuItem.MenuItem;

public class Exit extends MenuItem {
	
	MenuItem m;
	
	public Exit(int id, String name) {
		super(id, name);
	}

	@Override
	public void doSelected() {
		System.exit(0);
	}
}
