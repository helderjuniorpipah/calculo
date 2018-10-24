/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

/**
 *
 * @author Wanderley
 */
public class Terceirizado extends Funcionario{
	private int horasTrabalhadas;
	private boolean insalubre;

	public Terceirizado(String nome, int horasTrabalhadas,
		boolean insalubre) {
		super(nome, 0);
		this.horasTrabalhadas = horasTrabalhadas;
		this.insalubre = insalubre;
	} 

	public int getHorasTrabalhadas() {
		return this.horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public boolean isInsalubre() {
		return this.insalubre;
	}
	public void setInsalubre(boolean insalubre) {
		this.insalubre = insalubre;
	}

	public double calcularSalario(){

		double salario =  4 *  this.horasTrabalhadas;

		if(this.insalubre){
			salario +=500;
		}

		return salario;

	}

	public String toString(){
		String res ="";
		res += super.toString();
		res += "Horas de Trabalho: " + this.horasTrabalhadas +"\n" +
		"Salubridade: " + this.insalubre + "\n";
		return res;
	}

}


