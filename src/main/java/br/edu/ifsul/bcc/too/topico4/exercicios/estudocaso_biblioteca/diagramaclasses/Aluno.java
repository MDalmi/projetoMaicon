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
public class Aluno extends Pessoa {
    
    private String matricula;
    
    Aluno(){
        
        
        
    }
    
    public Aluno(String matricula){
        
        super(null, null, null, null, null, 0, null, Calendar.getInstance(), Calendar.getInstance());
        this.matricula = matricula;
        
        
        
    }
    
    public void setMatricula(String c){
        this.matricula = c;        
                
    }
    
      public String getMatricula(){
        return this.matricula;
    }
    
}
