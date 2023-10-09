/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dalmi
 */

/*
2) Com base na classe Questao2 finalize a implementação do método
manipulacaoStrings. Esse método deverá adicionar elementos no mapa
mapDados (atributo da instância). Cada elemento deve conter a informação do
código no formato java.lang.Integer e data no formato java.util.Calendar.

 */
public class Questao2 {

    private Map<Integer, java.util.Calendar> mapDados = new HashMap<>();
    private String dadosString = "{codigo:10, data:'2022-01-31'}; {codigo:20, data:'1999-10-1'};{codigo:30, data:'1994-06-15'}";

    public Questao2() {

        manipulacaoStrings();
        mostrarString();
    }

    private void manipulacaoStrings() {

        Calendar cal = Calendar.getInstance();
        String d[] = dadosString.split(";");
        int i = 0;

        while (i < d.length) {

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            try {

                String codigo = d[i].substring(d[i].indexOf(":") + 1, d[i].indexOf(",")).trim();

                Integer numero = Integer.parseInt(codigo);

                String data = d[i].substring(d[i].indexOf(":",
                        d[i].indexOf(",")) + 2, d[i].indexOf("'}"));

                cal.setTime(formato.parse(data));

               
                    
                    mapDados.put(numero, cal);
                    
                
                

            } catch (ParseException e) {

            }

            i++;
        }

    }

    /*
    2.1) Com base no código fonte da questão 2, codifique um novo método para
        imprimir na saída padrão todos elementos do mapa mapDados (atributo da
    instância). Cada impressão deve conter a chave e a data no formato
    dd/mm/yyyy. Esse método deverá ser chamado no construtor, após a
    chamada do método manipulacaoStrings
     */
    public void mostrarString() {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar data = Calendar.getInstance();

        for (Map.Entry<Integer, Calendar> m : mapDados.entrySet()) {

            data = m.getValue();
            String data_formatada = formato.format(data.getTime());
            Integer key = m.getKey();

            System.out.println("Codigo: " + key + " Data: " + data_formatada);

            System.out.println(m.getValue());

        }

    }

    public static void main(String args[]) {
        new Questao2();
    }

}
