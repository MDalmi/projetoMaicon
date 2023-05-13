/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respostas;

/*
2) Com base na classe Questao2 finalize a implementação do método
manipulacaoStrings. Esse método deverá adicionar elementos no mapa
mapDados (atributo da instância). Cada elemento deve conter a informação do
código no formato java.lang.Integer e data no formato java.util.Calendar.
*/

import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
import java.util.Calendar;



public class Questao2 {

 private Map<Integer, java.util.Calendar> mapDados = new HashMap();
 private String dadosString = "{codigo:10, data:'31-01-2022'};"
         + "{codigo:20, data:'01-10-1999'};"
         + "{codigo:30, data:'15-06-1994'}";
 
 SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
 
 
 
 public Questao2(){

 manipulacaoStrings();
 imprimiDados();
 
 }

 private void manipulacaoStrings(){
     
  

 String d[] = dadosString.split(";");
 int i=0;
 while(i < d.length){

 try{
 String codigo = d[i].substring(d[i].indexOf(":")+1,d[i].indexOf(","));
 String dataStr = d[i].substring(d[i].indexOf(":",d[i].indexOf(","))+2, d[i].indexOf("'}"));
 
  
  Date data = formato.parse(dataStr);
  Calendar calendar = Calendar.getInstance();
  calendar.setTime(data);
  mapDados.put(Integer.parseInt(codigo), calendar);
 
 }catch(Exception e){
 e.printStackTrace();
 }

 i++;
 }
 }
 
 public void imprimiDados(){
    
   
       for (Map.Entry<Integer, Calendar> entry : mapDados.entrySet()) {
           
        Integer codigo = entry.getKey();
        Calendar data = entry.getValue();
        
        String dataStr = formato.format(data.getTime());
        
        System.out.println("Código: " + codigo + ", Data: " + dataStr);
        
    }
    
       
 
}

 public static void main(String args[]){
     
 new Questao2();
 
 }
}
