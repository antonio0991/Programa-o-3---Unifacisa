import lombok.Data;

@Data
public class Division {

	private char id;
	private String name;
	//Uma divisão só pode ter no máximo um admin
	private char adminId;
	
	public void DisplayDivision() {}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Division other = (Division) obj;
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
