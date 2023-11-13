/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4_2023;

import java.util.Collection;
import java.util.ArrayList;

/**
 *
 * @author dalmi
 */
public class Produto {

    private Integer id;
    private String nome;
    private Float valor;
    private Collection<Foto> fotos; // agregação por composiçaõ

    public Produto() {
    }

    public Produto(Integer id, String nome, Float valor, Collection<Foto> fotos) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.fotos = fotos;
    }

    public Produto(Integer id, String nome, Float valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getValor() {
        return valor;
    }

    public void setFotos(Collection<Foto> fotos) {

        this.fotos = fotos;
    }

    public Collection<Foto> getFotos() {
        return fotos;
    }

    // metodo adicional para complementar o encapsulamento do this.fotos
    public void setFoto(Foto foto) {
        if (this.fotos == null) {
            this.fotos = new ArrayList();
        }
        this.fotos.add(foto);
    }

}
