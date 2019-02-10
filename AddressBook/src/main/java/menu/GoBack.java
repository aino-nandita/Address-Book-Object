package menu;

import backendmanager.BackendManagerMenu;
import menuItem.MenuItem;

public class GoBack extends MenuItem {

	BackendManagerMenu bmanager;
	public GoBack(int id, String name, BackendManagerMenu bmanager) {
		super(id, name);
		this.bmanager=bmanager;
	}

	@Override
	public void doSelected() {
		bmanager.doSelected();
	}
}
