package coreJava10;
import java.util.*;

public class BankAccount {
	User user;
	double balance;
	int accountNo;
	static int accNo=0;
	List<BankAccount> list;
	public BankAccount(User user, double bal) {
		list=new ArrayList<>();
		this.user=user;
		this.balance=bal;
		this.accountNo=++accNo;
		
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public boolean ifVerify(String uname, String pass) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).user.getUserName().equals("uname") && 
					list.get(i).user.getPassword().equals("pass")) {
				return true;
			}
		}
		return false;
	}
	
	
	

}
