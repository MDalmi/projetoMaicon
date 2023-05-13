
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses;

import java.util.Calendar;
import javax.print.DocFlavor;

public class Pessoa {
    
    /*campos da tabela*/
    public String cpf;
    public String rg;
    public String nome;
    public String logradouro;
    public String cep;
    public Integer numero;
    public String telefone;
    public Calendar data_cadastro;
    public Calendar data_nascimento;
    public Integer idade;
    
    /*construtor padrão: protegido e sem parâmetros.*/
    public Pessoa(){
        
        
        
    }
    /*polimorfismo*/
    public Pessoa(String cpf, String rg, String nome, String logradouro, String cep, Integer numero, String telefone, Calendar data_cadastro, Integer idade, Calendar data_nascimento){
        
        this.cpf = cpf;
        this.rg = rg;
        this.nome = nome;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.telefone = telefone;
        this.data_cadastro = data_cadastro;
        this.idade = idade;
        this.data_nascimento = data_nascimento;
        
        
        
    }
    
   
    
}
