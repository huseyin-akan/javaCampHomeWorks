import Concrete.Student;

public class InstructorManager extends UserManager{
	@Override
	public void add(Student student) {
		System.out.println(student.getUserName() + " kullanıcı adlı eğitmen eklendi.");
	}

	@Override
	public void update(Student student) {
		System.out.println(student.getUserName() + " kullanıcı adlı eğitmen güncellendi.");
	}

	@Override
	public void delete(Student student) {
		System.out.println(student.getUserName() + " kullanıcı adlı eğitmen silindi.");
	}
}

