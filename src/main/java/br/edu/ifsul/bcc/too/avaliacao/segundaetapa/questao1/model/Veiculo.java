/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author dalmi
 */
public class Veiculo {
    
   private String placa;
   private String modelo;
   private Integer ano;
   private Calendar data_ultimo_servico;

    public Veiculo() {
    }

    public Veiculo(String placa, String modelo, Integer ano, Calendar data_ultimo_servico) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.data_ultimo_servico = data_ultimo_servico;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setData_ultimo_servico(Calendar data_ultimo_servico) {
        this.data_ultimo_servico = data_ultimo_servico;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAno() {
        return ano;
    }

    public String getDataUltimoServico() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        return dateFormat.format(this.data_ultimo_servico.getTime());
    }
    
    public Calendar getData_ultimo_servico() {
        return data_ultimo_servico;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }
    
    
   
    
}
