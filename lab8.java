package Tasks;
import java.util.Scanner;

public class lab8 {

	

	

	   
	    enum Gender {
	        M, F
	    }

	    
	    static class Person {
	        String name;
	        int age;
	        Gender gender;

	        
	        Person(String name, int age, Gender gender) {
	            this.name = name;
	            this.age = age;
	            this.gender = gender;
	        }

	      
	        void displayDetails() {
	            System.out.println("----- Person Details -----");
	            System.out.println("Name   : " + name);
	            System.out.println("Age    : " + age);
	            System.out.println("Gender : " + gender);
	        }
	    }

	   
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter Name: ");
	        String name = scanner.nextLine();

	        
	        System.out.print("Enter Age: ");
	        int age = scanner.nextInt();

	        
	        scanner.nextLine(); 

	        
	        Gender gender = null;
	        boolean validInput = false;

	        while (!validInput) {
	            System.out.print("Enter Gender (M/F): ");
	            String genderInput = scanner.nextLine().toUpperCase();

	            try {
	                gender = Gender.valueOf(genderInput);
	                validInput = true;
	            } catch (IllegalArgumentException e) {
	                System.out.println("Invalid input. Please enter only 'M' or 'F'.");
	            }
	        }

	        
	        Person p = new Person(name, age, gender);
	        p.displayDetails();

	        scanner.close();
	    }
	}
	

