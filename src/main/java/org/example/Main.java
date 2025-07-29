package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Supermercado la mayoria");

        //Almacenar en variables la informacion de un producto
        //ID
        //Nombre
        //Precio
        //Cantidad en bodega
        //Caducidad
        //Fecha de vencimiento
        //Fotografia1
        //Fotografia2
        //Descripcion
        //nombreProveedor

        // Si el producto se vence y han pasado 3 dias desde la fecha de vencimiento se debe
        //restar la unidad vencidad a la cantidad en bodega

        //Se debe permmitir registrar n productos en una base de datos simulada en java

        //Se debe permitir modificar el precio unitario de cualquier producto ingresado

        //Se debe permititr eliminar un producto de la bodega
        /*
        ArrayList<String> papelesDelux= new ArrayList<>();
        //agregando elementos a un arreglo
        papelesDelux.add("Papel Higienico familia DELUX X6 unidades");
        papelesDelux.add("Papel Higienico familia DELUX X12 unidades");
        papelesDelux.add("Papel Higienico familia DELUX X24 unidades");
        papelesDelux.add("Papel Higienico familia DELUX X48 unidades");
        System.out.println(papelesDelux.size());*/

        //Trabajando con diccionarios
        /*
        HashMap<String,Object> usuario=new HashMap<>();
        System.out.println(usuario);

        //Agregando Elementos  a un diccionario
        usuario.put("nombres","Leonor de la cruz");
        usuario.put("id","AFJSHSJS");
        usuario.put("edad",23);
        usuario.put("telefono","1231241241231");
        System.out.println(usuario.get("id")); */

        //Uniendo arreglos con diccionarios
       /* ArrayList<Object> estudiantes=new ArrayList<>();
        HashMap<String,Object> estudiante= new HashMap<>();
        estudiante.put("id", "af21313");
        estudiante.put("nombre","Andrea Insignares");
        estudiante.put("Empresa","Globant");
        estudiantes.add(estudiante);
        System.out.println(estudiantes);*/

        //JUGANDO CON FECHAS
        LocalDate fechaInicial =LocalDate.of(1997,12,31);
        LocalDate fechaFinal=LocalDate.now();

        Period diferencia= Period.between(fechaInicial,fechaFinal);

        System.out.println(diferencia.getYears());
        System.out.println(diferencia.getMonths());
        System.out.println(diferencia.getDays());






        }
    }
