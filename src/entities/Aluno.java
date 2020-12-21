package entities;

public class Aluno extends Pessoa {

	private String aula;
	private String ano;

	public Aluno() {
	}

	public Aluno(String nome, String cpf, String endereco, String cep, Integer idade, String aula, String ano) {
		super(nome, cpf, endereco, cep, idade);
		this.aula = aula;
		this.ano = ano;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	

}
