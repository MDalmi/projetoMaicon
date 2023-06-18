/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete;

/**
 *
 * @author dalmi
 */
public class CiaArea {
    
    private Long id;
    private String nome;

    public CiaArea() {
    }

    public CiaArea(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
