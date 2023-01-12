package StudentGrades;

public class Student {
	
	private int Grade;
	private String Name;
	
	Student(int grade, String name){
		this.Grade = grade;
		this.Name = name;
		
	}
	
	String getName() {
		
		return this.Name;
	}
	
	int getGrade() {
		
		return this.Grade;
	}
	
	String printStudent() {
		
		return "Name: " + this.Name + ", Grade: " + this.Grade; 
	}
	
	
	
	

}
