/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wanderley
 */
public class Calculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
       ArrayList <Funcionario> funcionario = new ArrayList<>();
        while(true){
            String op = in.nextLine();
            String [] comando = op.split(" ");
            
            switch(comando[0]){
                case "addTER":
                   boolean i;
                    if (comando[3] == "sim"){
                        i = true;
                    }
                    else{
                        i = false;
                    }
                    Funcionario ter = new Terceirizado(comando[1],Integer.getInteger(comando[2]), i);
                    funcionario.add(ter);
                    break;
                case "addPro":
                    
                    Funcionario prof = new Professor(comando[1],comando[2]);
                    funcionario.add(prof);
                   break;
                case "addSTA":
                    Funcionario sta = new STA(comando[1], Integer.getInteger(comando[2]));
                    funcionario.add(sta);
                    break;
                case "show":
                    for (Funcionario f: funcionario){
                        if (f.getNome().equals(comando[1])){
                            System.out.println(f.toString());
                            
                        }
                    }
                    break;
                case "rm":
                    for (Funcionario f: funcionario){
                        if (f.getNome().equals(comando[1])){
                            funcionario.remove(f);
                            
                        }
                    }
                    
                    
                
            }
                    
            
            
        }
    }
    
}
