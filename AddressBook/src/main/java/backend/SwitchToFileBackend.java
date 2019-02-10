package backend;

import java.util.ArrayList;
import java.util.Scanner;

import backendmanager.BackendManagerMenu;
import backendmanager.Exit;
import crud.CreateAddress;
import crud.DeleteAddress;
import crud.ReadAddress;
import crud.UpdateAddress;
import helper.FileAddressBookHelper;
import menu.GoBack;
import menu.Menu;

public class SwitchToFileBackend extends Menu {
	BackendManagerMenu bm;
	private Scanner scanner;
	ArrayList<Backend> list;
	
	public SwitchToFileBackend(int id, String name, BackendManagerMenu menu) {
		super(id, name);
		
		System.out.println();
		CreateAddress create=new CreateAddress(1, "Create Address", menu);
		ReadAddress read=new ReadAddress(2, "Read Address", menu);
		UpdateAddress update=new UpdateAddress(3, "Update Address", menu);
		DeleteAddress delete=new DeleteAddress(4, "Delete Address", menu);
		GoBack back=new GoBack(5, "Go Back", menu);
		Exit exit=new Exit(6,"Exit");
		
		this.bm=menu;
		
		this.addMenuItem(create);
		this.addMenuItem(read);
		this.addMenuItem(update);
		this.addMenuItem(delete);
		this.addMenuItem(back);
		this.addMenuItem(exit);
	}

	@Override
	public void doSelected() {
		
		checkInstance();
		setCurrentBackend();
		bm.setBackendhelper(new FileAddressBookHelper(bm)); 
		
		System.out.println("Backend Helper: " + bm.getBackendhelper()+ "\n");
		super.doSelected();
	}
	
	public void checkInstance() {
		for(Backend b : bm.list) {
			if(b instanceof FileBackend) {
				System.out.println("\nFileBackend "+ bm.list.indexOf(b) + ". "+ b);
			} 
		}
	}
	
	public void setCurrentBackend() {
		System.out.println("\nChoose your file number: \n");
		scanner = new Scanner(System.in);
		int choice=scanner.nextInt();
		
		for(Backend currentbackend : bm.list) {
			if(choice==bm.list.indexOf(currentbackend)) {
				bm.setCurrentbackend(currentbackend);
				break;
			}
		}
		System.out.println("\nCurrentbackend is :  "+ bm.list.indexOf(bm.getCurrentbackend())+ ". "+ bm.getCurrentbackend() +"\n");
	}
}
