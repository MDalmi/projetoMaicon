package br.edu.ifsul.bcc.too.topico3.exercicios;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author telmo
 */
public class Exercicio5 {

    static String strDados = "A classe String é utilizada por toda a API do Java e por diversas vezes precisaremos dela em nossos códigos. Isso faz com que o domínio dessa classe seja fundamental para todo aquele que deseja se tornar um programador Java. Aqui neste artigo falaremos sobre as principais características dessa classe com exemplos de código e comentários.";

    public Exercicio5(String t, String t2, String t3, String t4, String p, String p2) {

        //testeComparacaoStrings(t,  t2,  t3, t4);
        //testeSplit(p);
        teste2Split(p2);

    }

    ;
    
    private void testeComparacaoStrings(String t, String t2, String t3, String t4) {

        if (t3 == t4) {
            System.out.println("Tudo igual maluco!");
        } else {
            System.out.println("Diferente mermao.");
        }

        t.equals(t2);

        if (t3.equalsIgnoreCase(t4) == true) {
            System.out.println("Ta maluco");
        }

        if (t.compareTo(t2) < 0) {
            System.out.println("N to maluco");
        }

    }

    ;
    
    private void testeSplit(String Param) {

        System.out.println("String: " + Param);

        String[] partes;
        partes = Param.split(",");

        for (int i = 0; i < partes.length; i++) {

            try {
                Integer item = Integer.parseInt(partes[i]);
                System.err.println(item);
            } catch (NumberFormatException e) {
                System.out.println("-");
            }

        }

    }

    private void teste2Split(String Param2) {
        
        String[] partes;
        partes = Param2.split(",");

    }

    private void manipulaDados() {//metodo da classe

        System.out.println("Utilização do compareTo.");

        String v1 = "A";

        String v2 = "B";

        String v3 = "C";

        System.out.println("1° compareTo:" + v1.compareTo(v2)); // -1 

        System.out.println("2° compareTo:" + v1.compareTo(v1)); // 0 

        System.out.println("3° compareTo:" + v2.compareTo(v1)); // 1

        System.out.println("executou o metodo manipulaDados()");

        System.out.println("1) Utilização do método concat: concatenação.");
        String strconcat = "\t<< ".concat(strDados);
        strconcat = strconcat.concat(">>");
        System.out.println(strconcat);

        System.out.println("2) Utilização do método valueOf: conversao para string");

        String ret = String.valueOf(0);
        System.out.println("\tString convertida : " + ret);

        System.out.println("3) Utilização do método startsWith: teste de conteúdo inicial");

        boolean ret1 = strDados.startsWith("A classe");
        boolean ret2 = strDados.startsWith("a classe");

        System.out.println("\tret1 : " + ret1);
        System.out.println("\tret2 : " + ret2);

        System.out.println("4) Utilização do método endsWith: teste de conteúdo final ");

        System.out.println("5) Utilização do método indexOf: índice de caracter ");

        System.out.println("6) Utilização do método subString: parte de String ");

        System.out.println("Replace" + strDados.replace('a', 'A'));

        System.out.println("Trim" + strDados.trim());

    }

    public static void main(String args[]) {//metodo main

        String texto = "A";
        String txt = "ABC";

        String texto2 = "B";
        String texto3 = "B";

        String Param = "1,2,3,4,5,6,7,a,b,c,8";

        String Param2 = "{codigo= 1}, {codigo= 22}, {codigo= 300}";

        new Exercicio5(texto, txt, texto2, texto3, Param, Param2);

        // e5.manipulaDados();//chamada do metodo a partir do objet
    }

}
