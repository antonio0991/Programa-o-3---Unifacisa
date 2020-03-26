import lombok.Data;
import java.util.Stack;

@Data
public class Student {

	private char id;
	private String name;
	private String PhNo;
	private String Adress;
	private char classId;
	private char adminId;
	private char teacherId;
	
	Stack<TestPaper> testPaper = new Stack<TestPaper>();
	
	public void FillAdmissionForm() {};
	public void GetEnrolled() {};
	public void WriteExam() {};
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	};
}
