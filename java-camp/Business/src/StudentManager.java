import Concrete.Student;

public class StudentManager extends UserManager {
	
	@Override
	public void add(Student student) {
		System.out.println(student.getUserName() + " kullanıcı adlı öğrenci eklendi.");
	}

	@Override
	public void update(Student student) {
		System.out.println(student.getUserName() + " kullanıcı adlı öğrenci güncellendi.");
	}

	@Override
	public void delete(Student student) {
		System.out.println(student.getUserName() + " kullanıcı adlı öğrenci silindi.");
	}
	
}
