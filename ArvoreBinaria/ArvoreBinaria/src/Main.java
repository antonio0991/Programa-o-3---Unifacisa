
public class Main {
	public static void main(String[] args) {
		ArvoreBinaria a = new ArvoreBinaria();
		a.inserir(4);
		a.inserir(2);
		a.inserir(6);
		a.inserir(1);
		a.inserir(3);
		a.inserir(5);
		a.inserir(7);
		System.out.println("-------Pré-ordem-------");
		a.preOrdem();
		System.out.println("\n-------Em-ordem-------");
		a.emOrdem();
		System.out.println("\n-------Pós-ordem-------");
		a.posOrdem();
		
		System.out.println("\n------Soma dos nós-----");
		System.out.println(a.somarNosRecursivo());
	}
}
