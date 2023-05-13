/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Projeto2 {

    //metodo especial: 
    //esse método é o construtor da classe Teste.
    //o nome do método construtor deverá ser o mesmo da classe
    //é possível ter mais do que um método construtor na mesma classe, no entanto,
    //devem ser assinaturas diferentes.
    public Projeto2() {
/*
        Float v1 = recebeValorGUI();
        Float v2 = recebeValorGUI();
        Float r = metodoMedia(v1, v2);
        JOptionPane.showMessageDialog(null, "Media: " + r);
        //System.out.println("Media: " + r);  */

    TratamentoExcecoes tr;

    }

    //definicao de um método em java.
    //assinatura do método: retorno, nome e parâmetros.
    public float metodoMedia(float v1, float v2) {
        return (v1 + v2) / 2.0f;
    }

    public static void main(String args[]) {
        System.out.println("chamou a main");

        //criacao de variável/objeto
        //nesse caso o tipo objeto t é do tipo Teste. 
        //o objeto t está sendo inicializado com uma nova instância da classe Teste.
        Projeto2 t;
        t = new Projeto2();

    

        float retorno = 0f;

        boolean erro = false;

        do {
            try {

                //recebe a informação e converte
                retorno = Float.parseFloat(JOptionPane.showInputDialog("Informe um valor decimal: "));
                erro = false;

            } catch (NumberFormatException e) {

                erro = true;
                JOptionPane.showInputDialog(null, "Informe um válor válido: ");
            }

        } while (erro);
        
        return;

      

    }

    public Float recebeValorCommandLine() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Informe o primeiro valor float: ");
        String valor_lido = myObj.nextLine();

        //converter de String para float
        return Float.parseFloat(valor_lido);

    }

}

