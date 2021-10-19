package entities;

public class Retangulo {

	private double altura;
	private double largura;
	
	public void setAltura (double a) {
		this.altura = a;
	}
	public double getAltura () {
		return this.altura;
	}
	public void setLargura (double l) {
		this.largura = l;
	}
	public double getLargura () {
		return this.largura;
	}
	
	public double calculaArea () {
		return this.altura * this.largura;
	}
	public double calculaPerimetro () {
		return (2*this.altura)+(2*this.largura);
	}
	public double calculaDiagonal () {
		return Math.sqrt((this.altura*this.altura)+(this.largura*this.largura));
	}
	
}
