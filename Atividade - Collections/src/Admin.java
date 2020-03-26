import java.util.HashSet;
import lombok.Data;

@Data
public class Admin {

	boolean login = false;
	private char id;
	private String name;
	private String password;
	//Todos os HashSet abaixo são HashSet pois não podem haver
	//duas instâncias do mesmo objeto com o mesmo id.
	private HashSet<Teacher> teachers = new HashSet<Teacher>();
	private HashSet<Student> students = new HashSet<Student>();
	private HashSet<Subject> subjects = new HashSet<Subject>();
	private HashSet<Class> classes = new HashSet<Class>();
	private HashSet<Division> divisions = new HashSet<Division>();
	
	public void addStudentToClass(Student student, Class classe) {
		
	}
	
	public void login() {
		login = true;
	};
	public void logout() {
		login = false;
	};
	public void addNewTeacher(Teacher teacher) {
		teachers.add(teacher);
	};
	public void modifyTeacher(Teacher teacher) {
		teachers.remove(teacher);
		teachers.add(teacher);
	};
	public void addNewStudent(Student student) {
		students.add(student);
	};
	public void modifyStudent(Student student) {
		students.remove(student);
		students.add(student);
	};
	public void addNewSubject(Subject subject) {
		subjects.add(subject);
	};
	public void modifySubject(Subject subject) {
		subjects.remove(subject);
		subjects.add(subject);
	};
	public void addNewClass(Class classe) {
		classes.add(classe);
	};
	public void modifyClass(Class classe) {
		classes.remove(classe);
		classes.add(classe);
	};
	public void addNewDivision(Division division) {
		divisions.add(division);
	};
	public void modifyDivision(Division division) {
		divisions.remove(division);
		divisions.add(division);
	};
}
