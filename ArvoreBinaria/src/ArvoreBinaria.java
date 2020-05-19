
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
	
}
