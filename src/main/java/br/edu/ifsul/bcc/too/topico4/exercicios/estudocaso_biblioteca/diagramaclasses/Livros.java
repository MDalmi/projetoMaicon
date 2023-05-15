/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Collection;

/**
 *
 * @author dalmi
 */
public class Livros {
    
    private Integer id;
    private String titulo;
    
    //tipo de relaciomento: agregação(losango não
    private Collection<PalavrasChave> palavrasChave;
    
    public Livros(){
        
    }
    
    public Livros(Integer id){
        
        this.id = id;
        
    }
     public void setId(Integer c){
        this.id = c;        
                
    }
    
      public Integer getId(){
        return this.id;
    }
      
       public Livros(String titulo){
        
        this.titulo = titulo;
        
    }
       
        public void setTitulo(String c){
        this.titulo = c;        
                
    }
    
      public String getTitulo(){
        return this.titulo;
    }
      
     
       
       
    
    
}
