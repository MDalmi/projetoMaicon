package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca;

import br.edu.ifsul.bcc.too.topico3.exercicios.Exercicio1;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Funcionario;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Pessoa;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Aluno;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Emprestimo;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Exemplar;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author telmo
 */
public abstract class Biblioteca {

    Biblioteca() {
 
       /*definir/setar/guardar valores para os demais atributos do objeto p*/
        /*alternativa 1 : atraves do construtor*/
        /*
        Pessoa p = new Pessoa("00123", 
                              "123",
                              "fulano",
                              "rua das flores",
                              "99010000",
                              123,
                              "5430130000",
                              Calendar.getInstance(),
                              Calendar.getInstance()
        );        
        System.out.println("Nome: "+p.getNome()+" CPF: "+p.getCPF());
        
        p.setDataNascimento(Calendar.getInstance());        
        //p.idade = 22;        
        System.out.println("Idade da pessoa: "+p.getIdade());
        */
        
        Collection<Pessoa> ret = exercicio01();
        
        System.out.println(ret);
        for(Pessoa pes: ret){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Pessoa: "+sdf.format(pes.getDataNascimento().getTime()));
            
        }   
    }
    
    
    private Collection<Pessoa> exercicio01() {

        List<Pessoa> listagem = new ArrayList<>();

        Aluno a1 = new Aluno("124f");
        
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2022);
        a1.setDataNascimento(c);
        
        Aluno a2 = new Aluno("124f3");
        
        c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2015);
        a2.setDataNascimento(c);
        
        Aluno a3 = new Aluno("124f5");
        
        c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2018);
        a3.setDataNascimento(c);

        Funcionario p4 = new Funcionario("123", "Cachro");
        
        c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2010);
        p4.setDataNascimento(c);
        

        Funcionario p5 = new Funcionario("456", "Aroz");
        
         c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2020);
        p5.setDataNascimento(c);


        listagem.add(a1);
        listagem.add(a2);
        listagem.add(a3);
        listagem.add(p4);
        listagem.add(p5);
        
        Collections.sort(listagem);

        return listagem;
    }
    
    /*
        Exercício 2: resolver o problema de sintaxe "new Pessoa()", criando
        um construtor na classe Aluno, que receba os parâmetros(String cpf, 
        String rg, String nome, String logradouro, String cep, Integer numero,
        String telefone,Calendar data_cadastro, Calendar data_nascimento e matricula)
        Os primeiros 9 parâmetros deverão ser encaminhados para o construtor
        de Pessoa, utilizando o comando super(cpf, rg, ...).
        O décimo parâmetro deverá ser atribuido para o atributo da instância.
    */    
    /*
        Exercício 3: criar um método que retorne uma coleção de Empréstimo. Esse método deverá
        receber por parâmetro uma lista de Funcionario, Aluno e Exemplar. Cada elemento recebido
        por parâmetro deverá ser vinculado a um Empréstimo.   
    */
    
    private Collection<Emprestimo> exercicio03(List<Funcionario> listFunc, List<Aluno> listAluno, List<Exemplar> listExemp){
        
       Collection<Emprestimo> listRetorno = new ArrayList<>();
        
       for(Exemplar ex: listExemp){
           
           
        
           
       }
        

       return listRetorno;
    }
    
   
    /*
        Exercicio 4: testar o método criado na questão 3 (chamar e imprimir o retorno).
    */
    
    

    public static void main(String args[]) {
        
        
        new Biblioteca(){
            
        };
        
        
    }
}
