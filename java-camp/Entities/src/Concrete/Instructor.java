package Concrete;

import Abstract.IEntity;

public class Instructor extends User implements IEntity {
	
	private String[] lessonsTutoring;

	public String[] getLessonsTutoring() {
		return lessonsTutoring;
	}

	public void setLessonsTutoring(String[] lessonsTutoring) {
		this.lessonsTutoring = lessonsTutoring;
	}
	
    public Instructor() {
		
	}

	public Instructor(int id, String userName, String password, String email) {
		super.setId(id);
		super.setEmail(email);
		super.setPassword(password);
		super.setUserName(userName);
	}	
	
}
