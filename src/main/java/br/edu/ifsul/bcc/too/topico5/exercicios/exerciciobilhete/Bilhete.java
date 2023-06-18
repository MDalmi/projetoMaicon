/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete;

import java.util.Calendar;
import br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete.Bagagem;
import br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete.Primeira;
import br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete.Economica;
import br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete.Executiva;

/**
 *
 * @author dalmi
 */
abstract class Bilhete {
    
    private Long id;
    private Integer numero;
    private String assento;

    public Bilhete() {
       
    }

    public Bilhete(Long id, Integer numero, String assento) {
        this.id = id;
        this.numero = numero;
        this.assento = assento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public String getAssento() {
        return assento;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

      

      
    
    
    
    
}
