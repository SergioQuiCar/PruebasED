
package com.mycompany.pruebased;

import java.util.Scanner;

class Asignatura 
{
    Scanner teclado = new Scanner(System.in);
    String nombre;
    int temas;
    String nombrestemas[];
    
    Asignatura(String nombre, int temas)
    {
        this.nombre = nombre;
        this.temas = temas;
        this.nombrestemas = new String[temas];
    }
    
    void setNombres()
    {
        for (int i = 0; i < temas; i++) 
        {
            System.out.println("Introduce el nombre del tema: " + (i+1));
            this.nombrestemas[i] = teclado.nextLine();
        }
    }
    
    void ver_datos()
    {
        System.out.println("Nombre asignatura: " + this.nombre);
        System.out.println("Número de temas: " + this.temas);
        for (int i = 0; i < nombrestemas.length; i++) 
        {
            System.out.println("Tema" + (i+1) + ":" + nombrestemas[i]);
        }
    }
}

public class PrincipalGIT 
{

    
    public static void main(String[] args) 
    {
        System.out.println("Hello World");
        
        Asignatura entornos = new Asignatura("Entornos",2);
        
        entornos.setNombres();
        
        entornos.ver_datos();
    }
    
}
