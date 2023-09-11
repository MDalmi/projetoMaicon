/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author dalmi
 */
public class TesteData {

    private Calendar dataCalendar; // Atributo de instância 

    private Date dataDate;
    
    private SimpleDateFormat formatador;

    

    public TesteData() {

        System.out.println("Testes com datas:: ");

        dataCalendar = Calendar.getInstance(); // inicializar
        
        formatador = new SimpleDateFormat("dd");

        System.out.println(dataCalendar);
        
        dataCalendar.set(Calendar.DAY_OF_MONTH, 12);
        dataCalendar.set(Calendar.YEAR, 1983);
        dataCalendar.set(Calendar.MONTH, 1);
         
        String data_formatada = formatador.format(dataCalendar.getTime());

        System.out.println("Data Formatada: " + data_formatada);
        
        // DATA DATE // 
        
        dataDate = new Date();
       
        System.out.println(dataDate);
        data_formatada = formatador.format(dataDate);
        System.out.println("Data Formatada: "+data_formatada);
        System.out.println("Data java.util.date em milis: "+dataDate.getTime());
        
        Long diasDate, diasCal;
        
        diasDate = dataDate.getTime();
        
        diasCal = dataCalendar.getTimeInMillis();
        
        Long Resultado = diasDate - diasCal;
        
        System.out.println("Diferença entre milis: "+ Resultado);
        
        // DIAS DE DIFERENÇA
        
        Integer diaDate, diaCal;
        
        diaDate = dataDate.getDate();
        
        diaCal = Integer.parseInt(data_formatada);
        
        Integer resultado2 = diaCal+1 - diaDate;
        
        System.out.println("Diferença entre dias: "+ resultado2);
              
            
    }

    public static void main(String[] args) {

        new TesteData();

    }

}
