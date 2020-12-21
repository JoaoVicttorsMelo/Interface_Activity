package program;

import javax.swing.JOptionPane;

import entities.HeadMaster;
import entities.Professor;
import entities.help.Help;
import entities.help.HelpProfessor;
import entities.interfaces.Acess;
import entities.interfaces.ProfessorRm;

public class Program {

	public static void main(String[] args) {
		char chosen = JOptionPane.showInputDialog("are You a Professor or a Headmaster? [P/H]").charAt(0);
		chosen = Character.toUpperCase(chosen);
		if (chosen == 'H') {
			String login = JOptionPane.showInputDialog("set your Login: ");
			String pass = JOptionPane.showInputDialog("set your password: ");
			Acess acess = new HeadMaster(login, pass);
			if (new Help(acess).acess()) {
				String name = JOptionPane.showInputDialog("set your name: ");
				String nin = JOptionPane.showInputDialog("set your nin: ");
				String address = JOptionPane.showInputDialog("set your address: ");
				String zipCode = JOptionPane.showInputDialog("set your Zip Code: ");
				String school = JOptionPane.showInputDialog("set your school name: ");
				int age = Integer.parseInt(JOptionPane.showInputDialog("how old are you?: "));
				int workload = Integer.parseInt(JOptionPane.showInputDialog("set your workload: "));
				HeadMaster headMaster = new HeadMaster(name, nin, address, zipCode, age, school, workload);
				System.out.println(headMaster);
			} else {
				JOptionPane.showMessageDialog(null, "Something went wrong");
			}
		} else if (chosen == 'P') {
			int rm = Integer.parseInt(JOptionPane.showInputDialog("set your code: "));
			ProfessorRm professor = new Professor(rm);
			if (new HelpProfessor(professor).rm()) {
				String name = JOptionPane.showInputDialog("set your name: ");
				String nin = JOptionPane.showInputDialog("set your nin: ");
				String address = JOptionPane.showInputDialog("set your address: ");
				String zipCode = JOptionPane.showInputDialog("set your Zip Code: ");
				String grade = JOptionPane.showInputDialog("set your grade: ");
				int age = Integer.parseInt(JOptionPane.showInputDialog("how old are you?: "));
				int workload = Integer.parseInt(JOptionPane.showInputDialog("set your workload: "));
				Professor prof = new Professor(name, nin, address, zipCode, age, grade, workload);
				System.out.println(prof);
			} else {
				JOptionPane.showMessageDialog(null, "Your code doesn't exist");

			}
		} else {
			JOptionPane.showMessageDialog(null, "Something went wrong");
		}

	}

}
