package br.edu.ifsul.bcc.too.topico3.exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Prof. Telmo Júnior
 */
public class Exercicio2 {

    static int[][] rgDados1 = new int[3][3];

    static int[][] rgDados2 = new int[3][3];

    static int[][] rgDados3 = new int[3][3];

    public static void main(String[] args) {

        /*
            1) Com base no código fonte produzido no exercicio 1, 
        implemente um tratamento de exceção para tratar possível erro na conversão de 
               string para integer no comando "Integer.parseInt(sc.next())".
        
               Documentação: https://www.devmedia.com.br/blocos-try-catch/7339
        
       
         */
        Scanner sc = new Scanner(System.in);

        for (int linha = 0; linha < rgDados1.length; linha++) {

            for (int coluna = 0; coluna < rgDados1[linha].length; coluna++) {

                boolean convertido = true;
                do{
                    try{
                        System.out.println("Digite um valor para a posicao ["+linha+"]["+coluna+"] na M1:");
                        if(sc.hasNext()){
                            rgDados1[linha][coluna] = Integer.parseInt(sc.next());
                        }
                        convertido = true;
                        
                    }catch(Exception e){
                        convertido = false;
                    }
                    
                }while(convertido == false);
                
                do{
                    try{
                        System.out.println("Digite um valor para a posicao ["+linha+"]["+coluna+"] na M2:");
                        if(sc.hasNext()){
                            rgDados2[linha][coluna] = Integer.parseInt(sc.next());
                        }
                        convertido = true;
                        
                    }catch(Exception e){
                        convertido = false;
                    }
                    
                }while(convertido == false);
                rgDados3[linha][coluna] = rgDados1[linha][coluna] + rgDados2[linha][coluna];

            }

        }

        for (int linha = 0; linha < rgDados3.length; linha++) {

            for (int coluna = 0; coluna < rgDados3[linha].length; coluna++) {

                System.out.print(rgDados3[linha][coluna] + " ");

            }
            System.out.println("\n");
        }

    }

}


