package entities;

import entities.interfaces.ProfessorRm;

public class Professor extends Pessoa implements ProfessorRm {
	private String materia;
	private Integer cargaHoraria;
	private int rm;

	public Professor() {
	}

	public Professor(int rm) {
		this.rm = rm;
	}

	public Professor(String nome, String cpf, String endereco, String cep, Integer idade, String materia,
			Integer cargaHoraria) {
		super(nome, cpf, endereco, cep, idade);
		this.materia = materia;
		this.cargaHoraria = cargaHoraria;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	

	@Override
	public String toString() {
		return "Professor [materia=" + materia + ", cargaHoraria=" + cargaHoraria + ", getNome()="
				+ getNome() + ", getCpf()=" + getCpf() + ", getEndereco()=" + getEndereco() + ", getCep()=" + getCep()
				+ ", getIdade()=" + getIdade() + "]";
	}

	@Override
	public boolean rm() {
		return rm == 552003;
	}

	@Override
	public boolean rm(int rm) {
		this.rm = rm;
		return rm();
	}

}
