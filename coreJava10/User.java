package coreJava10;
import java.util.*;

public class User {
	
	String userName;
	String password;
	String address;
	public User(String userName,String password,String address) {
		
		this.userName=userName;
		this.password=password;
		this.address=address;
		
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void getInfo(List<BankAccount> list,String uname, int accountNo) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).user.getUserName().equals(uname)) {
				System.out.println("User name is : "+list.get(i).user.getUserName());
				System.out.println("Address is : "+list.get(i).user.getAddress());
				System.out.println("Account Number : "+accountNo );
			}
		}
	}

}
