/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

/**
 *
 * @author dalmi
 */
public class Peca {
 
    private Integer id;
    private String nome;
    private Float valor;
    private String fornecedor;

    public Peca() {
    }

    public Peca(Integer id, String nome, Float valor, String fornecedor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Float getValor() {
        return valor;
    }
    
    
            

    
}
