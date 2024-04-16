package br.com.fiap;

import java.time.*;
import javax.swing.JOptionPane;

public class UsaAluno {

	public static void main(String[] args) {
		
		String nomeFic1, nomeFic2, dataNasc1, dataNasc2, rm1, rm2;
		int rm3, rm4;
		
		
		LocalDate nasc1;
		nasc1 = LocalDate.parse("2005-02-15");
		Aluno aluno1 = new Aluno(98603, "David Denunci", nasc1);
		
		LocalDate nasc2;
		nasc2 = LocalDate.parse("2005-10-11");
		Aluno aluno2 = new Aluno(1, "Manoella Waideman", nasc2);
		
		
		Aluno aluno3 = new Aluno();
		LocalDate nasc3;
		
		Aluno aluno4 = new Aluno();
		LocalDate nasc4;
		
		
		LocalDate anoAtual;
		anoAtual = LocalDate.now();
		
		

		try {
			JOptionPane.showMessageDialog(null, "Alunos: "
					+ "\nNome: " + aluno1.getNome()
					+ "\nRm: " + aluno1.getRm()
					+ "\nIdade completa: " + aluno1.calculaIdadeCompleta(anoAtual)
					+ "\n"
					+ "\nNome: " + aluno2.getNome()
					+ "\nRm: " + aluno2.getRm()
					+ "\nIdade completa: " + aluno2.calculaIdadeCompleta(anoAtual));
			
			
			
			nomeFic1 = JOptionPane.showInputDialog("Digite o nome: ");
			aluno3.setNome(nomeFic1);
			
			rm1 = JOptionPane.showInputDialog("Digite o número do rm: ");
			rm3 = Integer.parseInt(rm1);
			aluno3.setRm(rm3);
			
			dataNasc1 = JOptionPane.showInputDialog("Digite a data de nascimento no seguinte formato(ano-mês-dia): ");
			nasc3 = LocalDate.parse(dataNasc1);
			aluno3.setDataDeNascimento(nasc3);
			
			
			
			nomeFic2 = JOptionPane.showInputDialog("Digite o nome: ");
			aluno4.setNome(nomeFic2);
			
			rm2 = JOptionPane.showInputDialog("Digite o número do rm: ");
			rm4 = Integer.parseInt(rm2);
			aluno4.setRm(rm4);
			
			dataNasc2 = JOptionPane.showInputDialog("Digite a data de nascimento no seguinte formato(ano-mês-dia): ");
			nasc4 = LocalDate.parse(dataNasc2);
			aluno4.setDataDeNascimento(nasc4);
			
			JOptionPane.showMessageDialog(null, "Alunos fictícios: "
					+ "\nNome: " + nomeFic1
					+ "\nRm: " + rm3
					+ "\nIdade completa: " + aluno3.calculaIdadeCompleta(anoAtual)
					+ "\n"
					+ "\nNome: " + nomeFic2
					+ "\nRm: " + rm4
					+ "\nIdade completa: " + aluno4.calculaIdadeCompleta(anoAtual));
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
