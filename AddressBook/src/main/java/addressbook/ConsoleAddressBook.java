package addressbook;

import backendmanager.BackendManagerMenu;

public class ConsoleAddressBook {

	public static void main(String[] args) {
		System.out.println("*********** Address-Book-Menu ************\n");
		BackendManagerMenu manageBM=new BackendManagerMenu();
		manageBM.doSelected();
	}
}
