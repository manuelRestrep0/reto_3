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
        System.out.println("Ingrese las notas separadas por cosas:");
        Scanner input = new Scanner(System.in);
        String notas = input.nextLine();
        String[] arregloNotas = notas.split(",");
        int i=0;
        float mayor=0,menor=0,promedio=0;
        double sumatoria = 0;
        float[] arregloNotasFloat = new float[arregloNotas.length];
        while(i!=(arregloNotas.length))
        {
            arregloNotasFloat[i] = Float.parseFloat(arregloNotas[i]);
            if(arregloNotasFloat[i] >=0 && arregloNotasFloat[i]<=5)
            {
                  promedio = promedio + arregloNotasFloat[i];
                        if(i==0)
                        {
                            mayor=arregloNotasFloat[i];
                            menor=arregloNotasFloat[i];
                            i++;
                            continue;
                        }
                        if(mayor!=0 && menor!=0)
                        {
                            if(mayor<arregloNotasFloat[i])
                                mayor=arregloNotasFloat[i];
                            if(menor>arregloNotasFloat[i])
                                menor=arregloNotasFloat[i];
                            i++;
                        }
            } 
        }
        promedio = promedio/i;
            for(i=0;i<arregloNotasFloat.length;i++)
            {
                sumatoria = sumatoria + Math.pow((arregloNotasFloat[i]-promedio), 2);
            }        
            sumatoria = (Math.sqrt(sumatoria))/(i-1);
            System.out.println("La mayor nota es:"+mayor);
            System.out.println("La menor nota es:"+menor);
            System.err.println("El promedio de las notas es:"+promedio);
            System.err.println("La desviación estandar del conjunto de las nota es:"+sumatoria);
    }
    static void ejercicio_2()
    {
        //cambiar la entrada de los numeros
        System.out.println("Ingrese el numero equivalente al tamano de los vectores");
        double multiplicacion = 0;
        System.out.println("Ingrese el valor numero ");
        float[] vector_1 = recibir_valor();
        System.out.println("Ingrese el valor numero ");
        float[] vector_2 = recibir_valor();
        for(int i=0;i<vector_1.length;i++)
           {
            multiplicacion = multiplicacion + (vector_1[i]*vector_2[i]);
           }
        System.out.println("La multiplicacion escalar de los dos vectores es: "+multiplicacion);   
    }
    static void ejercicio_3()
    {
        /*
        System.out.println("ingrese el vector 1");
        double[] vector_1 = recibir_valor_double();
        System.out.println("ingrese el vector 2");
        double[] vector_2 = recibir_valor_double();
        double[][] vector_final = new double[vector_1.length][vector_2.length];
        if(vector_1.length==vector_2.length)
        {
            for(int i=0;i<vector_1.length;i++)
            {
                for(int j=0;j<vector_2.length;j++)
                {
                    vector_final[i][j] = 
                }
            }
        }*/
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
    static float[] recibir_valor()
    {
        while(true)
        {
            int i = 0;
            Scanner input = new Scanner(System.in);
            String notas = input.nextLine();
            String[] arregloNotas = notas.split(",");
            float[] arregloNotasFloat = new float[arregloNotas.length];
            while(i!=arregloNotasFloat.length)
            {
                arregloNotasFloat[i] = Float.parseFloat(arregloNotas[i]); 
                i++;
            }
            return arregloNotasFloat;
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
