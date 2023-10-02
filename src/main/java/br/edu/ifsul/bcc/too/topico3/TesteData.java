/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.DataFormatException;

/**
 *
 * @author dalmi
 */
public class TesteData {

    private Calendar dataCalendar; // Atributo de instância 

    private Date dataDate;

    private SimpleDateFormat formatador;

    public TesteData() {
/*
        System.out.println("Testes com datas: ");

        dataCalendar = Calendar.getInstance(); // inicializar

        formatador = new SimpleDateFormat("dd");

        //dataCalendar.set(Calendar.DAY_OF_MONTH, 12);
        //dataCalendar.set(Calendar.YEAR, 1983);
        //dataCalendar.set(Calendar.MONTH, 1);
        String data_formatada = formatador.format(dataCalendar.getTime());

        System.out.println("Data Calendar Formatada: " + data_formatada);

        // DATA DATE // 
        dataDate = new Date();

        //System.out.println(dataDate);
        data_formatada = formatador.format(dataDate);
        System.out.println("Data Date Formatada: " + data_formatada);
        System.out.println("Data java.util.date em milis: " + dataDate.getTime());

        Long diasDate, diasCal;

        diasDate = dataDate.getTime();

        diasCal = dataCalendar.getTimeInMillis();

        Long Resultado = diasDate - diasCal;

        System.out.println("Diferença entre milis: " + Resultado);

        // DIAS DE DIFERENÇA
        Integer diaDate, diaCal;

        diaDate = dataDate.getDate();

        Calendar agora = Calendar.getInstance();

        diaCal = agora.get(Calendar.DAY_OF_MONTH);

        Integer resultado2 = diaCal - diaDate;

        System.out.println("Diferença entre dias: " + resultado2);

        formatador = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Data Date: " + dataDate);

        System.out.println("Data Calendar: " + dataCalendar);

        /*
        O método retorna 0 se o argumento passado for igual a este objeto Calendário.
        O método retorna 1 se o tempo deste objeto Calendário for maior que o objeto passado.
        O método retorna -1 se o tempo deste objeto Calendário for menor que o objeto passado.
         
        System.out.println(dataDate.compareTo(dataCalendar.getTime()));
        */
        Exercicio2();
        //Exercicio3();

    }

    void Exercicio2() {

        String DataCale = "25/09/1983";

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal = Calendar.getInstance();
            cal.setTime(sdf.parse(DataCale));
            System.out.println(DataCale);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    void Exercicio3() {

        String DataDate = "25/09/1983";

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date dataFormatada = formato.parse(DataDate);
            System.out.println(dataFormatada);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new TesteData();
       
        
        
        
    }

}
