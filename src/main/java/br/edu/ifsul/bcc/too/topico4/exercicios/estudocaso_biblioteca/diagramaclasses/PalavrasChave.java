/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

/**
 *
 * @author dalmi
 */
public class PalavrasChave extends Pessoa {
    
    private Integer id;
    private String nome;

    public PalavrasChave() {
    }
    
    public PalavrasChave(Integer id){
        
        this.id = id;
        
    }
    
     public PalavrasChave(String nome){
         this.nome = nome;
     }
    
     public void setId(Integer c){
        this.id = c;        
                
    }
    
      public Integer getId(){
        return this.id;
    }
      
      public void setNome(String c){
        this.nome = c;        
                
    }
    
      public String getNome(){
        return this.nome;
    }
    
}
