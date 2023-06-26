package coreJava10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ChatBot {
	public static void chatbot() {
		List<BankAccount> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		String ans="";
		String name;
		String password;
		BankAccount account=null;
		String userName;
		Manager manager=null;
		User user=null;
		String address="";
		double balance=0;
		boolean flag=false;
		int accountNo=0;
		do {
			flag=false;
			System.out.println("1.Manager Menu");
			System.out.println("2.User Menu");
			System.out.println("Enter choice");
			try {
			choice=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Enter numbers");
				flag=true;
			}
			
			switch(choice) {
			case 1: 
				System.out.println("Enter username and password");
				userName=sc.next();
				System.out.println("Enter password");
				password=sc.next();
				manager=new Manager("abc", "123");
				if(manager.isValid(userName, password)) {
					System.out.println("Login successfully");
				}else {
					System.out.println("Invalid creadentials");
				}
				do {
					System.out.println("1.Add Account");
					System.out.println("2.List Accout information");
					System.out.println("Enter choice");
					try {
						choice=sc.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("Enter numbers");
						flag=true;
					}
					
					switch(choice) {
					case 1:
						System.out.println("Enter username");
						userName=sc.next();
						System.out.println("Enter password");
						password=sc.next();
						System.out.println("Enter Address");
						address=sc.next();
						System.out.println("Enter Balance");
						balance=sc.nextDouble();
						user=new User(userName, password, address);
						account=new BankAccount(user,balance);
						list.add(account);
						System.out.println("Account is created");
						accountNo=account.accountNo;
						System.out.println("Your accout number is "+ accountNo);
						break;
					case 2:
						System.out.println("Enter the userName for which you want info");
						userName=sc.next();
						for(int i=0;i<list.size();i++) {
							if(list.get(i).user.getUserName().equals(userName)) {
								accountNo=list.get(i).getAccountNo();
								break;
							}
						}
						user.getInfo(list, userName, accountNo);
						break;
					}
					System.out.println("Do you want to continue with manager menu?");
					ans=sc.next();
					}while(ans.equals("Y")||ans.equals("y"));
				break;
			case 2:
				System.out.println("Enter Username and password");
				userName=sc.next();
				password=sc.next();
				do {
					System.out.println("1. View Balance");
					System.out.println("2.User details");
					System.out.println("Enter choice");
					try {
						choice=sc.nextInt();
					}catch(InputMismatchException e) {
						System.out.println("Enter numbers");
						flag=true;
					}
					switch(choice) {
					case 1:
						for(int i=0;i<list.size();i++) {
							if(list.get(i).user.getUserName().equals(userName)) {
								System.out.println("Your Balance is :"+ list.get(i).getBalance());
								break;
							}else {
								System.out.println("Entered invalid username");
							}
						}
						break;
					case 2:
						user.getInfo(list, userName,accountNo);
						break;
//					case 3:
//						for(int i=0;i<list.size();i++) {
//							String uName=list.get(i).user.userName;
//							int accNo=list.get(i).accountNo;
//							user.getInfo(list, uName,accNo);
//						}
					
					}
					System.out.println("Do you want to continue with user menu?");
					ans=sc.next();
					
				}while(ans.equals("Y")||ans.equals("y"));
				break;
				
			}
		if(flag) {
			sc.next();
		}
		System.out.println("Do you want to continue ?");
		ans=sc.next();
		
		}while((ans.equals("y")||ans.equals("Y")));
		
	}
}
