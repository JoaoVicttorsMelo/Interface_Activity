package program;

import javax.swing.JOptionPane;

import entities.Diretor;
import entities.Professor;
import entities.help.Help;
import entities.help.HelpProfessor;
import entities.interfaces.Entrar;
import entities.interfaces.ProfessorRm;

public class Program {

	public static void main(String[] args) {
		char escolha = JOptionPane.showInputDialog("Você é diretor ou professor? [D/P]").charAt(0);
		escolha = Character.toUpperCase(escolha);
		if (escolha == 'D') {
			String login = JOptionPane.showInputDialog("Digite seu Login: ");
			String senha = JOptionPane.showInputDialog("digite sua senha: ");
			Entrar entrar = new Diretor(login, senha);
			if (new Help(entrar).entrar()) {
				JOptionPane.showMessageDialog(null, "Funcionando perfeitamente Diretor");
				String nome = JOptionPane.showInputDialog("digite seu nome: ");
				String cpf = JOptionPane.showInputDialog("digite seu CPF: ");
				String endereco = JOptionPane.showInputDialog("digite seu Endereço: ");
				String cep = JOptionPane.showInputDialog("digite seu CEP: ");
				String escola = JOptionPane.showInputDialog("digite o nome da sua escola: ");
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sau idade: "));
				int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite sua carga horaria: "));
				Diretor diretor = new Diretor(nome, cpf, endereco, cep, idade, escola, cargaHoraria);
				System.out.println(diretor);
			} else {
				JOptionPane.showMessageDialog(null, "Login ou senha incorretos");
			}
		} else if (escolha == 'P') {
			int rm = Integer.parseInt(JOptionPane.showInputDialog("Digite seu RM: "));
			ProfessorRm professor = new Professor(rm);
			if (new HelpProfessor(professor).rm()) {
				JOptionPane.showMessageDialog(null, "Funcionando perfeitamente Diretor");
				String nome = JOptionPane.showInputDialog("digite seu nome: ");
				String cpf = JOptionPane.showInputDialog("digite seu CPF: ");
				String endereco = JOptionPane.showInputDialog("digite seu Endereço: ");
				String cep = JOptionPane.showInputDialog("digite seu CEP: ");
				String materia = JOptionPane.showInputDialog("digite sua Matéria: ");
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sau idade: "));
				int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Digite sua carga horaria: "));
				Professor prof= new Professor(nome, cpf, endereco, cep, idade, materia, cargaHoraria);
				System.out.println(prof);
			} else {
				JOptionPane.showMessageDialog(null, "Seu RM esta incorreto");

			}
		} else {
			JOptionPane.showMessageDialog(null, "Você não digitou nenhuma das opções corretas");
		}

	}

}
