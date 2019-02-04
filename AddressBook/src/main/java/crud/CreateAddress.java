package crud;

import backendmanager.BackendManagerMenu;
import menuItem.MenuItem;

public class CreateAddress extends MenuItem {
	BackendManagerMenu bm;
	
	public CreateAddress(int id, String name, BackendManagerMenu menu) {
		super(id, name);
		
		this.bm=menu;
	}

	@Override
	public void doSelected() {
		bm.getBackendhelper().createAddressbook();
	}

}
