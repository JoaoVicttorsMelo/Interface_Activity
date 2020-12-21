package entities.help;

import entities.interfaces.Entrar;

public class Help {
	Entrar entrar;

	public boolean entrar() {
		return entrar.entrar();
	}
	
	public Help(Entrar entrar) {
		this.entrar=entrar;
	}

}
