package studentApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int tutionBalance = 0;
	private int priceOfCourse = 400;
	private String studentId;
	private static int id = 500;
	private String courses = "";
	private String email;
	private String domain = "@cybertek.com";
	private ArrayList<String> listOfCourses = new ArrayList<>(); 
	
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student firstname: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student lastname: ");
		this.lastName = in.nextLine();
		
		System.out.print("1: Freshman, 2: Junior, 3: Senior: ");
		this.gradeYear = in.nextInt();
		
		id++;
		
		setId();
			
	}
	
	public String setId() {
		
		return gradeYear + "" + id;
	}
	
	public void enroll() {
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter courses to enroll: ");
			String course = scan.next();
			
			if(!course.equals("q")) {
				this.listOfCourses.add(course);
				tutionBalance = tutionBalance + priceOfCourse;
			}
			else {
				break;
			}
				
		}while(1 != 0);
		
		System.out.println("Enrolled in: ");
		System.out.println(listOfCourses);
		System.out.println("Tution Balance: " + tutionBalance);
	}
	
	public void viewBalance() {
		System.out.println("Current balance: " + tutionBalance);
	}
	
	public void payTution() {
		
		System.out.println("--------------------------------------------");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter amount of payment: ");
		int payment = input.nextInt();
		tutionBalance = tutionBalance - payment;
		
		System.out.println("Thanks for your payment of $" + payment);
		viewBalance();
		System.out.println("Confirmation sent to " + email());
	
	}
	
	public void showInfo() {
		System.out.println("Student name: " + firstName + " " + lastName);
		System.out.println("Grade year: " + gradeYear);
		System.out.println("Student ID: " + setId());
		viewBalance();
			
	}
	
	public String email() {
		this.email = firstName + "." +lastName + domain;
		return email;
	}
	
}
