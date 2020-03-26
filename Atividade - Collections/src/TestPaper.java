import java.util.LinkedList;
import lombok.Data;

@Data
public class TestPaper {
	char id;
	String nome;
	double duration;
	char classId;
	//Um teste pode ter no máximo um professor
	char teacherId;
	
	//Uma prova pode pertencer a mais de um estudante, e como o tempo da prova é finito,
	//então a adição e remoção de estudantes é o processo mais importante. Logo, o mais
	//indicado é uma LinkedList.
	LinkedList<Student> students = new LinkedList<Student>();
}
