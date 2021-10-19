package entities;

public class Funcionario {

	private String name;
	private double GrossSalary;
	private double Tax;
	
	public void setName (String nome) {
		this.name = nome;
	}
	public String getName () {
		return this.name;
	}
	public void setGrossSalary (double salarioBruto) {
		this.GrossSalary = salarioBruto;
	}
	public double getGrossSalary () {
		return this.GrossSalary;
	}
	public void setTax (double taxa) {
		this.Tax = taxa;
	}
	public double getTax () {
		return this.Tax;
	}
	
	public double NetSalary () {
		return this.GrossSalary - this.Tax;
	}
	public void IncreaseSalary (double percentage) {
		double value;
		value = (percentage)/100 * this.GrossSalary;
		this.GrossSalary += value;
	}
	
}
