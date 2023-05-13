
package br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca;



import br.edu.ifsul.bcc.too.topico4.exercicios.estudocaso_biblioteca.diagramaclasses.Pessoa;
import java.util.Calendar;

public class Biblioteca {
    
    
    Biblioteca(){
        
        
        
        Pessoa p = new Pessoa("313", "215",
                "macie",
                "12", "99955000",
                123, "99960005", 
             Calendar.getInstance() ,  32, null);
        
        System.out.println("CPF: "+p.cpf + " Nome: "+p.nome + " RG: "+p.rg + " Logradouro: "+p.logradouro + " cep: "+p.cep
        + " Numero: "+p.numero + " Telefone: "+p.telefone + " Data Atual: "+p.data_cadastro + " Idade: "+p.idade);
        
      
        
    }
            
    
    public static void main(String args[]){
        /*metódo estático*/
        new Biblioteca();
        
        
    }
    
}
