/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.topico4_2023;

/**
 *
 * @author dalmi
 */
public class Foto { 
    
    private Integer codigo;
    private String filename;
    private String path; 
    private Byte[] file;
    //private String base64;
    private Produto produto;

    public Foto() {
    }

    public Foto(Integer codigo, String filename, String path, Byte[] file) {
        this.codigo = codigo;
        this.filename = filename;
        this.path = path;
        this.file = file;
        
    }

  

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setFile(Byte[] file) {
        this.file = file;
    }

    public Byte[] getFile() {
        return file;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
    
    
}
