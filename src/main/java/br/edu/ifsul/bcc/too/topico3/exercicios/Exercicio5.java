
package br.edu.ifsul.bcc.too.topico3.exercicios;

/**
 *
 * @author telmo
 */
public class Exercicio5 {
    
    static String strDados = "A classe String é utilizada por toda a API do Java e por diversas vezes precisaremos dela em nossos códigos. Isso faz com que o domínio dessa classe seja fundamental para todo aquele que deseja se tornar um programador Java. Aqui neste artigo falaremos sobre as principais características dessa classe com exemplos de código e comentários.";
    
    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma 
           rotina para utilizar os métodos da classe java.lang.String utilizando a 
           variável estática strDados:
           
           concat, String.valueOf, startsWith endsWith, indexOf, substring, replace, trim, compareto.
    
    */
    
    //constutor da classe.
    public Exercicio5(){
              System.out.println("executou o construtor da classe");
    }
    
    private void manipulaDados(){//metodo da classe
        
         System.out.println("Utilização do compareTo.");
        
        String v1 = "A";
        
        String v2 = "B";
        
        String v3 = "C";
        
        System.out.println("1° compareTo:" + v1.compareTo(v2)) ; // -1 
        
        System.out.println("2° compareTo:" + v1.compareTo(v1)) ; // 0 
        
        System.out.println("3° compareTo:" + v2.compareTo(v1)) ; // 1
        
        System.out.println("executou o metodo manipulaDados()");
        
         System.out.println("1) Utilização do método concat: concatenação.");
            String strconcat =  "\t<< ".concat(strDados);
                   strconcat = strconcat.concat(">>");
        System.out.println(strconcat);
        
        System.out.println("2) Utilização do método valueOf: conversao para string");
        
            String ret = String.valueOf(0);
            System.out.println("\tString convertida : "+ ret);

        System.out.println("3) Utilização do método startsWith: teste de conteúdo inicial");
        
            boolean ret1 = strDados.startsWith("A classe");
            boolean ret2 = strDados.startsWith("a classe");
            
            System.out.println("\tret1 : "+ ret1);
            System.out.println("\tret2 : "+ ret2);
        System.out.println("4) Utilização do método endsWith: teste de conteúdo final ");    
        
        System.out.println("5) Utilização do método indexOf: índice de caracter ");
        
        System.out.println("6) Utilização do método subString: parte de String ");
        
        System.out.println("7) Utilização do método replace: substituição de caracteres ");
        
        System.out.println("7) Utilização do método trim: remoção de espaços em branco ");
        
        System.out.println("7) Utilização do método compareTo: comparação ");
        
        
        
        
    }
    
    public static void main(String args[]){//metodo main
        
        
        
        
        
        
        Exercicio5 e5 = new Exercicio5();//objeto da classe
        e5.manipulaDados();//chamada do metodo a partir do objeto.
        
    }
    
    
    
    
    
}
