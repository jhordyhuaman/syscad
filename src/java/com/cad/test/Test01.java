/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cad.test;

import com.cad.dao.AlumnoDAO;
import com.cad.dao.DocenteDAO;
import com.cad.model.Alumno;
import com.cad.model.Docente;
import com.cad.util.Conexion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UPEU
 */
public class Test01 {
    private static AlumnoDAO aO = new AlumnoDAO();
  // private static DocenteDAO aO = new DocenteDAO();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        crear();
    }
    public static void conex(){
        if(Conexion.getConexion()!=null){
            System.out.println("si");
        }else{
            System.out.println("no");
        }    
    }
//    public static void crear(){
//        Docente d = new Docente("Salomon", "yapu", "Doctor");
//        if(aO.create(d)>0){
//            System.out.println("si");
//        }else{
//            System.out.println("no");
//        }
//    }
//    public static void update(){
//        Docente d = new Docente("Salomon", "yapu", "Magister");
//        d.setIddocente(1);
//         if(aO.update(d)>0){
//            System.out.println("si");
//        }else{
//            System.out.println("no");
//        }
//    }
//    public static void eliminar(){
//        int id = 1;
//         if(aO.delete(id)>0){
//            System.out.println("si");
//        }else{
//            System.out.println("no");
//        }
//    }
//    public static void buscar(){
//        Docente x = new Docente();
//        x = aO.buscar(5);
//        System.out.println("Nombres y Apellidos: "+x.getNombres()+" "+x.getApellidos());
//        
//    }
//    public static void listar(){
//    List<Docente> lista = new ArrayList<>();
//    lista = aO.listar();
//    for(int i=0;i<lista.size();i++){
//        System.out.println(lista.get(i).getNombres());
//    }
//    }
    //--------- test -- alumno
    public static void listar_A(){
    List<Alumno> lista = new ArrayList<>();
    lista = aO.listar();
    for(int i=0;i<lista.size();i++){
        System.out.println(lista.get(i).getNombre());
    }
    }
        public static void crear(){
        Alumno d = new Alumno();
        d.setApellido("apellido");
        d.setNombre("nombre");
        d.setTelefono("telfno");
        d.setCorreo("jjhjhjedu");
        if(aO.create(d)>0){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
}