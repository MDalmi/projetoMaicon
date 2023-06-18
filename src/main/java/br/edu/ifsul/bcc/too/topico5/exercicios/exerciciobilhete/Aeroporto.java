/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico5.exercicios.exerciciobilhete;

/**
 *
 * @author dalmi
 */
public class Aeroporto extends Rota {
    
    private Long id;
    private String descricao;
    private String nome;

    public Aeroporto() {
    }

    public Aeroporto(Long id, String descricao, String nome) {
        super(null , null , null);
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
        
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
}
