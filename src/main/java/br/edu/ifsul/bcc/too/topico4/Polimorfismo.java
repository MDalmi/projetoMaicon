
package br.edu.ifsul.bcc.too.topico4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/*

EXERC2
definir um segundo construtor (sobrecarga) que receba todas as datasde 
nascimento invalidas ()

*/
public class Polimorfismo {
    
    private List<PessoaEncapsulada>  list = new ArrayList();
    
    protected Polimorfismo(){
        
        testOO();
        
    }
    
    private void testOO(){
        
        Calendar calendar = Calendar.getInstance();
        
        calendar.set(Calendar.YEAR, 2003);
       
        PessoaEncapsulada p1 = new PessoaEncapsulada();
        p1.setCPF("00001359070");
        p1.setNome("Fulano de Tal");
        p1.setDataNascimento(calendar);
                
        list.add(p1);
        
        calendar.set(Calendar.YEAR, 2020);
        
        p1 = new PessoaEncapsulada();
        p1.setCPF("00001359077");
        p1.setNome("Siglano de Tal");
        p1.setDataNascimento(calendar);
        
        list.add(p1);
        
        calendar.set(Calendar.YEAR, 2015);
        
         p1 = new PessoaEncapsulada();
        p1.setCPF("12385726365");
        p1.setNome("Fulano de TalEU");
         p1.setDataNascimento(calendar);
        
        list.add(p1);
        
        calendar.set(Calendar.YEAR, 2000);
        
         p1 = new PessoaEncapsulada();
        p1.setCPF("18275039843");
        p1.setNome("Fulano de LiTal");
        p1.setDataNascimento(calendar);
        
        list.add(p1);
        
        
        calendar.set(Calendar.YEAR, 1990);
        p1 = new PessoaEncapsulada();
        p1.setCPF("21958471632");
        p1.setNome("Fulano de Talia");
        p1.setDataNascimento(calendar);
        
        list.add(p1);
        
       
            
        for(PessoaEncapsulada p : list){
           
            
          
            
            
            System.out.println(p.getNome() + ": " + p + " Idade: " + p.getIdade());
        }
        
    }
    
    public static void main(String args[]){
        
        new Polimorfismo();
    }
    
}
