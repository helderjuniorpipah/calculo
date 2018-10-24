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
public class STA extends Funcionario{

	private int nivel;
    

    public STA(String nome, int nivel){
        super(nome, 1);
        this.nivel = nivel;

    }

    STA(String string, Integer integer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getNivel(){
    	return this.nivel;

    }

    public void setNivel(int nivel){
    	this.nivel =  nivel; 

    }

    public String toString(){
    	String res = "";
    	res += super.toString();
    	res += "NÃ­vel: " + this.nivel + "\n";
    	return res;
    }

    public double calcularSalario(){
    	return 3000 + 300 * this.nivel + 100 * this.getDiarias();
    }

}
