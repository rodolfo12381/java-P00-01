package entities;

public class Aluno {

	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public void setNome (String name) {
		this.nome = name;
	}
	public String getNome () {
		return this.nome;
	}
	public void setNota1 (double nota1) {
		this.nota1 = nota1;
	}
	public double getNota1 () {
		return this.nota1;
	}
	public void setNota2 (double nota2) {
		this.nota2 = nota2;
	}
	public double getNota2 () {
		return this.nota2;
	}
	public void setNota3 (double nota3) {
		this.nota3 = nota3;
	}
	public double getNota3 () {
		return this.nota3;
	}
	
	public double calculaSomaNotas () {
		return nota1+nota2+nota3;
	}
	public boolean verificaAprovacao () {
		return calculaSomaNotas() > 60;
	}
	public double calculaPontosFaltantes () {
		return 60-calculaSomaNotas();
	}
	
}
