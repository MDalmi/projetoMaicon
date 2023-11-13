/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4_2023;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 *
 * @author dalmi
 */
public class Funcionario extends Pessoa{ // extends criado apartir da herança
    
    private String numero_ctps;
    private Calendar data_admissao;
    
    private Collection<CursoAprimoramento> cursos; // collection criado apartir da agregação

    public Funcionario(String numero_ctps, Calendar data_admissao, Collection<CursoAprimoramento> cursos) {
        this.numero_ctps = numero_ctps;
        this.data_admissao = data_admissao;
        this.cursos = cursos;
    }
    

    public Funcionario() {
    }

    public Funcionario(String numero_ctps, Calendar data_admissao) {
        this.numero_ctps = numero_ctps;
        this.data_admissao = data_admissao;
    }

   
    public void setData_admissao(Calendar data_admissao) {
        this.data_admissao = data_admissao;
    }

    public Calendar getData_admissao() {
        return data_admissao;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setCursos(Collection<CursoAprimoramento> cursos) {
        this.cursos = cursos;
    }

    public Collection<CursoAprimoramento> getCursos() {
        return cursos;
    }

    public void setCurso(CursoAprimoramento curso)
    {
        if (this.cursos == null) {
            this.cursos = new ArrayList();
        }
        this.cursos.add(curso);
            
    }
    
    
    
    
}
