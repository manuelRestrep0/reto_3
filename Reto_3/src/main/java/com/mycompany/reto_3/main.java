/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto_3;
import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class main {
    public static void main(String[] args)
    {
        boolean ejecucion = true;
        while(ejecucion)
        {
            System.out.println("Ingrese el ejercicio que desea realizar:");
            System.out.println("1) 2) 3)");
            Scanner input = new Scanner(System.in);
            if(input.hasNextInt())
            {
                int opcion = input.nextInt();
                switch(opcion)
                {
                    case 1:
                    {
                        ejercicio_1();
                    }
                    case 2:
                    {
                        ejercicio_2();
                    }
                    case 3:
                    {
                        ejercicio_3();
                    }
                    default:
                    {
                        System.out.println("Digite una opción valida");
                    }
                }
            }
            
        }
    }
    static void ejercicio_1()
    {
        System.out.println("Ingrese el numero total de notas que va a ingresar");
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt())
        {
            int n = input.nextInt();
            float mayor=0,menor=0,promedio=0,desviacion=0;
            float[] notas = new float[n];
            for(int i=0;i<=n;i++)
            {
                System.out.println("Ingrese la nota");
                input = new Scanner(System.in);
                if(input.hasNextFloat())
                {
                    notas[i] = input.nextFloat();
                    promedio = promedio + notas[i];
                    if(mayor!=0 && menor!=0)
                    {
                        if(mayor<notas[i])
                            mayor=notas[i];
                        if(menor>notas[i])
                            menor=notas[i];
                     }
                }   
            }
        }
        
        
        
    }
    static void ejercicio_2()
    {
        
    }
    static void ejercicio_3()
    {
        
    }
}
