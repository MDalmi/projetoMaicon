/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author dalmi
 */
public class Exercicio {

    public Exercicio() {

        Collection<Pessoa> lista2;
        lista2 = new ArrayList<>();

        lista2 = SeiLa();

        imprimePessoa(lista2);

    }

    public Collection<Pessoa> SeiLa() {

        Collection<Pessoa> lista;
        lista = new ArrayList();
        Calendar data = Calendar.getInstance();

        Funcionario f1 = new Funcionario();

        data.set(Calendar.YEAR, 2015);
        data.set(Calendar.MONTH, 3);
        data.set(Calendar.DAY_OF_MONTH, 10);

        f1.setCpf("12354321642");
        f1.setDataNascimento(data);
        f1.setLogradouro("154");
        f1.setNome("DOuglas");
        f1.setNumero(123);
        f1.setPeso(13f);
        f1.setRg("123125");
        f1.setStatus(Boolean.TRUE);

        data.set(Calendar.YEAR, 2015);
        data.set(Calendar.MONTH, 3);
        data.set(Calendar.DAY_OF_MONTH, 10);
        f1.setData_admissao(data);
        f1.setNumero_ctps("123123");
        lista.add(f1);

        Cliente c1 = new Cliente();

        c1.setCpf("12354321642");
        c1.setDataNascimento(data);
        c1.setLogradouro("154");
        c1.setNome("DOuglas");
        c1.setNumero(123);
        c1.setPeso(13f);
        c1.setRg("123125");
        c1.setStatus(Boolean.TRUE);
        data.set(Calendar.YEAR, 2023);
        data.set(Calendar.MONTH, 3);
        data.set(Calendar.DAY_OF_MONTH, 20);
        c1.setData_ultima_compra(data);
        c1.setObservacoes("Produto Caro!");

        lista.add(c1);

        Cliente c2 = new Cliente();

        c2.setCpf("12354321642");
        c2.setDataNascimento(data);
        c2.setLogradouro("154");
        c2.setNome("DOuglas");
        c2.setNumero(123);
        c2.setPeso(13f);
        c2.setRg("123125");
        c2.setStatus(Boolean.TRUE);
        data.set(Calendar.YEAR, 2023);
        data.set(Calendar.MONTH, 5);
        data.set(Calendar.DAY_OF_MONTH, 25);
        c1.setData_ultima_compra(data);
        c1.setObservacoes("Produto Barato!");

        lista.add(c2);

        Aluno a1 = new Aluno();

        a1.setCpf("12354321642");
        a1.setDataNascimento(data);
        a1.setLogradouro("154");
        a1.setNome("DOuglas");
        a1.setNumero(123);
        a1.setPeso(13f);
        a1.setRg("123125");
        a1.setStatus(Boolean.TRUE);
        a1.setNumero_matricula("19231");
        a1.getCoeficiente_rendimento();
        lista.add(a1);

        Aluno a2 = new Aluno();
        a2.setCpf("12354321642");
        a2.setDataNascimento(data);
        a2.setLogradouro("154");
        a2.setNome("DOuglas");
        a2.setNumero(123);
        a2.setPeso(13f);
        a2.setRg("123125");
        a2.setStatus(Boolean.TRUE);
        a2.setNumero_matricula("19231231");
        a2.getCoeficiente_rendimento();
        lista.add(a2);

        return lista;
    }

    public void imprimePessoa(Collection<Pessoa> Mostarr) {

        for (Pessoa p : Mostarr) {

            if (p instanceof Aluno) {

                System.out.println("Aluno ");
                System.out.println("Nome: " + p.getNome());
                System.out.println("Data Nascimento: " + p.getDataNascimento());
                System.out.println("CPF: " + p.getCpf());
                System.out.println("Logradouro" + p.getLogradouro());
                System.out.println("Numero: " + p.getNumero());
                System.out.println("Peso: " + p.getPeso());
                System.out.println("Status: " + p.getStatus());
                System.out.println("RG: " + p.getRg());
                System.err.println("Matricula: " + ((Aluno) p).getNumero_matricula());
                System.err.println("Rendimento: " + ((Aluno) p).getCoeficiente_rendimento());
                System.out.println(" ");

            } else if (p instanceof Funcionario) {

                System.out.println("Funcionario ");
                System.out.println("Nome: " + p.getNome());
                System.out.println("Data Nascimento: " + p.getDataNascimento());
                System.out.println("CPF: " + p.getCpf());
                System.out.println("Logradouro" + p.getLogradouro());
                System.out.println("Numero: " + p.getNumero());
                System.out.println("Peso: " + p.getPeso());
                System.out.println("Status: " + p.getStatus());
                System.out.println("RG: " + p.getRg());
                System.out.println("Numero CTPS: " + ((Funcionario) p).getNumero_ctps());
                System.err.println("Data de Admissao: " + ((Funcionario) p).getData_admissao());
                System.out.println(" ");

            } else if (p instanceof Cliente) {

                System.out.println("Cliente ");
                System.out.println("Nome: " + p.getNome());
                System.out.println("Data Nascimento: " + p.getDataNascimento());
                System.out.println("CPF: " + p.getCpf());
                System.out.println("Logradouro" + p.getLogradouro());
                System.out.println("Numero: " + p.getNumero());
                System.out.println("Peso: " + p.getPeso());
                System.out.println("Status: " + p.getStatus());
                System.out.println("RG: " + p.getRg());
                System.out.println("Data Ultima Compra: " + ((Cliente) p).getData_ultima_compra());
                System.err.println("Observações: " + ((Cliente) p).getObservacoes());
                System.out.println(" ");

            }

        }

    }

    public static void main(String[] args) {

        new Exercicio();

    }

}
