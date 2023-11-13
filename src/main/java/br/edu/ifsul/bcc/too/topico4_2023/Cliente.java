/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4_2023;

import java.util.Calendar;

/**
 *
 * @author dalmi
 */
public class Cliente extends Pessoa {
    
    private Calendar data_ultima_compra;
    private String observacoes;

    public Cliente(){
    }

    public Cliente(Calendar data_ultima_compra, String observacoes) {
        this.data_ultima_compra = data_ultima_compra;
        this.observacoes = observacoes;
    }

    public void setData_ultima_compra(Calendar data_ultima_compra) {
        this.data_ultima_compra = data_ultima_compra;
    }

    public Calendar getData_ultima_compra() {
        return data_ultima_compra;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getObservacoes() {
        return observacoes;
    }
    
}
