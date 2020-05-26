
public class ArvoreBinaria {
	private Node raiz = null;
	
	public void inserir(int valor) {
		raiz = inserir(raiz, valor);
	}
	
	private Node inserir(Node node, int valor) {
		if(!isEmpty(node)) {
			
			if(valor <= node.getValor()) {
				
				if(node.getEsquerda() != null) {
					inserir(node.getEsquerda(), valor);
				}
				else {
					System.out.println("Inserindo " + valor + " a esquerda de " + node.getValor());
					node.setEsquerda(new Node(valor));
				}
			}
			else if(valor > node.getValor()) {
				if(node.getDireita() != null) {
					inserir(node.getDireita(), valor);
				}
				else {
					System.out.println("Inserindo " + valor + " a direita de " + node.getValor());
					node.setDireita(new Node(valor));
				}
			}
		}
		else node = new Node(valor);
		
		return node;
	}

	public void inserirNaoRecursivo(int valor) {
		Node novoNo = new Node(valor);
		if(this.raiz == null) {
			raiz = novoNo;
		}
		
		Node atual = raiz;
		boolean achou = false;
		
		while(!achou) {
			//Procurando lugar para inserir o nó
			if(valor <= atual.getValor()) {
				//Indo pela esquerda
				atual = atual.getEsquerda();
				if(atual == null) {
					atual = novoNo;
					System.out.println("Inserindo " + valor);
					achou = true;
				}
			}
			//Indo pela direita
			else {
				atual = atual.getDireita();
				if(atual == null) {
					atual = novoNo;
					System.out.println("Inserindo " + valor);
					achou = true;
				}
			}
		}
	}
	
	private boolean isEmpty(Node node) {
		return node == null;
	}
	
	public void preOrdem(Node no) {
		if(no != null) {
			System.out.print(no.getValor() + " ");
			preOrdem(no.getEsquerda());
			preOrdem(no.getDireita());
		}
	}
	
	public void preOrdem() {
		preOrdem(raiz);
	}
	
	public void emOrdem(Node no) {
		if(no != null) {		
			emOrdem(no.getEsquerda());
			System.out.print(no.getValor() + " ");
			emOrdem(no.getDireita());
		}
	}
	
	public void emOrdem() {
		emOrdem(raiz);
	}
	
	public void posOrdem(Node no) {
		if(no != null) {		
			posOrdem(no.getEsquerda());
			posOrdem(no.getDireita());
			System.out.print(no.getValor() + " ");
		}
	}
	
	public void posOrdem() {
		posOrdem(raiz);
	}
	
	private int contarNosRecursivo(Node no) {
		int numNos = 1;
		if(no.getDireita() != null)
			numNos += contarNosRecursivo(no.getDireita());
		if(no.getEsquerda() != null)
			numNos += contarNosRecursivo(no.getEsquerda());
		return numNos;
	}
	
	public int contarNosRecursivo() {
		return contarNosRecursivo(raiz);
	}
	
	private int somarNosRecursivo(Node no) {
		int soma, somaEsquerda, somaDireita;
		soma = somaEsquerda = somaDireita = 0;
		
		if(no.getEsquerda() != null)
			somaEsquerda = somarNosRecursivo(no.getEsquerda());
		if(no.getDireita() != null)
			somaDireita = somarNosRecursivo(no.getDireita());
		soma = no.getValor() + somaEsquerda + somaDireita;
		
		return soma;
	}
	
	public int getQteNosFolha() {
		return getQteNosFolha(raiz);
	}
	
	private int getQteNosFolha(Node no) {
		if(no == null)
			return 0;
		if(no.getEsquerda() == null && no.getDireita() == null)
			return 1;
		else {
			return getQteNosFolha(no.getEsquerda()) + getQteNosFolha(no.getDireita());
		}
		
	}
	
	public int getQteNosNaoFolha() {
		return contarNosRecursivo() - getQteNosFolha(raiz);
	}
	
	public int somarNosRecursivo() {
		return somarNosRecursivo(raiz);
	}
}
