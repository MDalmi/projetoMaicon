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
public abstract class ClientePessoaFisica extends Cliente{
    
    private String cpf;
    private String nome;
    private Calendar nascimento;

    public ClientePessoaFisica() {
        
    }
    
    public ClientePessoaFisica(String cpf, String nome, Calendar nascimento)
    {
        super(" ", " ", " ", null);
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }
    
    public void setCpf(String c)
    {
        this.cpf = c;
    }
    
    public String getCpf()
    {
        return this.cpf;
    }
    
     public void setNome(String c){
        this.nome = c;        
                
    }
    
      public String getNome(){
        return this.nome;
    }
      
    public void setNascimento(Calendar c){
        
      this.nascimento = c;
    }
    
    public Calendar getNascimento(){
        
        return this.nascimento;
    }
    
}
