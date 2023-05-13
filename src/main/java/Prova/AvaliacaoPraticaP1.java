/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

/**
 *
 * @author 20221PF.CC0003
 */

/*
1) Codifique um método privado (nome: questao1) que acesse o atributo da
instância dados_q1, utilize o método java.lang.String.split para separar/dividir
as nove informações (seis números e três letras), tente converter para inteiro
cada informação e adicione o valor convertido em uma java.util.List de Integer.
Caso não seja possível converter, adicionar o valor zero. O método deverá
retornar essa lista. (Peso: 2,0)
*/

/*

2) Codifique o método main na classe AvaliacaoPraticaP1 e um construtor
publico e sem parâmetros. Na classe main crie uma instância de
AvaliacaoPraticaP1. No construtor da classe, chame o método criado na
questão 1. O retorno desse método deverá ser impresso na saída padrão
através de uma estrutura de repetição. (Peso: 2,0)

*/





import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AvaliacaoPraticaP1 {
    
 private String dados = "1,2,3,4,5,6,a,b,c";
 
 private java.util.List<Integer> dados_q1 = new java.util.ArrayList();
 
    

public void questao1(){

int i=0;
String d[] = dados.split(",");

while(i < d.length){
 i++;
 
 try {
  this.dados_q1.add(Integer.parseInt(d[i-1]));
 
 }
catch (NumberFormatException e){        
  
 dados_q1.add(0);
}

}

List<Integer> listaOrdenada = new ArrayList<>(dados_q1);
    
        for (Integer elem : listaOrdenada) {
            
            System.out.print(elem + " ");
    
}}

/*
3) Crie um método (nome: questao3) que receba por parâmetro um vetor de
String. Acesse cada elemento e tente converter para java.util.Calendar
utilizando o formato "dd/MM/yyyy". Caso a conversão seja bem-sucedida,
adicione a instância em uma coleção. Se a conversão não for bem-sucedida
adicione a data "01/01/1983". Essa coleção deverá ser retornada. (Peso: 3,0)
*/

private Map<Integer, java.util.Calendar> mapDados = new HashMap();
private static String dados_q3[] = {"01-01-2006 ", "02-02-2000 "," 03-03-2002 "," 04-12 "};
private SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

//private String dadosString = "{codigo:10, data:'31-01-2022'};"

public void questao3(String vet[]){
      
 int i=0;
 
 while(i < dados_q3.length){

 try{
 String dataStr = dados_q3[i].substring(dados_q3[i].indexOf("{",dados_q3[i].indexOf("-"))+2, dados_q3[i].indexOf(" "));
 
  
  Date data = formato.parse(dataStr);
  Calendar calendar = Calendar.getInstance();
  calendar.setTime(data);
  mapDados.put(i, calendar);
 
 }catch(Exception e){

 }

 i++;
 }
 
  for (Map.Entry<Integer, Calendar> entry : mapDados.entrySet()) {
           
        
        Calendar data = entry.getValue();
        
        String dataStr = formato.format(data.getTime());
        
        System.out.println("Data: " + dataStr);      
              
         
    }}

/*
4) Codifique um construtor (protegido) na classe AvaliacaoPraticaP1 que receba
por parâmetro um array de String. Esse construtor deverá chamar o método
codificado na questão 3, repassando o seu parâmetro. O retorno do método
deverá ser armazenado em uma variável local e cada elemento deverá ser
impresso na saída padrão no formato "dd/MM/yyyy" em ordem ascendente. No
método main da classe AvaliacaoPraticaP1 crie uma instância de
AvaliacaoPraticaP1 utilizando esse construtor e passe como parâmetro o
atributo global dados_q3. (Peso: 3,0)
*/

 private static String dados4[];

private void questao4(String[] args){
    
    String questao[] = dados4;
    
    questao3(dados_q3);
    
    
    
}

public AvaliacaoPraticaP1(){
    
    System.out.print("Questão 1:");
    
    questao1();
    
    System.out.println(" ");
    
    System.out.print("Questão 3:");
    
    questao3(dados_q3);
    
     System.out.print("Questão 4:");
     
     questao4(dados_q3);
    
   
}

public static void main(String args[]){
    
new AvaliacaoPraticaP1();


}}
