package Tasks;

import java.util.Scanner;

public class lab7 {
		
		String fname;
		String lname;
		char gender;
		long phno;
		
		lab7(String fname,String lname,char gender,long phno){
			this.fname=fname;
			this.lname=lname;
			this.gender=gender;
			this.phno=phno;
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
		
		public void setlName(String lname) {
			this.lname=lname;
		}

		public char getgender() {
			return gender;
		}
		
		public void setgender(char gender) {
			this.gender=gender;
		}
		
		public long getphone() {
			return phno;
		}
		
		public void setphone(long phno) {
			this.phno=phno;
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			lab7 l1 = new lab7("Rohit","Kumar M",'M',999999999);
			
			System.out.println("Fisrt Name : "+l1.getfName());
			System.out.println("Last Name : "+l1.getlName());
			System.out.println("Gender : "+l1.getgender());
			System.out.println("Phone Number : "+l1.getphone());
			

		}

	}

