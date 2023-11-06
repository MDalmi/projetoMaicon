package br.edu.ifsul.bcc.too.topico4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DecimalFormat;

/**
 *
 * @author telmo
 */
//classe é uma especificação para um objeto. 
//Classe ou tipo, permite especificar o formato dos objetos que poderão ser criados futuramente. (variáveis do tipo da classe).
//Ou seja, classe é como se fosse um molde para objetos. 
//instância de uma classe é equivalente a objeto da classe.
public class PessoaEncapsulada {

    /* atributos de instância ou de objeto: definem o estado do objeto em um determinado instante.*/
    private String cpf;//atributos privados e métodos públicos é uma forma de encapsulamento.
    private String nome;
    private String corOlhos;
    private String corCabelo;
    private Calendar dataNascimento;
    private Float altura;
    private Integer idade;

    /*
      Acessibilidade: permite implementar o encapsulamento. Ou seja, encapsular (ocultar) a complexidade (código) 
      que não é relevante para o restante da implementação e disponibilizar o que é revelante. 
    
      private: visível apenas dentro da classe.
      protected: visível apenas dentro do pacote.
      public: totalmente visível. 
     */
    //construtor padrão da classe: protegido e sem parâmetros.
    protected PessoaEncapsulada() {

        //esse método será executado na criação da instância.
    }

    //https://www.devmedia.com.br/sobrecarga-e-sobreposicao-de-metodos-em-orientacao-a-objetos/33066
    //polimorfismo: possibilita a reutilização de codigo fonte, uma vez que um objeto pode assumir várias formas.
    //Existem dois tipos de polimorfismo: sobrecarga (orverload) e sobreposição (override).
    //Sobrecarga: permite a existencia de mais de um método com o mesmo nome, porém, 
    //com assinatura diferente (quantidade e tipo de argumentos/parâmetros)
    protected PessoaEncapsulada(String cpf, String nome, Integer idade) {

        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    //Sobreposição: permite reescrever um método em uma subclasse que possua comportamento diferente
    //do método de mesma assinatura na superclasse.
    //DecimalFormat formato = new DecimalFormat("000.000.000-00");
    @Override
    public String toString() {

       String cpfFormatado = String.format("%s.%s.%s-%s", this.cpf.substring(0, 3), this.cpf.substring(3, 6), this.cpf.substring(6, 9), this.cpf.substring(9));
       return cpfFormatado;
        
        
    
    }

    //encapsulamento: restringe o acesso ao atributo da instância e libera o acesso vai método público.
    //dessa forma é possível controlar o que será retornado.
    public String getCPF(String cpf) {

        return this.cpf;
    }

    public void setCPF(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(java.util.Calendar dataNascimento) {

        this.dataNascimento = dataNascimento;

        //calcula para descobrir a idade
        int ano = dataNascimento.get(Calendar.YEAR);
        int anoatual;

        java.util.Date dt = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        anoatual = Integer.valueOf(sdf.format(dt));

        this.idade = anoatual - ano;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public Calendar getDataNascimento() {

        return dataNascimento;
    }

}
