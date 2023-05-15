/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

/**
 *
 * @author dalmi
 */
public class Exemplar {
    
    private Integer id;
    private Boolean situacao;
    private Livros livro;

    public Exemplar() {
    }
    
    public Exemplar(Integer id){
        
        this.id = id;
    }
    
    public Exemplar(Boolean situacao){
        
        this.situacao = situacao;
    }
    
    public Exemplar(Livros livro){
        
        this.livro = livro;
    }
    
    public void setLivro(Livros c){
        
        this.livro = c;
    }
    
     public Livros getLivro(){
        
        return this.livro;
    }
    
    
    
     public void setId(Integer c){
        this.id = c;        
                
    }
    
      public Integer getId(){
        return this.id;
    }
      
       public void setSituacao(Boolean c){
        this.situacao = c;        
                
    }
    
      public Boolean getSituacao(){
        return this.situacao;
    }
    
}
