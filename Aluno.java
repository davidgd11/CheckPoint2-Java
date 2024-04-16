package br.com.fiap;

import java.time.*;

import javax.swing.JOptionPane;

public class Aluno {

	private int rm;
	private String nome;
	private LocalDate dataDeNascimento;
	
	
	public Aluno(){}
	
	public Aluno(int rm, String nome, LocalDate dataDeNascimento ){
		setRm(rm);
		this.nome = nome;
		setDataDeNascimento(dataDeNascimento); 
	}

	
	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		try {
			if (rm >= 97001 && rm <= 551999) {
				this.rm = rm;
			} else {
				throw new Exception("Valor incorreto do RM!");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0); 
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		LocalDate inicio = LocalDate.parse("1899-12-31");
		LocalDate fim = LocalDate.now();
		try {
			if (dataDeNascimento.isAfter(inicio) && dataDeNascimento.isBefore(fim)) {
				this.dataDeNascimento = dataDeNascimento;
			} else {
				throw new Exception("Data fora da faixa permitida");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0); 
		}
	}
	
	
	public String calculaIdadeCompleta(LocalDate anoAtual) {
		Period idade = Period.between(dataDeNascimento, LocalDate.now()); 
		String idadeCompleta = idade.getYears() + " ano(s), "
				+ idade.getMonths() + " mes(es), "
						+ idade.getDays() + " dia(s).";
		return idadeCompleta;
	}
 
	
	
}
