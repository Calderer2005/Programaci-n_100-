/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author EAG
 */
public class Cancion {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    
    //CONSTRUCTOR
    public Cancion (String t, String a){
        titulo = t;
        autor = a;
    }
    
    public Cancion(){
        titulo = "";
        autor = "";
    }
    
    //METODOS
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    
    public void setTitulo(String t){
        titulo = t;
    }
    public void setAutor(String a){
        autor = a;
    }
}
