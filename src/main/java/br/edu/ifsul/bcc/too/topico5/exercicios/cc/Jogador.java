/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.cc;

import java.util.Calendar;

/**
 *
 * @author dalmi
 */
public class Jogador {
    
    private String nickname;
    private String senha;
    private Integer pontos;
    private Calendar data_cadastro;
    private Calendar data_ultimo_login;
    private Endereco endereco;
    
    

    public Jogador() {
    }

    public Jogador(String nickname, String senha, Integer pontos, Calendar data_cadastro, Calendar data_ultimo_login) {
        this.nickname = nickname;
        this.senha = senha;
        this.pontos = pontos;
        this.data_cadastro = data_cadastro;
        this.data_ultimo_login = data_ultimo_login;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public void setData_ultimo_login(Calendar data_ultimo_login) {
        this.data_ultimo_login = data_ultimo_login;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    public Calendar getData_ultimo_login() {
        return data_ultimo_login;
    }

    public String getNickname() {
        return nickname;
    }

    public Integer getPontos() {
        return pontos;
    }

    public String getSenha() {
        return senha;
    }
    
    
    
    
}
