/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respostas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//    1) Com base na classe Questao1, finalize a implementação do método
//  converteDados. Esse método deverá converte para Integer cada um dos
//  elementos do vetor d (variável local). O resultado da conversão deverá ser
//  armazenado na lista dados (atributo da instância). Caso não seja possível
//  converter para inteiro, adicionar a informação 0 (zero) na lista da instância.

//   Com base no código fonte da questão 1, codifique um novo método para
//   imprimir na saída padrão todos elementos da lista dados (atributo da
//  instância). Esses dados deverão ser impressos em ordem crescente,
//  desconsiderando as informações duplicadas. Esse método deverá ser chamad
//  no construtor, após a chamada do método converteDados.


public class Avaliação_exer1 {

private String raw_data = "123,b,22,f,e,7,1,2,3";

private java.util.List<Integer> dados = new java.util.ArrayList();



public void converteDados(){

int i=0;
String d[] = raw_data.split(",");



while(i < d.length){
 i++;
 
 try {
  this.dados.add(Integer.parseInt(d[i-1]));
  
 
 }
catch (NumberFormatException e){        
  
 dados.add(0);
}


 
}


}

public void imprimiDados(){
    
   
       
    
        List<Integer> listaOrdenada = new ArrayList<>(dados);
        
        Collections.sort(listaOrdenada);
        
        for (Integer elem : listaOrdenada) {
            
            System.out.print(elem + " ");
    
}
}


public Avaliação_exer1(){
    
    converteDados();
    imprimiDados();
    
}

public static void main(String args[]){
new Avaliação_exer1();


}
}

