/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.zip.DataFormatException;
import java.util.Date;


/**
 *
 * @author dalmi
 */
public abstract class Pessoa {

    private String cpf;
    private String nome;
    private Calendar data_nascimento;
    private String cep;
    private String complemento;
    

    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, Calendar data_nascimento, String cep, String complemento) {
        this.cpf = cpf;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cep = cep;
        this.complemento = complemento;

    
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimentoFormatted() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        return dateFormat.format(this.data_nascimento.getTime());
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCpf() {
        return cpf;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public String getNome() {
        return nome;
    }

}
