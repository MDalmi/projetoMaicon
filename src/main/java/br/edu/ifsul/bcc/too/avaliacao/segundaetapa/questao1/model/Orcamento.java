/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Calendar;

/**
 *
 * @author dalmi
 */
public class Orcamento {
    
    private Integer id;
    private String observacoes;
    private Calendar data;

    public Orcamento() {
    }

    public Orcamento(Integer id, String observacoes, Calendar data) {
        this.id = id;
        this.observacoes = observacoes;
        this.data = data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Calendar getData() {
        return data;
    }

    public Integer getId() {
        return id;
    }

    public String getObservacoes() {
        return observacoes;
    }
    
    
    
}
