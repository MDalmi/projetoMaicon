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
public class Cliente extends Pessoa {
    
    private String observacoes;
    private Collection<Veiculo> veiculos;

    public Cliente(String observacoes, Collection<Veiculo> veiculos) {
        this.observacoes = observacoes;
        this.veiculos = veiculos;
    }

    public Cliente(String observacoes, Collection<Veiculo> veiculos, String cpf, String nome, Calendar data_nascimento, String cep, String complemento) {
        super(cpf, nome, data_nascimento, cep, complemento);
        this.observacoes = observacoes;
        this.veiculos = veiculos;
    }

    public void setVeiculos(Collection<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Collection<Veiculo> getVeiculos() {
        return veiculos;
    }
    
    
    public Cliente() {
    }

    public Cliente(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
    
    
    
}
