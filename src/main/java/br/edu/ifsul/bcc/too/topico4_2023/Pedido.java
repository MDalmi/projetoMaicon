/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4_2023;

import java.util.Calendar;
import java.util.Collection;
import java.util.ArrayList;
import javax.sound.midi.Soundbank;

/**
 *
 * @author dalmi
 */
public class Pedido {

    private Integer codigo;
    private Calendar data;
    private Float valor_total;
    private Cliente cliente; // criado apartir da associação
    private Collection<Produto> produtos; // agregação

    public Pedido() {
    }

    public Pedido(Integer codigo, Calendar data, Float valor_total, Cliente cliente, Collection<Produto> produtos) {
        this.codigo = codigo;
        this.data = data;
        this.valor_total = valor_total;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public Pedido(Integer codigo, Calendar data, Float valor_total, Cliente cliente) {
        this.codigo = codigo;
        this.data = data;
        this.valor_total = valor_total;
        this.cliente = cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Calendar getData() {
        return data;
    }

    public void setValor_total(Float valor_total) {
        this.valor_total = valor_total;
    }

    public Float getValor_total() {
        return valor_total;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProduto(Produto produto) {
        if (this.produtos == null) {
            this.produtos = new ArrayList();
        }
        this.produtos.add(produto);

    }

    @Override
    public String toString() {
        System.out.println(this.getCliente());
        System.out.println(this.getProdutos());
        
        return null;
    }
    
    

}
