package entities;

import entities.interfaces.Entrar;

public class Diretor extends Pessoa implements Entrar {
	private String escola;
	private Integer cargaHoraria;
	private String login;
	private String senha;

	public Diretor() {
	}

	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public Diretor(String nome, String cpf, String endereco, String cep, Integer idade, String escola,
			Integer cargaHoraria) {
		super(nome, cpf, endereco, cep, idade);
		this.escola = escola;
		this.cargaHoraria = cargaHoraria;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public boolean entrar() {
		return login.equalsIgnoreCase("diretor") && senha.equalsIgnoreCase("123");
	}

	@Override
	public boolean entrar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return entrar();
	}

	@Override
	public String toString() {
		return "Diretor [escola=" + escola + ", cargaHoraria=" + cargaHoraria + ", getNome()=" + getNome()
				+ ", getCpf()=" + getCpf() + ", getEndereco()=" + getEndereco() + ", getCep()=" + getCep()
				+ ", getIdade()=" + getIdade() + "]";
	}

}
