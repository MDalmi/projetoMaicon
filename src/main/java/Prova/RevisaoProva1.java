/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.SortedMap;

/**
 *
 * @author dalmi
 */
public class RevisaoProva1 {

    private String raw_data = "123,b,22,f,e,7,1,2,3";

    /*
    Com base na classe Questao1, finalize a implementação do método
    converteDados. Esse método deverá converte para Integer cada um dos
    elementos do vetor d (variável local). O resultado da conversão deverá ser
    armazenado na lista dados (atributo da instância). Caso não seja possível
    converter para inteiro, adicionar a informação 0 (zero) na lista da instância.
     */
    private java.util.List<Integer> dados = new java.util.ArrayList();

    public void converteDados() {

        int i = 0;
        String d[] = raw_data.split(",");

        while (i < d.length) {
           

        try {

            this.dados.add(Integer.parseInt(d[i]));
           
        } catch (NumberFormatException e) {

            dados.add(0);

        }
        
         i++;
        
        }
        
        Collections.sort(dados);

    }

    /*
        1.1) Com base no código fonte da questão 1, codifique um novo método para
imprimir na saída padrão todos elementos da lista dados (atributo da
instância). Esses dados deverão ser impressos em ordem crescente,
desconsiderando as informações duplicadas. Esse método deverá ser chamado
no construtor, após a chamada do método converteDados.
     */
    public void MostraDados() {

       List<Integer> listaOrdenada = new ArrayList<>(new HashSet(dados));
     
      // HashSet não duplica números
       
        System.out.println("ELEMENTOS: ");
       
        for (Integer elem : listaOrdenada) {
            
            
            System.out.print(elem + ",");

    }
    }

    public RevisaoProva1() {
        converteDados();
        MostraDados();

    }

    public static void main(String args[]) {
        new RevisaoProva1();
    }

}
