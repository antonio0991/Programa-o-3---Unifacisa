import java.util.ArrayList;
import java.util.Stack;

import lombok.Data;

@Data
public class Teacher {

	private char id;
	private String name;
	private String PhNo;
	private String adress;
	//Um professor pode no máximo ter 1 admin
	private char adminId;
	
	//Para marcar presença provável que seja feito um acesso direto ao estudante.
	//Logo, um ArrayList é o mais indicado.
	ArrayList<Student> students = new ArrayList<Student>(); 
	//Os testes são retirados na ordem inversa que foram colocados pois assim o professor
	//corrigir-la-a como se estivessem em uma pilha.
	Stack<TestPaper> testePapers = new Stack<TestPaper>();
	
	public void prepareTestPaper() {};
	public void markAttendance() {};
	public void checkPapers() {};
	public void declareResult() {};
}
