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
public class Funcionario{
	private String nome;
	private int maxDiarias;
	private int diarias;
	
	public Funcionario(String nome, int maxDiarias){
		this.nome = nome;
		this.maxDiarias = maxDiarias;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}	

	public int getDiarias(){
		return this.diarias;
	}
	public void setDiarias(int diarias){
		this.diarias = diarias;
	}

	public boolean addDiaria(){
		if(this.diarias >= this.maxDiarias){
			return false;
		}else{
			this.diarias++;
			return true;
		}
//	}
        @Override
	 String toString(){
		String res = "";
		res += "Nome: " + this.nome + "\n" +
				"Diarias: " + this.diarias + "\n";
		return res;
	}

}

//