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
public class Pagamento {
    
    private Integer id;
    private Calendar data_vencimento;
    private Calendar data_pagamento;
    private Integer numero_parcela;
    private Float valor;
    private Servico servicos;

    public Pagamento() {
    }

    public Pagamento(Integer id, Calendar data_vencimento, Calendar data_pagamento, Integer numero_parcela, Float valor) {
        this.id = id;
        this.data_vencimento = data_vencimento;
        this.data_pagamento = data_pagamento;
        this.numero_parcela = numero_parcela;
        this.valor = valor;
    }

    public void setData_pagamento(Calendar data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public void setData_vencimento(Calendar data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumero_parcela(Integer numero_parcela) {
        this.numero_parcela = numero_parcela;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Calendar getData_pagamento() {
        return data_pagamento;
    }

    public Calendar getData_vencimento() {
        return data_vencimento;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumero_parcela() {
        return numero_parcela;
    }

    public Float getValor() {
        return valor;
    }
    
    
           
    

    
    
}
