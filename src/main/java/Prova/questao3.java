/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

import java.util.Arrays;

/*
Com base na classe Questao3 codifique um novo método para classificar os
dados do vetor dados (atributo da instância). A classificação deverá ser
realizada de forma ascendente. Esse método deverá ser chamado no
construtor da classe. Após, imprima na saída padrão os dados classificados.
*/

public class questao3 {

    private Integer[] dados = {40, -10, 60, -1, 5, -25, 11, 3};

    public questao3() {
        
        ascendente();

    }
    
    void ascendente(){
        
       
        Arrays.sort(dados);
        
        System.out.println("Números: ");
        
        for (int i = 0; i < dados.length; i++) {
         
            System.out.print(dados[i] + ", ");
            
        }
        
    }

    public static void main(String args[]) {

        new questao3();
    }

}
