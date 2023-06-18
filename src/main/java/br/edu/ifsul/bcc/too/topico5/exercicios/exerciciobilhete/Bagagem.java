/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete;

/**
 *
 * @author dalmi
 */
public class Bagagem {
    
    private Long id;
    private Double peso;

    public Bagagem(Long id, Double peso) {
        this.id = id;
        this.peso = peso;
    }

    public Bagagem() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }
    
    
    
}
