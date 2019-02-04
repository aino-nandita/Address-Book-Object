package menu;

import menuItem.MenuItem;

public class GoBack extends MenuItem {

	MenuItem parent;
	public GoBack(int id, String name) {
		super(id, name);
		this.parent=parent;
	}

	@Override
	public void doSelected() {
		parent.doSelected();
	}
}
