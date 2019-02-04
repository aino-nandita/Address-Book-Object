package backendmanager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import backend.Backend;
import helper.BackendHelper;
import menu.Menu;

public class BackendManagerMenu extends Menu {
	public ArrayList<Backend> list ;
	Backend currentbackend;
	BackendHelper backendhelper;

	public BackendManagerMenu() {
		super(0, "Backend Menu Manager");
		list=new ArrayList<Backend>();
		
		AddBackendMenu addBM=new AddBackendMenu(1, "Add Backend Menu", this);
		ListBackendMenu listBM=new ListBackendMenu(2, "List of Backend Menu", this);
		SwitchBackendMenu selectBM=new SwitchBackendMenu(3, "Switch Backend Menu", this);
		Exit exit=new Exit(4,"Exit");

		addMenuItem(addBM);
		addMenuItem(listBM);
		addMenuItem(selectBM);
		addMenuItem(exit);
		load();
	}

	public ArrayList<Backend> getList() { //getter setter of ArrayList
		return list;
	}

	public void setList(ArrayList<Backend> list) {
		this.list = list;
	}
	
	public Backend getCurrentbackend() {  //getter setter of current backend
		return currentbackend;
	}

	public void setCurrentbackend(Backend currentbackend) {
		this.currentbackend = currentbackend;
	}

	public BackendHelper getBackendhelper() {  //getter setter of backend helper
		return backendhelper;
	}

	public void setBackendhelper(BackendHelper backendhelper) {
		this.backendhelper = backendhelper;
	}

	public void addBackendDetails(Backend backend) {
		list.add(backend);
		save();
	}

	public void save() { 
		try {
			FileOutputStream fos=new FileOutputStream("/home/intern2/Desktop/PathFile/Nandita.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void load() {
		try {
			FileInputStream fin=new FileInputStream("/home/intern2/Desktop/PathFile/Nandita.ser");
			ObjectInputStream ois=new ObjectInputStream(fin);
			
			list=(ArrayList<Backend>) ois.readObject();
			
			System.out.println("list has been deserialized! ");
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException is caught");
		}
	}

	public void display() {
		for(Backend b : list) {
			System.out.println(b);
		}
	}
}
