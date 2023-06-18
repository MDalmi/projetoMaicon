/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete;

import br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete.Pessoa;

/**
 *
 * @author dalmi
 */
public class Endereco extends Aeroporto {    
    private Long id;
    private String rua;
    private Integer numero;
    private String  complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String país;

    public Endereco() {
        
        super(null, null, null);
        
    }

    public Endereco(Long id, String rua, Integer numero, String complemento, String bairro, String cidade, String estado, String país) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.país = país;
        
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public String getPaís() {
        return país;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua() {
        return rua;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }
  
        
    
    
    
    
   
    
}
