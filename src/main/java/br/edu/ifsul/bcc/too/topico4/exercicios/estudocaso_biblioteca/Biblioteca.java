package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca;

import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Funcionario;
import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Pessoa;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;


/**
 *
 * @author telmo
 */
public abstract class Biblioteca {

    Biblioteca() {
        
        exercicio01();
      
         //comparar pessoas pelo CompareTO e ordenar 
    }
       
    
    

    private Collection<Pessoa> exercicio01() {

        Collection<Pessoa> listagem = new ArrayList<>();

        Pessoa p1 = new Pessoa("041123213", "123543", "Armando", "123958", "9996005", 135, "99954123",
                Calendar.getInstance(), Calendar.getInstance());

        Pessoa p2 = new Pessoa("045168239", "987532", "Armandinho", "123958", "9996055", 125, "899541231",
                Calendar.getInstance(), Calendar.getInstance());

        Pessoa p3 = new Pessoa("482173162", "231123", "Armandao", "123958", "999600235", 115, "999542123",
                Calendar.getInstance(), Calendar.getInstance());

        Funcionario p4 = new Funcionario("123");

        Funcionario p5 = new Funcionario("456");
        
        listagem.add(p1);

        return listagem;
    }

}

public static void main(String args[]){
        /* métod estático*/
        
        new Biblioteca();
        
        
        //https://plantuml.com/ie-diagram
    }
}
