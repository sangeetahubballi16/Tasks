package Tasks;

import java.util.Scanner;

public class lab5 {
	
	String fname;
	String lname;
	char gender;
	
	lab5(String fname,String lname,char gender){
		this.fname=fname;
		this.lname=lname;
		this.gender=gender;
	}
	
	public String getfName() {
		return fname;
	}
	
	public void setfName(String fname) {
		this.fname=fname;
	}
	
	public String getlName() {
		return lname;
	}
	
	public void setlName(String fname) {
		this.lname=lname;
	}

	public char getgender() {
		return gender;
	}
	
	public void setgender(char gender) {
		this.gender=gender;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		lab5 l1 = new lab5("Rohit","Kumar M",'M');
		
		System.out.println("Fisrt Name : "+l1.getfName());
		System.out.println("Last Name : "+l1.getlName());
		System.out.println("Gender : "+l1.getgender());
		
		

	}

}
