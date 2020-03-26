import java.util.LinkedList;

import lombok.Data;

@Data
public class Class {
	private char id;
	private String name;
	private String division;
	private char adminId;
	
	//Alunos podem se desvincular da instituição e também serem adicionados
	//ao fazerem a matrícula. Logo, uma lista encadeada é o ideal.
	private LinkedList<Student> students = new LinkedList<Student>();
	
	public void DisplayClass() {
	};
}
