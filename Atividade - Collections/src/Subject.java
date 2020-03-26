import lombok.Data;

@Data
public class Subject {
	
	private char id;
	private String name;
	private char classId;
	//Uma cadeira só pode ter um admin no máximo
	private char adminId;
	
	public void DisplaySubjects() {}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
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
