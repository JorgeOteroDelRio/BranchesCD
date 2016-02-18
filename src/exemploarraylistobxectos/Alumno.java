/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistobxectos;

import java.util.Objects;

/**
 *
 * @author Jota
 */
public class Alumno {
    private String nombre;
    private float nota;
    
    public Alumno(){}
    
    public Alumno(String nombre,float nota){
        this.nombre=nombre;
        this.nota=nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Float.floatToIntBits(this.nota);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.nombre.equals(other.nombre) && this.nota==other.nota;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
    public int compareTo(Object o){
        Alumno obx = (Alumno)o;
        if(this.nombre.compareToIgnoreCase(obx.nombre)==0){
            return 0;
        }else if(this.nombre.compareToIgnoreCase(obx.nombre)>0){
            return 1;
        }else{
            return -1;
        }
    }
    
    public int compareTo(Alumno al){
        if(this.nombre.compareToIgnoreCase(al.nombre)==0){
            return 0;
        }else if(this.nombre.compareToIgnoreCase(al.nombre)>0){
            return 1;
        }else{
            return -1;
        }
    }
    
}
