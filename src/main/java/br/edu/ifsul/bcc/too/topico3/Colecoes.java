package br.edu.ifsul.bcc.too.topico3;

import br.edu.ifsul.bcc.too.topico3.util.Aluno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Documentacao:
 * https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450
 */
public class Colecoes {

    /*
        A partir de Java 1.2, foi criado um conjunto de interfaces e classes denominado Collections Framework, 
        que faz parte do pacote java.util. 
    
        Collections Framework é um conjunto bem definido de interfaces e classes para representar e 
        tratar grupos de dados como uma única unidade, que pode ser chamada coleção, ou collection. 
        A Collections Framework contém os seguintes elementos:
            Interfaces: tipos abstratos que representam as coleções. 
            Implementações: são as implementações concretas das interfaces;
            Algoritmos: são os métodos que realizam as operações sobre os objetos das coleções.     
    
        Interfaces:
    
            Collection - define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;
            Set - interface que define uma coleção que não permite elementos duplicados. SortedSet: 
            possibilita a classificação natural dos elementos, tal como a ordem alfabética;
            
     */
    //atributo de instância.
    private Set<Object> st;

    /*
            List  – define uma coleção ordenada, podendo conter elementos duplicados. 
               Temos o controle total sobre a posição onde cada elemento é inserido e pode recuperá-los 
               através de seus índices.
     
            Map   - mapeia chave para valores.

     */
    //atributo de instância.
    private Collection<Integer> minhaLista;

    //atributo de instância.
    private List<Integer> lst;
    // Pode ser object, aceitando string, numero ....
    private Map<String, String> mp;

    //construtor        
    protected Colecoes() {

    }

    public Colecoes(Integer tipo) {

        // é como um array cujo tamanho pode crescer. A busca de um elemento é rápida, mas inserções e exclusões não são.
        lst = new ArrayList();

        lst.add(1);
        lst.add(20);
        lst.add(0);
        lst.add(15);
        lst.add(8);
        lst.add(3);
        lst.add(15);//elemento duplicado.

        lst.remove(3); // remove o 3 número e não o número 3.

        System.out.println(lst); // praticidade do FOR 

        for (int i = 0; i < lst.size(); i++) {

            System.out.println("Elemento da List: " + lst.get(i));//List possibilita a recuperacao pelo 
            // indice.
        }

        /*
        
        for(Integer i : lst){
        
         System.out.println(i);
        }
         */
        //System.out.println("Contem o elemento com o valor 150: " + lst.contains(150));
    }

    public Colecoes(String tipo) {

        //Se a necessidade for um conjunto com elementos não duplicados e acesso em ordem natural
        st = new TreeSet();

        st.add("Nova Zelandia");
        st.add("França");
        st.add("Brasil");
        st.add("Belgica");
        st.add("Japão");
        st.add("Brasil");
        //st.add(100);

        for (Object o : st) {

            System.out.println("Elemento do Set: " + o);
        }
    }

    public void metodoHashmap() {

        // Escolha esta implementação se a ordenação não for importante e desejar uma estrutura onde 
        // seja necessário um ID (identificador). 
        mp = new HashMap();
        mp.put("id", "1");
        mp.put("uz", "0000134");
        mp.put("cpf", "0000134");
        mp.put("id", "100000");

        for (Map.Entry<String, String> m : mp.entrySet()) {
            System.out.println("Chave " + m.getKey() + " Valor : " + m.getValue());
        }
        System.out.println("chave uz: " + mp.get("uz"));
    }

    public void metodoClassificacaoMap() {

        //Aplicação semelhante a HashMap, com a diferença que TreeMap perde no quesito desempenho;
        SortedMap<String, Aluno> map = new TreeMap();

        map.put("0", new Aluno("456a", "junior"));
        map.put("1", new Aluno("789a", "fulano"));
        map.put("0", new Aluno("789a", "abel"));
        map.put("50", new Aluno("789a", "abel"));
        map.put("3", new Aluno("123a", "telmo"));

        for (Map.Entry<String, Aluno> m : map.entrySet()) {

            System.out.println("Chave " + m.getKey() + " Valor : " + m.getValue());
        }

    }

    public void metodoClassificacao() {

        List<Aluno> list = new ArrayList();

        Aluno a = new Aluno("pf002", "jelmo");
        list.add(a);

        Aluno b = new Aluno("pf001", "tunior");
        list.add(b);

        Aluno c = new Aluno("pf003", "fulano");
        list.add(c);
        
        Aluno d = new Aluno("pf004", "abelao");
        list.add(d);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

    }

    public static void main(String[] args) {

        // new Colecoes().metodoClassificacaoMap();
          new Colecoes().metodoClassificacao();
        //Colecoes c = new Colecoes(0);
        // new Colecoes(0); // chama o construtor tipo INTEIRO
        //  new Colecoes("A"); // chama o construtor tipo STRING
        // c.metodoHashmap();
        // new Colecoes().metodoHashmap();
    }

}
