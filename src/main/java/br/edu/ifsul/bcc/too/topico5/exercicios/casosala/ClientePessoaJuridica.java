/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.casosala;

/**
 *
 * @author dalmi
 */
public abstract class ClientePessoaJuridica extends Cliente{
    
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    
    public ClientePessoaJuridica()
    {
        super(" ", " ", " ", null);
    }

    public ClientePessoaJuridica(String cnpj, String nomeFantasia, String razaoSocial) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
    }
    
     public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
    
     public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }
    
    
   
   
   

   
    
    
    
    
}
