/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.cc;

import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author dalmi
 */
public class Partida {
    private Integer id;
    private Calendar inicio;
    private Calendar fim;
    private Jogador jogador;
    private Collection<Round> rounds;

    public Partida() {
    }

    public Partida(Integer id, Calendar inicio, Calendar fim, Jogador jogador) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.jogador = jogador;
    }

    public void setFim(Calendar fim) {
        this.fim = fim;
    }

    public Calendar getFim() {
        return fim;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setInicio(Calendar inicio) {
        this.inicio = inicio;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Jogador getJogador() {
        return jogador;
    }
    
   
         
    
}
