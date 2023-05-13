/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
3) Com base na classe Questao3 codifique um novo método para classificar os
dados do vetor dados (atributo da instância). A classificação deverá ser
realizada de forma ascendente. Esse método deverá ser chamado no
construtor da classe. Após, imprima na saída padrão os dados classificados
*/

package Respostas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Avaliação_exer3 {

 //private Integer[] dados = {40, -10, 60, -1, 5, -25, 11, 3};
 
 private List<Integer> dados = Arrays.asList(40, -10, 60, -1, 5, -25, 11, 3);

 public Avaliação_exer3(){
     
  ordenacao();

 }
 
 private void ordenacao(){
     
 Collections.sort(dados);
 //Arrays.sort(dados);
 
 System.out.print(dados + ", ");

 }

 public static void main(String args[]){

 new Avaliação_exer3();
 }

}
