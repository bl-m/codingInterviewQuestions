package schoolApp;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
	
//		Your application should do the following:
//		 Ask the user how many new students will be added to the database
//		 The user should be prompted to enter the name and year for each 
//		student
//		 The student should have a 5-digit unique ID, with the first number 
//		being their grade level
//		 A student can enroll in the following courses:
//		History 101 Mathematics 101 English 101
//		Chemistry 101 Computer Science 101
//		 Each course costs $600 to enroll
//		 The student should be able to view their balance and pay the tuition
//		 To see the status of the student, we should see their name, ID, 
//		courses enrolled, and balance
	
	private String firstName;
	private String lastName;
	private String studentId;
	private int costOfCourse = 600;
	private static int id = 500;
	private ArrayList <String> listOfCourses = new ArrayList<>();
	private int gradeYear;
	private String email;
	private int tutionBalance = 0;
	private String domain = "@cybertek.com";
	
	public School() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student firstname: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student lastname: ");
		this.lastName = in.nextLine();
		
		System.out.println("Choose 1 - Freshmen, 2 - Junior, 3 - Senior");
		this.gradeYear = in.nextInt();
		
		id++;
				
	}
	
	public String setId() {
		return gradeYear + "" +id;
	}
	
	public ArrayList <String> enroll () {
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter course to enroll: ");
			String course = scan.nextLine();
			
			if(!course.equals("q")) {
				this.listOfCourses.add(course);
				this.tutionBalance = tutionBalance + costOfCourse;
			}
			else {
				break;
			}
			
			
		} while( 1 != 0);
		
		System.out.println("Enrolled courses: ");
		System.out.println(listOfCourses);
		System.out.println("CUrrent balance: " + tutionBalance);
		
		return listOfCourses;
	}
	
	public void showInfo() {
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Grade year; " + gradeYear);
		System.out.println("Student ID: " + setId());
		System.out.println("Tution Balance: " + tutionBalance);
		System.out.println("Enrolled courses: " + listOfCourses);
	}
	
	public void payTution() {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Amount of payment: ");
		int payment = scan1.nextInt();
		
		tutionBalance = tutionBalance - payment;
		
		System.out.println("Thanks for your payment of $" + payment);
		System.out.println("Current balance: " + tutionBalance);
		System.out.println("Receipt sent to " + email());
		
	}
	
	public String email() {
		this.email = firstName+"."+lastName+domain;
		return email.toLowerCase();
	}
	
	public ArrayList<String> unEnroll() {
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the course to unenroll: ");
		String course = scan2.nextLine();
		listOfCourses.remove(course);
		
		System.out.println("You unenrolled from " + course);
		System.out.println("Enrolled courses: " + listOfCourses);
		return listOfCourses;
			
	}
}
