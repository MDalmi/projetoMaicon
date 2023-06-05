/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.casosala;

import java.util.Calendar;

/**
 *
 * @author dalmi
 */
public class Cliente {
    
    private String endereco;
    private String bairro;
    private String telefone;
    private Calendar ultimaCompra;
    
    public Cliente(){
        
        
    }
    
    
     public Cliente(String endereco, String bairro, String telefone, Calendar ultimaCompra){
        
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.ultimaCompra = ultimaCompra;
       
        
    }
    
    
     public void setEndereco(String c){
        this.endereco = c;        
                
    }
    
      public String getEndereco(){
        return this.endereco;
    }
      
     public void setBairro(String c){
        this.bairro = c;        
                
    }
    
      public String getBairro(){
        return this.bairro;
    }
     
     public void setTelefone(String c){
        this.telefone = c;        
                
    }
    
      public String getTelefone(){
        return this.telefone;
    }
      
     public void setUltimacompra(Calendar c){
        this.ultimaCompra = c;        
                
    }
    
      public Calendar getUltimacompra(){
        return this.ultimaCompra;
    }
     
     
     
}
