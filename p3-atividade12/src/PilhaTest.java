import static org.junit.Assert.*;

import org.junit.Test;

public class PilhaTest {

	@Test
	public void testPush() throws ListaVaziaException {
		Pilha actual = new Pilha();
		Conta conta1 = new Conta(1, 1, "A");
		Conta conta2 = new Conta(2,2, "B");
		actual.push(conta1);
		actual.push(conta2);
		Conta expected = conta2;
		assertEquals(expected, actual.peek());
	}
	
	@Test
	public void testIsEqualToIgual() {
		Pilha essa = new Pilha();
		Pilha outra = new Pilha();
		Conta conta1 = new Conta(1, 1, "A");
		Conta conta2 = new Conta(2,2, "B");
		Conta conta3 = new Conta(3,3, "C");
		essa.push(conta1);
		essa.push(conta2);
		essa.push(conta3);
		outra.push(conta1);
		outra.push(conta2);
		outra.push(conta3);
		boolean expected = true;
		boolean actual = essa.isEqualTo(outra);
		assertEquals(expected, actual);
	}
	
	public void testIsEqualToDiferente() {
		Pilha essa = new Pilha();
		Pilha aquela = new Pilha();
		Conta conta1 = new Conta(1, 1, "A");
		Conta conta2 = new Conta(2,2, "B");
		Conta conta3 = new Conta(3,3, "C");
		essa.push(conta1);
		essa.push(conta2);
		essa.push(conta3);
		aquela.push(conta1);
		boolean expected = false;
		boolean actual = essa.isEqualTo(aquela);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPop() throws ListaVaziaException {
		Pilha actual = new Pilha();
		Conta conta1 = new Conta(1, 1, "A");
		Conta conta2 = new Conta(2,2, "B");
		actual.push(conta1);
		actual.push(conta2);
		Conta expectedPop = conta2;
		Conta expectedPeek = conta1;
		assertEquals(expectedPop, actual.pop());
		assertEquals(expectedPeek, actual.peek());
	}
	
	@Test
	public void testPeek() throws ListaVaziaException {
		Pilha actual = new Pilha();
		Conta conta1 = new Conta(1, 1, "A");
		actual.push(conta1);
		Conta expected = conta1;
		assertEquals(expected, actual.peek());
	}

}
