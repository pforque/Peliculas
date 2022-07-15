/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author pforque
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        peliculas.add(new Pelicula(1,"Origen","Ciencia Ficción",5,"todos"));
        peliculas.add(new Pelicula(2,"Interstellar","Ciencia Ficción",5,"todos"));
        peliculas.add(new Pelicula(3,"Memento","Suspense",5,"todos"));
        peliculas.add(new Pelicula(4,"El club de la lucha","Suspense",5,"+13"));
        peliculas.add(new Pelicula(5,"1917","Bélica",5,"+18"));
        for (int i=0; i<peliculas.size(); i++){
            System.out.println(peliculas.get(i).getTitulo()+" - "+peliculas.get(i).getGenero()+" - "+peliculas.get(i).getRating());
        }
        System.out.println("");
        peliculas.get(0).setTitulo("Pinocho");
        peliculas.get(0).setRating(4);
        peliculas.get(1).setTitulo("Toy Story 3");
        peliculas.get(1).setRating(3);
        for (int i=0; i<peliculas.size(); i++){
            System.out.println(peliculas.get(i).getCodigo()+" - "+peliculas.get(i).getTitulo()+" - "+peliculas.get(i).getGenero()+" - "+peliculas.get(i).getRating()+" - "+peliculas.get(i).getRestriccion());
        }
        System.out.println("");
        for (int i=0; i<peliculas.size(); i++){
            if(peliculas.get(i).getGenero().equals("Suspense")){
                            System.out.println(peliculas.get(i).getCodigo()+" - "+peliculas.get(i).getTitulo()+" - "+peliculas.get(i).getGenero()+" - "+peliculas.get(i).getRating()+" - "+peliculas.get(i).getRestriccion());
            }
        }
    }
}
