package entities.help;

import entities.interfaces.Acess;

public class Help {
	Acess acess;

	public boolean acess() {
		return acess.acess();
	}
	
	public Help(Acess acess) {
		this.acess=acess;
	}

}
