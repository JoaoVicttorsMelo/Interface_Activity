package entities.help;

import entities.interfaces.ProfessorRm;

public class HelpProfessor {
	ProfessorRm rm;
	
	public boolean rm() {
		return rm.rm();
	}

	public HelpProfessor(ProfessorRm rm) {
		this.rm=rm;
	}

}
