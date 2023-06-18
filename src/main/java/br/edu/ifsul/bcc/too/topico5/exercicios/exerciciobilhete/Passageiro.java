/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete;

/**
 *
 * @author dalmi
 */
public class Passageiro {
    
    private String documento;
    private String numeroCartao;

    public Passageiro() {
    }

    public Passageiro(String documento, String numeroCartao) {
        this.documento = documento;
        this.numeroCartao = numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }
    
        
    
}
