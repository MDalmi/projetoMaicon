/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Calendar;

/**
 *
 * @author dalmi
 */
public class Funcionario extends Pessoa{
    
    //definição de atributo: numero_ctps
    //criar um construtor público e que recebe por parâmetros informações para os atributos

   private String numero_ctps;
    
    Funcionario(){
            
    }
    
    public Funcionario(String numero_ctps, String cpf){
        
        // passar demais informações
        
        super(cpf, null, null, null, null, 0, null, Calendar.getInstance(), Calendar.getInstance());
        this.numero_ctps = numero_ctps;
       
    }
    
    
    
     public void setNumero_ctps(String c){
        this.numero_ctps = c;        
                
    }
    
     public String getNumero_ctps(){
        return this.numero_ctps;
    }
    
}
