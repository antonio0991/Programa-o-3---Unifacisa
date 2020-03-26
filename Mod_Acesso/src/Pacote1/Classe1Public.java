package Pacote1;

import Pacote2.Classe2Public;

public class Classe1Public {
	
	public int vP;
	protected int vPct;
	int vPck;
	private int vPriv;

	public static void main(String[] args) {
		Classe1Default c1d = new Classe1Default();
		Classe1Public c1p = new Classe1Public();
		//Classe2Default c2d = new Classe2Default(); Nâo pode ser instanciado (classe não-pública de outro pacote)
		Classe2Public c2p = new Classe2Public();
		
		System.out.println(c1d.vP);
		System.out.println(c1d.vPct);
		System.out.println(c1d.vPck);
		//System.out.println(c1d.vPriv); Membro privado
		
		System.out.println(c1p.vP);
		System.out.println(c1p.vPct);
		System.out.println(c1p.vPck);
		System.out.println(c1p.vPriv);
		
		System.out.println(c2p.vP);
		//System.out.println(c2p.vPct); Não pode ser acessado (variável protegida de classe em outro pacote)
		//System.out.println(c2p.vPck); Variável visível apenas no outro pacote
		//System.out.println(c2p.vPriv); Variável privada de outra classe
		

	}

}
