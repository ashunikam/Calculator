package coreJava10;

public class Manager {
	String username;
	String password;
	public Manager(String uname, String pass) {
		this.username=uname;
		this.password=pass;
	}
	public boolean isValid(String uname, String pass) {
		return (this.username.equals(uname) && password.equals(pass));
	}
	

}
