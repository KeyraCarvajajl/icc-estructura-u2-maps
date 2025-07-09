package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {

    public Mapa() {
    }

    public void ejemploConHashMap() {
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Colombia", "Bogotá");
        capitales.put("Perú", "Lima");

        System.out.println("------Mapa de capitales:-------");
        for (String pais : capitales.keySet()) {
            System.out.println("País: " + pais + ", Capital: " + capitales.get(pais));
        }

        String capital = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: " + capital);

        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3, new Empleado(3, "Pedro", "Tester"));
        empleados.put(1, new Empleado(2, "Ana", "Dev"));
        empleados.put(2, new Empleado(1, "Luis", "Diseñador"));

        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()){
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        Map<Empleado, Integer> empleadoDos = new HashMap<>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(4, "Ana", "Dev");

        empleadoDos.put(emp1, 1000);
        empleadoDos.put(emp2, 1200); 
        empleadoDos.put(emp3, 1500);
        empleadoDos.put(emp4, 2000);

        for (Map.Entry<Empleado, Integer> entry : empleadoDos.entrySet()){
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }

    public void ejemploConLinkedHashMap() {
        Map<String, Integer> productos = new LinkedHashMap<>();
        productos.put("Pan", 10);
        productos.put("Leche", 20);
        productos.put("Huevos", 12);
        productos.put("Queso", 5);
        productos.put("Papa", 15);

        System.out.println("-----Mapa de productos:--------");
        for (String producto : productos.keySet()) {
            System.out.println("Producto: " + producto + " - Cantidad disponible: " + productos.get(producto));
        }
    }

    public void ejemplosConTreeMap() {
        TreeMap<Integer, String> personas = new TreeMap<>();
        personas.put(3, "Ana");
        personas.put(1, "Luis");
        personas.put(2, "Carlos");
        personas.put(4, "Valeria");

        System.out.println("---------Mapa de personas (orden ascendente):---------");
        for (Integer id : personas.keySet()) {
            System.out.println("ID: " + id + " - Nombre: " + personas.get(id));
        }

        System.out.println("Mapa de personas (orden descendente):");
        for (Integer id : personas.descendingKeySet()) {
            System.out.println("ID: " + id + " - Nombre: " + personas.get(id));
        }
    }

    public void metodoComparable() {
        List<Empleado> lista = new ArrayList<>();
        lista.add(new Empleado(3, "Pedro", "Tester"));
        lista.add(new Empleado(1, "Ana", "Dev"));
        lista.add(new Empleado(2, "Luis", "Diseñador"));

        System.out.println("Lista sin ordenar:");
        for (Empleado e : lista) {
            System.out.println(e);
        }

        Collections.sort(lista); 

        System.out.println("Lista ordenada por ID (Comparable):");
        for (Empleado e : lista) {
            System.out.println(e);
        }
    }

}

