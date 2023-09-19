package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String companySuffix = "getcompany.com";
	private String alternateEmail;
	
	//Create COnstructor to receive the first name and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Less get the argument from main method and print
			//System.out.println("EMAIL CREATED: " + this.firstName + "" + this.lastName);
		
		//Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//call a method that return a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine element to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."
				+ companySuffix;	
			//System.out.println("Your email is: " + email);
	}
	//Ask for the department
		
		private String setDepartment() {
			System.out.print("New Worker: " + firstName + " \nDepartment Codes:\n1 for sales\n2 for Development\n3 for Accounting\n3 for none\nEnter the department code: ");
			Scanner in = new Scanner(System.in);
			int deptChoice = in.nextInt();
			if(deptChoice == 1) { return "sales"; }
			else if(deptChoice == 2) {return "dev"; }
			else if(deptChoice ==3 ) { return "acct"; }
			else {return ""; }
		}
	//Generate a random password
		
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			char[] password = new char[length]; 
			
			for(int i=0; i < length; i++) {
				int random = (int)(Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(random);
			}
			return new String(password);	
		}
	//Set the mailbox capacity
		
		public void setMailboxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
	//Set the alternate email
		
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
	
	//Change password
		
		public void changePassword(String password) {
			this.password = password;
		}
		
	//Get method to getMailBoxCapacity, password and alternateEmail
		
		public int getMailboxCapacity() {return mailboxCapacity;}
		public String getAlternateEmail() { return alternateEmail;}
		public String getPassword() {return password;}
		
	//Get methods to display the name, email, and mailbox capacity
		
		public String showInfo() {
			return "DISPLAY NAME: " + firstName + " " + lastName +
					"\nCOMPANY EMAIL: " + email +
					"\nMAILBOX CAPACIY: " + mailboxCapacity + "mb";
		}
}
