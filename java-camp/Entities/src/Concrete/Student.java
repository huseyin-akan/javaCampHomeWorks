package Concrete;

import Abstract.IEntity;

public class Student extends User implements IEntity {
	
	private String[] lessonsEnrollled;
	
	public String[] getLessonsEnrollled() {
		return lessonsEnrollled;
	}

	public void setLessonsEnrollled(String[] lessonsEnrollled) {
		this.lessonsEnrollled = lessonsEnrollled;
	}
	
	public Student() {
		
	}

	public Student(int id, String userName, String password, String email) {
		super.setId(id);
		super.setEmail(email);
		super.setPassword(password);
		super.setUserName(userName);
	}


	
}
