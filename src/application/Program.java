package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;
import entities.Funcionario;
import entities.Retangulo;
 

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
	/*	Retangulo r = new Retangulo();
		System.out.println("Enter rectangle width and height:");
		double aux = sc.nextDouble();
		r.setAltura(aux);
		aux = sc.nextDouble();
		r.setLargura(aux);
		System.out.println("Area = "+String.format("%.2f",r.calculaArea()));
		System.out.println("Perimeter = "+String.format("%.2f",r.calculaPerimetro()));
		System.out.println("Diagonal = "+String.format("%.2f",r.calculaDiagonal()));
	*/	
		
	/*	Funcionario f = new Funcionario ();
		
		f.setName(sc.nextLine());
		f.setGrossSalary(sc.nextDouble());
		f.setTax(sc.nextDouble());
		
		System.out.println("Name: "+f.getName());
		System.out.println("Gross Salary: "+f.getGrossSalary());
		System.out.println("Tax: "+f.getTax());
		System.out.println();
		System.out.println("Employee: "+f.getName()+", $ "+String.format("%.2f",f.NetSalary()));
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		f.IncreaseSalary(sc.nextDouble());
		System.out.println();
		System.out.println("Updated data: "+f.getName()+", $ "+String.format("%.2f",f.NetSalary()));
	*/
		
	/*	Aluno a = new Aluno();
		a.setNome(sc.nextLine());
		a.setNota1(sc.nextDouble());
		a.setNota2(sc.nextDouble());
		a.setNota3(sc.nextDouble());
		
		System.out.println("FINAL GRADE = "+String.format("%.2f",a.calculaSomaNotas()));
		if (a.verificaAprovacao())
		{
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING "+String.format("%.2f",a.calculaPontosFaltantes())+" POINTS");
		}
	*/	
		sc.close();
	}

}
