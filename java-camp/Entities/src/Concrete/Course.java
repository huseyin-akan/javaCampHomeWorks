package Concrete;

import Abstract.IEntity;

public class Course implements IEntity {
	int id;
	String courseName;
	
	public Course() {
		
	}
	
	public Course(int id, String courseName) {
		this.id = id;
		this.courseName = courseName;
	}
}
