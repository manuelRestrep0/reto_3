/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto_3;
import java.util.Scanner;
import java.util.Arrays;

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
            System.out.println("1) 2) 3) o 4) para dejar de ejecutar");
            Scanner input = new Scanner(System.in);
            if(input.hasNextInt())
            {
                int opcion = input.nextInt();
                switch(opcion)
                {
                    case 1:
                    {
                        ejercicio_1();
                        continue;
                    }
                    case 2:
                    {
                        ejercicio_2();
                        continue;
                    }
                    case 3:
                    {
                        ejercicio_3();
                        continue;
                    }
                    case 4:
                    {
                        ejecucion=false;
                        System.out.println("Adios");
                        continue;
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
            double sumatoria = 0;
            float[] notas = new float[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Ingrese la nota");
                input = new Scanner(System.in);
                if(input.hasNextFloat())
                {
                    notas[i] = input.nextFloat();
                    if(notas[i]>=0 && notas[i]<=5)
                    {
                        promedio = promedio + notas[i];
                        if(i==0)
                        {
                            mayor=notas[i];
                            menor=notas[i];
                            continue;
                        }
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
            System.out.println(Arrays.toString(notas));
            promedio = promedio/n; 
            for(int i=0;i<n;i++)
            {
                sumatoria = sumatoria + Math.pow((notas[i]-promedio), 2);   //no da
            }
            sumatoria = (Math.sqrt(sumatoria))/(n-1);
            System.out.println("La mayor nota es:"+mayor);
            System.out.println("La menor nota es:"+menor);
            System.err.println("El promedio de las notas es:"+promedio);
            System.err.println("La desviación estandar del conjunto de las nota es:"+sumatoria);
        }  
    }
    static void ejercicio_2()
    {
        System.out.println("Ingrese el numero equivalente al tamano de los vectores");
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt())
        {
            int n = input.nextInt();
            double multiplicacion = 0;
            float[] vector_1 = new float[n];
            float[] vector_2 = new float[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Ingrese el valor numero "+(i+1)+" del vector numero 1");
                vector_1[i] = recibir_valor();
                System.out.println("Ingrese el valor numero "+(i+1)+" del vector numero 2");
                vector_2[i] = recibir_valor();
                multiplicacion = multiplicacion + (vector_1[i]*vector_2[i]);
            }
            System.out.println("La multiplicacion escalar de los dos vectores es: "+multiplicacion);
        }
        
    }
    static void ejercicio_3()
    {
        System.out.println("Ingrese el numero n");
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt())
        {
            int n = input.nextInt();
            System.out.println("Ingrese el numero m");
            input = new Scanner(System.in);
            if(input.hasNextInt())
            {
                int m = input.nextInt();
                double[][] matriz = new double[n][m];
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        matriz[i][j] = recibir_valor_double();
                    }
                }
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<m;j++)
                    {
                        System.out.print(matriz[i][j]+" ");
                    }
                    System.out.println("");
                }
            }
            
        }
        
    }
    static float recibir_valor()
    {
        while(true)
        {
            Scanner input = new Scanner(System.in);
            if(input.hasNextFloat())
            {
                float valor = input.nextFloat();
                return valor;
            }
            else
               System.out.println("Ingrese un valor valido");
        }      
    }
    static double recibir_valor_double()
    {
        while(true)
        {
            System.out.println("Digite el valor");
            Scanner input = new Scanner(System.in);
            if(input.hasNextDouble())
            {
                double valor = input.nextDouble();
                return valor;
            }
            else
               System.out.println("Ingrese un valor valido");
        }      
    }
}
