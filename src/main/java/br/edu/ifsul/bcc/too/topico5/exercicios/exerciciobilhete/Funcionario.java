/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete;

/**
 *
 * @author dalmi
 */
public class Funcionario {
    
    private String codigo;
    private String contaCorrente;
    
    public Funcionario() {
    }
    
    public Funcionario(String codigo, String contaCorrente) {
        this.codigo = codigo;
        this.contaCorrente = contaCorrente;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public String getContaCorrente() {
        return contaCorrente;
    }

   
    
    
    
    
}
