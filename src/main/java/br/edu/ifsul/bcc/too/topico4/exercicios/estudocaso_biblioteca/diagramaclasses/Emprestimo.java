/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author dalmi
 */
public class Emprestimo {
    
    private Integer id;
    private Calendar data;
    private Calendar data_devolucao;
    private Calendar data_devolvivdo;
    private Boolean situacao;
    private Funcionario funcionario;
    private Aluno aluno;
    private Exemplar exemplar;
    
    private Collection<Parcelamento> parcelas;
    
    public Emprestimo(Integer id){
        
        this.id = id;
        
    }
     public void setId(Integer c){
        this.id = c;        
                
    }
    
      public Integer getId(){
        return this.id;
    }
    
     public Emprestimo(Calendar data){
        
        this.data = data;
        
    }
       
        public void setData(Calendar c){
        this.data = c;        
                
    }
    
      public Calendar getData(){
        return this.data;
    }
      
      public Emprestimo(Boolean situacao){
        
        this.situacao = situacao;
        
    }
      
       public void setSituacao(Boolean c){
        this.situacao = c;        
                
    }
    
      public Boolean getSituacao(){
        return this.situacao;
    }
    
      
      
    
    
    
}
