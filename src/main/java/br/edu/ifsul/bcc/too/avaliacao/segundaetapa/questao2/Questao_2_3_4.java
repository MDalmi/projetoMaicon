/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao2;

import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Cliente;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Orcamento;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Funcionario;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Pessoa;
import br.edu.ifsul.bcc.too.avaliacao.segundaetapa.questao1.model.Veiculo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class Questao_2_3_4 {

    public Questao_2_3_4() {

        List l1 = inicializaListaPessoas();
        
        imprimeListaPessoas(l1);
        
    }

    private List<Pessoa> inicializaListaPessoas() {

        List lista1 = new ArrayList<Pessoa>();
        
        Calendar c = Calendar.getInstance();
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();   
        
        
        c.set(1983, 5, 1);
        c1.set(1999, 10, 20);
        
        Pessoa p1 = new Funcionario("123", c1, null);
        p1.setCep("11111357788");
        p1.setComplemento("apartamento 400");
        p1.setCpf("11111357788");
        p1.setNome("Zé Chaves");
        p1.setData_nascimento(c);
        
        
        lista1.add(p1);
        c2.set(2022, 2, 1);
        Veiculo v1 = new Veiculo("igd1903", "“vectra”", 1997, c2);
        Collection v2 = new ArrayList();
        v2.add(v1);
        
        Pessoa p = new Cliente("cliente paga em dia", v2);
        
       
        p.setCep("11111357788");
        p.setComplemento("apartamento 400");
        p.setCpf("11111357788");
        p.setNome("Zé Chaves");
        p.setData_nascimento(c1);
        
        lista1.add(p);
        
        return lista1;
    }

   // private List<Orcamento> inicializaListaOrcamentos() {

    //}

    private void imprimeListaPessoas(List<Pessoa> lista) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for (Pessoa pessoa : lista) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("\tCPF: " + pessoa.getCep());
            System.out.println("\tData de Nascimento: " + pessoa.getDataNascimentoFormatted());
            System.out.println("\tCEP: " + pessoa.getCep());
            System.out.println("\tComplemento: " + pessoa.getComplemento());

            if (pessoa instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) pessoa;
                System.out.println("\tNúmero CTPS: " + funcionario.getNumero_ctps());
                System.out.println("\tData de Admissão: " + funcionario.getDataNascimentoFormatted());
            } else if (pessoa instanceof Cliente) {
                Cliente cliente = (Cliente) pessoa;
                System.out.println("\tObservações: " + cliente.getObservacoes());
                
                 if (cliente.getVeiculos() != null && !cliente.getVeiculos().isEmpty()) {
                    System.out.println("\tVeículos do Cliente:");
                    for (Veiculo veiculo : cliente.getVeiculos()) {
                        System.out.println("\t\tPlaca: " + veiculo.getPlaca());
                        System.out.println("\t\tModelo: " + veiculo.getModelo());
                        System.out.println("\t\tAno: " + veiculo.getAno());
                        System.out.println("\t\tData Último Serviço: " + veiculo.getDataUltimoServico());
                    }
                }
            }

            System.out.println(); // Adiciona uma linha em branco entre as pessoas
        }
        
    }

    private void imprimeListaOrcamentos(List<Orcamento> lista) {

      
        
    }

    public static void main(String args[]) {

        new Questao_2_3_4();
    }

}
