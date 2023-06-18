/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete;

import java.util.Date;

/**
 *
 * @author dalmi
 */
public class Aviao extends Horario{
    
    private Long id;
    private Date partida;
    private Date chegada;
    private String codigo;
    private Integer qtdEconomica;
    private Integer qtdPrimeira;
    private Integer qtdExecutiva;

    public Aviao() {
        super(null, null, null, null, null, null, null);
    }

    public Aviao(Long id, Date partida, Date chegada, String codigo, Integer qtdEconomica, Integer qtdPrimeira, Integer qtdExecutiva) {
        this.id = id;
        this.partida = partida;
        this.chegada = chegada;
        this.codigo = codigo;
        this.qtdEconomica = qtdEconomica;
        this.qtdPrimeira = qtdPrimeira;
        this.qtdExecutiva = qtdExecutiva;
        
    }

    public void setChegada(Date chegada) {
        this.chegada = chegada;
    }

    public Date getChegada() {
        return chegada;
    }

    public void setQtdPrimeira(Integer qtdPrimeira) {
        this.qtdPrimeira = qtdPrimeira;
    }

    public Integer getQtdPrimeira() {
        return qtdPrimeira;
    }

    public void setPartida(Date partida) {
        this.partida = partida;
    }

    public Date getPartida() {
        return partida;
    }

    public void setQtdExecutiva(Integer qtdExecutiva) {
        this.qtdExecutiva = qtdExecutiva;
    }

    public Integer getQtdExecutiva() {
        return qtdExecutiva;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setQtdEconomica(Integer qtdEconomica) {
        this.qtdEconomica = qtdEconomica;
    }

    public Integer getQtdEconomica() {
        return qtdEconomica;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
   
    
    
    
    
        
    
    
}
