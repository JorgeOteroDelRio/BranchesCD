/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylistobxectos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Jota
 */
public class GrupoAlumnos {
    private final ArrayList<Alumno> grupo = new ArrayList();
    
    public void engadirAlumno(Alumno alumno){
        grupo.add(alumno);
    }
    
    public void crearLista(){
        Alumno alum1 = new Alumno("Jorge",6.8f);
        grupo.add(alum1);
        grupo.add(new Alumno("Jorge",6.8f));
        grupo.add(new Alumno("Adrián",0.6f));
    }
    
    public void verLista(){
        System.out.println(grupo);
    }
    
    public void verIgual(){
        if(grupo.get(0).equals(grupo.get(1))){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("son distintos");
        }
        System.out.println(grupo.get(0).hashCode() + " " + grupo.get(1).hashCode());
    }
    
    public void borrarAlumno(Alumno alumno){
        grupo.remove(alumno);
    }
    
    public void borrarAlumno(int i){
        grupo.remove(i);
    }
   
    public void ordenar(){
        Collections.sort(grupo,null);
    }
    
    public void holaMundo(){
        System.out.println("Hola mundo");
        System.out.println("Adios mundo");
    }
}
