package Pacote2;
import Pacote1.Classe1Public;

public class Classe2Public {
	
	public int vP;
	protected int vPct;
	int vPck;
	private int vPriv;

	public static void main(String[] args) {
		//Classe1Default c1d = new Classe1Default(); Nâo pode ser instanciado (classe não-pública de outro pacote)
		Classe1Public c1p = new Classe1Public();
		Classe2Default c2d = new Classe2Default();
		Classe2Public c2p = new Classe2Public();
		
		System.out.println(c1p.vP);
		//System.out.println(c1p.vPct); Não pode ser acessado (variável protegida de classe em outro pacote)
		//System.out.println(c1p.vPck); Variável acessível apenas no outro pacote
		//System.out.println(c1p.vPriv); Variável privada de outra classe
		
		System.out.println(c2d.vP);
		System.out.println(c2d.vPct);
		System.out.println(c2d.vPck);
		//System.out.println(c2d.vPriv); Variável privada de outra classe
		
		System.out.println(c2p.vP);
		System.out.println(c2p.vPct);
		System.out.println(c2p.vPck);
		System.out.println(c2p.vPriv);
	}

}
