
public class Pilha {
	
	private Conta topo;
	private int tamanho = 0;
	
	/**
	 * Função para adicionar uma Conta ao topo da pilha
	 * @param novaConta
	 */
	public void push(Conta novaConta) {
		Conta topoAntigo = topo;
		topo = novaConta;
		topo.proximo = topoAntigo;
		tamanho++;
	}
	
	/**
	 * Função para remover o item no topo da pilha
	 * @return Conta Retorna o item no topo da pilha
	 * @throws ListaVaziaException
	 */
	public Conta pop() throws ListaVaziaException{
		if(isEmpty()) {
			throw new ListaVaziaException();
		}
		Conta temp = topo;
		topo = topo.proximo;
		tamanho--;
		return temp;
	}
	
	/**
	 * Função para ver o item no topo da pilha
	 * @return Conta Retorna o item no topo da lista sem removê-lo
	 * @throws ListaVaziaException
	 */
	public Conta peek() throws ListaVaziaException{
		if(isEmpty()) {
			throw new ListaVaziaException();
		}
		return topo;
	}
		
	/**
	 * Função para verificar se duas pilhas são iguais 
	 * @param outraPilha
	 * @return boolean Retorna true se as duas pilhas forem iguais
	 */
	public boolean isEqualTo(Pilha outraPilha) {
		if(tamanho == outraPilha.size()) {
			Conta essa = topo;
			Conta outra = topo;
			for(int i = 0; i < tamanho; i++) {
				if(essa.getNumeroConta() != outra.getNumeroConta()) {
					return false;
				}
				else {
					essa = essa.proximo;
					outra = outra.proximo;
				}
			}
		}
		else {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Verifica se a lista está vazia
	 * @return boolean Retorna true se o tamanho for igual a 0 (lista vazia)
	 */
	public boolean isEmpty() {
		return tamanho == 0;
	}
	
	/**
	 * Verifica o tamanho da lista
	 * @return int Retorna o tamanho da lista
	 */
	public int size() {
		return tamanho;
	}
}
