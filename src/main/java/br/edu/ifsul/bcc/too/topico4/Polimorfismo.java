
package br.edu.ifsul.bcc.too.topico4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author telmo
 */

/*
Exer1

  (imprimir o objeto através do metodo toString() - sobrepor o 
  CPF = xxx.xxx.xxx-xx - Idade = xx

EXERC2
definir um segundo construtor (sobrecarga) que receba todas as datasde 
nascimento invalidas ()
impedir cpf invaldio
calcular idade

*/
public class Polimorfismo {
    
    private List<PessoaEncapsulada>  list = new ArrayList();
    
    protected Polimorfismo(){
        
        testOO();
        
    }
    
    private void testOO(){
        
        
        PessoaEncapsulada p1 = new PessoaEncapsulada();
        p1.setCPF("00001359070");
        p1.setNome("Fulano de Tal");
        
        list.add(p1);
        
        p1 = new PessoaEncapsulada();
        p1.setCPF("00001359077");
        p1.setNome("Siglano de Tal");
        
        list.add(p1);
        
         p1 = new PessoaEncapsulada();
        p1.setCPF("12385726365");
        p1.setNome("Fulano de TalEU");
        
        list.add(p1);
        
         p1 = new PessoaEncapsulada();
        p1.setCPF("18275039843");
        p1.setNome("Fulano de LiTal");
        
        list.add(p1);
        
        p1 = new PessoaEncapsulada();
        p1.setCPF("21958471632");
        p1.getCPF("21958471632");
        p1.setNome("Fulano de Talia");
        
        list.add(p1);
        
        for(PessoaEncapsulada p : list){
            
            System.out.println(p + " ");
        }
        
    }
    
    public static void main(String args[]){
        
        new Polimorfismo();
    }
    
}
