/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.cc;

/**
 *
 * @author dalmi
 */
public class Arma {
    
    private Float comprimento_cano;
    private TIPO tipo;
    private Municao municao;

    public Arma(Float comprimento_cano, TIPO tipo, Municao municao) {
        this.comprimento_cano = comprimento_cano;
        this.tipo = tipo;
        this.municao = municao;
    }
    
    public Arma() {
    }

    public Arma(Float comprimento_cano, TIPO tipo) {
        this.comprimento_cano = comprimento_cano;
        this.tipo = tipo;
    }

    public void setComprimento_cano(Float comprimento_cano) {
        this.comprimento_cano = comprimento_cano;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }

    public Float getComprimento_cano() {
        return comprimento_cano;
    }

    public TIPO getTipo() {
        return tipo;
    }

    public void setMunicao(Municao municao) {
        this.municao = municao;
    }

    public Municao getMunicao() {
        return municao;
    }
    
    
    
    
    
}
