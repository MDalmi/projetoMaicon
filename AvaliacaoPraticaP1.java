/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

/**
 *
 * @author 20221PF.CC0003
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

/*
1) Codifique um método privado (nome: questao1) que acesse o atributo da
instância dados_q1, utilize o método java.lang.String.split para separar/dividir
as nove informações (seis números e três letras), tente converter para inteiro
cada informação e adicione o valor convertido em uma java.util.List de Integer.
Caso não seja possível converter, adicionar o valor zero. O método deverá
retornar essa lista. (Peso: 2,0)
*/

public class AvaliacaoPraticaP1 {
    
 private String dados_q1 = "1,2,3,4,5,6,a,b,c";
 
 private List<Integer> questao1() { 
     
        String[] numeros = dados_q1.split(",");
        List<Integer> ListaInteiro = new ArrayList<>();

        for (String numero : numeros) {
            try {
                int valor = Integer.parseInt(numero);
                ListaInteiro.add(valor);
            } catch (NumberFormatException e) {
                ListaInteiro.add(0);
            }
        }

        return ListaInteiro;
    }
    
    
/*
3) Crie um método (nome: questao3) que receba por parâmetro um vetor de
String. Acesse cada elemento e tente converter para java.util.Calendar
utilizando o formato "dd/MM/yyyy". Caso a conversão seja bem-sucedida,
adicione a instância em uma coleção. Se a conversão não for bem-sucedida
adicione a data "01/01/1983". Essa coleção deverá ser retornada. (Peso: 3,0)
*/

private static String dados_q3[] = {"01-01-2006 ", "02-02-2000 "," 03-03-2002 "," 04-12 "};

public List<Calendar> questao3(String vet[]){
    
    List<Calendar> Datas = new ArrayList<>(); // Collection
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
    Calendar dataPadrao = Calendar.getInstance();
     dataPadrao.set(1983, Calendar.JANUARY, 1);
    
      for (String dados_q3 : vet) {
       try {
                Calendar data = Calendar.getInstance();
                data.setTime(formato.parse(dados_q3));
                Datas.add(data);
            } catch (ParseException e) {
                Datas.add(dataPadrao);
            }
        }

       return Datas;
    }

/*
4) Codifique um construtor (protegido) na classe AvaliacaoPraticaP1 que receba
por parâmetro um array de String. 
Esse construtor deverá chamar o método codificado na questão 3, repassando o seu parâmetro. 

O retorno do método ser armazenado em uma variável local e cada elemento deverá ser
impresso na saída padrão no formato "dd/MM/yyyy" em ordem ascendente. 

No método main da classe AvaliacaoPraticaP1 crie uma instância de
AvaliacaoPraticaP1 utilizando esse construtor e passe como parâmetro o
atributo global dados_q3. (Peso: 3,0)
*/

protected void questao4(String[] vet){
    
    List<Calendar> datas = questao3(vet); // passar por parametro
  
    datas.sort(Calendar::compareTo);
    
    SimpleDateFormat formatoSaida = new SimpleDateFormat("dd-MM-yyyy");
        
        System.out.println("Lista de datas:");
        for (Calendar Datas : questao3(dados_q3)) {
            
            String dataFormatada = formatoSaida.format(Datas.getTime());
     
            System.out.println(dataFormatada);
            
        } 
}

public AvaliacaoPraticaP1(){
    
  
        questao1();

        System.out.println("Lista de números:");
        for (int numero : questao1()) {
            System.out.println(numero);
        }
        
        
        questao4(dados_q3);
        
    
     
   
}

/*

2) Codifique o método main na classe AvaliacaoPraticaP1 e um construtor
publico e sem parâmetros. Na classe main crie uma instância de
AvaliacaoPraticaP1. No construtor da classe, chame o método criado na
questão 1. O retorno desse método deverá ser impresso na saída padrão
através de uma estrutura de repetição. (Peso: 2,0)

*/


public static void main(String args[]){
    
   new AvaliacaoPraticaP1();


}}
