/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Calendar;


/**
 *
 * @author dalmi
 */
public class Parcelamento extends Pessoa {
    
    private Integer id;
    private Integer numero_parcela;
    private Calendar data_vencimento;
    private Calendar data_pagamento;
    private Double valor;
    private Double valor_pag;
    
    private Emprestimo emprestimo;
    
    public Parcelamento(){
        
        
    }
    
     public Parcelamento(Integer id, Integer numero_parcela){
        
        this.id = id;
        this.numero_parcela = numero_parcela;
        
    }
     
     public Parcelamento(Calendar data_vencimento, Calendar data_pagamento)
     {
         this.data_pagamento = data_pagamento;
         this.data_vencimento = data_vencimento;
     }
     
      public Parcelamento(Double valor, Double valor_pag)
     {
         
         this.valor = valor;
         this.valor_pag = valor_pag;
         
     }
      
     public void setValor(Double c){
         
         this.valor = c;
     }
      
     public Double getValor(){
         
         return this.valor;
     }
     
       public void setValor_pag(Double c){
         
         this.valor_pag = c;
     }
      
     public Double getValor_pag(){
         
         return this.valor_pag;
     }
     
     public void setId(Integer c){
        this.id = c;        
                
    }
    
      public Integer getId(){
        return this.id;
    }
      
      public void setNumero_parcela(Integer c)
      {
          this.numero_parcela = c;
      }
      
      public Integer getNumero_parcela(){
          return this.numero_parcela;
      }
      
      public  void setData_pagamento(Calendar c){
          this.data_pagamento = c;
      }
      
      public Calendar getData_pagamento(){
          return this.data_pagamento;
          
      }
      
      public  void setData_vencimento(Calendar c){
          this.data_vencimento = c;
      }
      
      public Calendar getData_vencimento(){
          return this.data_vencimento;
          
      }
    
    
    
    
}
