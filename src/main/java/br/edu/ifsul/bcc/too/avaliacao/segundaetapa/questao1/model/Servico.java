/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author dalmi
 */
public class Servico {
    
    private Integer id;
    private Float valor;
    private Calendar data_inicio;
    private Calendar data_fim;
    
    private Collection <Pagamento> pagamentos;

    public Servico() {
    }

    public Servico(Integer id, Float valor, Calendar data_inicio, Calendar data_fim) {
        this.id = id;
        this.valor = valor;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
    }

    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Calendar getData_fim() {
        return data_fim;
    }

    public Calendar getData_inicio() {
        return data_inicio;
    }

    public Integer getId() {
        return id;
    }

    public Float getValor() {
        return valor;
    }
    
    
    
}
